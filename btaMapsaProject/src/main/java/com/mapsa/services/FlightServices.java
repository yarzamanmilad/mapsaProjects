package com.mapsa.services;

import com.mapsa.Persistence.flightDao.FlightDaoImp;
import com.mapsa.Persistence.flightDao.IFlightDao;
import com.mapsa.models.Flight;
import com.mapsa.services.annotation.FlightServicsAnnot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlightServices {
    @Autowired
    IFlightDao flightDaoImp;
    public List<Flight> getFlightList(){
        return flightDaoImp.getFlightList();
    }

    public void print(){
        System.out.println("is running");
    }
}
