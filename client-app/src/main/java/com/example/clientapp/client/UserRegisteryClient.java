package com.example.clientapp.client;

import com.example.clientapp.client.data.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisteryClient {
 @Value("${uri.register}")
    String uri;
    RestTemplate restTemplate;
    public List<User> users(){
         restTemplate=new RestTemplate();
        System.out.println("users call1"+uri);
        ResponseEntity<List<User>> listResponseEntity=restTemplate.exchange(uri,
                HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {
                });
        System.out.println("users call2");
        List<User> users=listResponseEntity.getBody();
        System.out.println("users call3");
        return users;
    }
    public User save(User user) throws URISyntaxException {
        System.out.println("save call");
        restTemplate=new RestTemplate();
        URI urinet=new URI(uri);
        System.out.println("save call1");
        HttpHeaders httpHeaders= new HttpHeaders();
        System.out.println("save call2");
        httpHeaders.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        System.out.println("save call3");
        HttpEntity<User> request=new HttpEntity<>(user,httpHeaders);
        System.out.println("save call4");
    User userResponseEntity=restTemplate.postForEntity(urinet,request,User.class).getBody();

        System.out.println("save call5");
        return userResponseEntity;
    }
}
