package com.mapsa.controller;

import com.mapsa.dao.AirlineListDao;
import com.mapsa.model.AirlineList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class HelloControllerAirlineList {
    @Autowired
    private AirlineListDao airlineListDao;
    @RequestMapping("/")
    public String index() {
        airlineListDao.findAllAirlineList();
        return "index";

    }
    @RequestMapping("/airlineList")
    public String airlineLists(Model model){
        try {
            List<AirlineList> airlineLists = airlineListDao.findAllAirlineList() ;
            model.addAttribute("airlineLists",airlineLists.get(0));
        } catch (Exception ex){
        System.out.println(ex);

        }
        return "AirlineList";

    }
}