package com.example.mt_order_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mt_order_service.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    // You can add custom query methods if needed
    // For example:
    // List<Order> findByUserId(int userId);
}