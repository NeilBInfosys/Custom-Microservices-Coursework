package com.example.mt_order_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mt_order_service.entity.Order;
import com.example.mt_order_service.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Get all orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Get a specific order by ID
    public Optional<Order> getOrderById(int id) {
        return orderRepository.findById(id);
    }

    // Create a new order
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    // Update an existing order
    public Order updateOrder(int id, Order order) {
        if (orderRepository.existsById(id)) {
            order.setId(id);
            return orderRepository.save(order);
        } else {
            return null; // Or throw exception if needed
        }
    }

    // Delete an order by ID
    public boolean deleteOrder(int id) {
        if (orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}