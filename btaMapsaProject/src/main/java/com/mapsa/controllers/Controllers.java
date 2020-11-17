package com.mapsa.controllers;

import com.mapsa.Persistence.flightDao.FlightDaoImp;
import com.mapsa.Persistence.flightDao.IFlightDao;
import com.mapsa.models.Flight;
import com.mapsa.services.FlightServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Controllers {

   @Autowired
   // FlightServices flightServices;
          IFlightDao iFlightDao;
    @RequestMapping(value = "/")
    public String index(){
       List<Flight>  flightList=iFlightDao.getFlightList();
        System.out.println(flightList.size());
      /*  if(flightServices.getFlightList().size()>0)
             System.out.println(flightServices.getFlightList().get(0).getId());
        else
             System.out.println("flights list is empty");
      */ // flightServices.print();
        return "index";
    }
}
