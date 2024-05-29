package com.example.springboot.crud.k8s.repository;

import com.example.springboot.crud.k8s.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
