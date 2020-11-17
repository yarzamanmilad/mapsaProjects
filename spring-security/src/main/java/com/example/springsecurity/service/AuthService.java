package com.example.springsecurity.service;

import com.example.springsecurity.data.jwt.Request;
import com.example.springsecurity.data.jwt.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    UserDetailService userDetailService;
    public Response createService(Request request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUserName(),request.getPassword()));
        UserDetails userDetails=userDetailService.loadUserByUsername(request.getUserName());

    }


}
