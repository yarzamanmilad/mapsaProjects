package com.mapsa.bta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllers {
    @RequestMapping("/")
    public String index(){

        return "index";
    }
}