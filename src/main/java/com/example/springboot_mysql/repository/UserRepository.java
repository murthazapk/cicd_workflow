package com.example.springboot_mysql.repository;

import com.example.springboot_mysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}