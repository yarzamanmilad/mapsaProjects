package com.example.firstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplatController {
@RequestMapping(value = "/index")
    public String index(Model model)
{
    User user=new User("milad","123456789");
    User user1=new User("milad1","987654321");
    model.addAttribute("userdata",new User());
    return "index";
}

@RequestMapping(value ="/login" )
    public String login(@ModelAttribute("userdata") User user)
{
    System.out.println(user.getUsername());
    return "redirect:index";
}
}
