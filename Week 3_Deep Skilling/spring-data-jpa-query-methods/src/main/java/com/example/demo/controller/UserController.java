package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/name/{name}")
    public List<User> getByName(@PathVariable String name) {
        return userRepository.findByName(name);
    }

    @GetMapping("/email/contains/{keyword}")
    public List<User> getByEmailKeyword(@PathVariable String keyword) {
        return userRepository.findByEmailContaining(keyword);
    }

    @GetMapping("/age/{age}")
    public List<User> getByAgeGreater(@PathVariable int age) {
        return userRepository.findByAgeGreaterThanEqual(age);
    }

    @GetMapping("/search")
    public List<User> getByNameAndAge(@RequestParam String name, @RequestParam int age) {
        return userRepository.findByNameAndAge(name, age);
    }
}
