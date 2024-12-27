package com.example.mt_product_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mt_product_service.entity.Product;
import com.example.mt_product_service.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Get a product by ID
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // Create a new product
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    // Update a product
    public Product updateProduct(Long id, Product productDetails) {
        if (productRepository.existsById(id)) {
            productDetails.setId(id);
            return productRepository.save(productDetails);
        } else {
            return null; // Or throw an exception
        }
    }

    // Delete a product
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}