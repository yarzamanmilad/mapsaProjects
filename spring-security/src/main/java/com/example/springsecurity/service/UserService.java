package com.example.springsecurity.service;

import com.example.springsecurity.data.jwt.Request;
import com.example.springsecurity.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    PasswordEncoder passwordEncoder;
    public User save(Request request){
        User user=User.builder().userName(request.getUserName())
                .password(passwordEncoder.encode(request.getPassword())).build();
        return user;
    }
}
