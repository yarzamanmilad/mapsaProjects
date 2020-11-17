package com.mapsa.dao;


import com.mapsa.model.AirlineList;

import java.util.List;

public interface AirlineListDao {
    List<AirlineList> findAllAirlineList();
    AirlineList getAirlineListById(long id);
    void addAirlineList(AirlineList airlineList);

    void editeAirlineList(AirlineList airlineList);

    void delete(AirlineList airlineList);





}
