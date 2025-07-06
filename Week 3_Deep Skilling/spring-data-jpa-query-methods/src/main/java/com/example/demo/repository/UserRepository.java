package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);
    List<User> findByEmailContaining(String keyword);
    List<User> findByAgeGreaterThanEqual(int age);
    List<User> findByNameAndAge(String name, int age);
}
