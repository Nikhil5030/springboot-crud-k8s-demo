package com.example.springboot.crud.k8s.service;

import com.example.springboot.crud.k8s.entity.Order;
import com.example.springboot.crud.k8s.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order saveOrder(Order order){
       return orderRepository.save(order);
    }

    public List<Order> getOrders(){
        return orderRepository.findAll();
    }

    public Order orderById(Long id){
       return orderRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid Id:"+id));
    }
}
