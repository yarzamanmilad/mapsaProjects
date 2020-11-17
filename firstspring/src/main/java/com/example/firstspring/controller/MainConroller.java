package com.example.firstspring.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainConroller {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String secandRest()
    {
        return "RequestMappingGet";
    }
    @GetMapping
    public String GetRest()
    {
        return "GetRequest";
    }

    @RequestMapping(value = "/{username}/{password}",method = RequestMethod.POST)
    public String  postMappingPathVariable(@PathVariable(value = "username") String Username
            ,@PathVariable(value = "password") String Password)
    {

        return "postMappingPathVariable"+Username;
    }


    @RequestMapping(value = "/")
    public String  postMappingQueryParam(@RequestParam(value = "username") String Username
            ,@RequestParam(value = "password") String Password)
    {

        return "postMappingQueryParam"+Username;
    }

    @RequestMapping(value = "/body")
    public String requestBody(@RequestBody User user)
    {
        return user.getUsername()+"  "+user.getPassword();
        //return user;
    }
    @RequestMapping(value = "/json")
    public String requestJson()
    {
        User user=new User("milad","resfzm1370");
        return new Gson().toJson(user);
    }
}
