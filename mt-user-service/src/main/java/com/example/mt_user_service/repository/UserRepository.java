package com.example.mt_user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mt_user_service.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods (if needed) can be added here
}