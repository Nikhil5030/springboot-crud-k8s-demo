package com.example.springboot.crud.k8s.controller;

import com.example.springboot.crud.k8s.entity.Order;
import com.example.springboot.crud.k8s.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/order")
    public ResponseEntity<Order> postOrder(@RequestBody Order order){
        Order newOrder=orderService.saveOrder(order);
        return new ResponseEntity<>(newOrder, HttpStatus.OK);
    }

    @GetMapping("/getAllOrders")
    public List<Order> allOrders(){
        return orderService.getOrders();
    }

    @GetMapping("/orderById/{id}")
    public ResponseEntity<Order> getById(@PathVariable Long id){
        return new ResponseEntity<>(orderService.orderById(id), HttpStatus.OK);
    }

}
