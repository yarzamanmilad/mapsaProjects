package com.mapsa.controller;

import com.mapsa.dao.UserDao;
import com.mapsa.model.User;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.File;
import java.lang.reflect.Field;
import java.text.Format;
import java.util.List;
//import java.util.logging.Logger;

@Controller
public class HelloControllerUser {

//    private static final Logger logger = Logger.getLogger(HelloController.class.getName());

  //  Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private UserDao userDao;

//    @RequestMapping("/")
//    public String index(){
//        userDao.findAllUsers();
//        return "index";
//    }

    @RequestMapping("/users")
    public String users(Model model){
        try {
            List<User> users = userDao.findAllUsers() ;
            System.out.println(">>>"+users.get(0).getFirstName());
            model.addAttribute("users",users.get(0));
//        log.info("users" + users);

        } catch (Exception ex){
            System.out.println(ex);
         //   logger.error("connection ..."+ ex);
        }
        return "users";

    }
    public void update(User user){
        Table table=user.getClass().getDeclaredAnnotation(Table.class );
        String query ="UPDATE"+table.name()+"SET";
        Field[] fields=user.getClass().getDeclaredFields();
        for (Field field:fields){
            field.setAccessible( true );
            Id id=field.getDeclaredAnnotation(Id.class);
            Column column=field.getDeclaredAnnotation(Column.class);
            if(column!=null){
                try {
                    query+=column.name()+"="+field.get(user);


                }catch (IllegalAccessException e){
                    e.printStackTrace();
                }
            }
        }


    }

}
