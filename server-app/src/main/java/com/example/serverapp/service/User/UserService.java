package com.example.serverapp.service.User;

import com.example.serverapp.data.Request;
import com.example.serverapp.domain.User;
import com.example.serverapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public  User save(Request request){
        User user=User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName()).build();
        return userRepository.save(user);
    }

    public List<User> findAllUser() {
        return userRepository.findAll();
    }
}
