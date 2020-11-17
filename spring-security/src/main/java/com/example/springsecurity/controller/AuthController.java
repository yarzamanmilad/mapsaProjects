package com.example.springsecurity.controller;

import com.example.springsecurity.data.jwt.Request;
import com.example.springsecurity.data.jwt.Response;
import com.example.springsecurity.domain.User;
import com.example.springsecurity.repository.UserRepository;
import com.example.springsecurity.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    AuthService authService;
    @PostMapping("/register")
    public ResponseEntity<User> save(@RequestBody User user){
        return ResponseEntity.ok(userRepository.save(user));
    }
    @PostMapping("/auth")
    public ResponseEntity<Response> createToken(@RequestBody Request request){
        return ResponseEntity.ok(authService.createService());
    }

}
