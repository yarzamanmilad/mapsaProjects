package com.mapsa.controller;

import com.mapsa.dao.UserDao;
import com.mapsa.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
//import java.util.logging.Logger;

@Controller
public class HelloController {

//    private static final Logger logger = Logger.getLogger(HelloController.class.getName());

    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private UserDao userDao;

    @RequestMapping("/")
    public String index(){
        userDao.findAllUsers();
        return "index";
    }

    @RequestMapping("/users")
    public String users(Model model){
      try {
          List<User> users = userDao.findAllUsers() ;
          model.addAttribute("users",users.get(0));
//        log.info("users" + users);

      } catch (Exception ex){
          logger.error("connection ..."+ ex);
      }
        return "users";

    }
}
