package com.mapsa.Persistence.flightDao;

import com.mapsa.models.Flight;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IFlightDao {
    public boolean create(Flight flight);
    public boolean delete(Flight flight);
    public Flight findById(long id);
    public List<Flight> getFlightList();

}
