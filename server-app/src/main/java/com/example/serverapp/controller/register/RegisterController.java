package com.example.serverapp.controller.register;

import com.example.serverapp.data.Request;
import com.example.serverapp.data.Response;
import com.example.serverapp.domain.User;
import com.example.serverapp.repository.UserRepository;
import com.example.serverapp.service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("register")
public class RegisterController {
    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity< User> register(@RequestBody Request request){
        System.out.println("call post server");
        return ResponseEntity.ok(userService.save(request));
    }
    @GetMapping
    public ResponseEntity<List<User>> users(){
        return ResponseEntity.ok(userService.findAllUser());
    }
}
