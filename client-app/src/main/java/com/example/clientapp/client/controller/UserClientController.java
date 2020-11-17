package com.example.clientapp.client.controller;

import com.example.clientapp.client.UserRegisteryClient;
import com.example.clientapp.client.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("client")
public class UserClientController {
    @Autowired
    UserRegisteryClient userRegisteryClient;

    @GetMapping
    public ResponseEntity<List<User>> user(){
        return ResponseEntity.ok(userRegisteryClient.users());
    }
    @PostMapping
    public ResponseEntity<User> reg(@RequestBody User user) throws URISyntaxException {
        return  ResponseEntity.ok(userRegisteryClient.save(user));
    }
}
