package com.example.mt_product_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mt_product_service.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
