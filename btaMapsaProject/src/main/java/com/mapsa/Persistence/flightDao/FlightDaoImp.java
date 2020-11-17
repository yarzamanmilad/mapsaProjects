package com.mapsa.Persistence.flightDao;

import com.mapsa.models.Flight;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class FlightDaoImp implements IFlightDao {
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public boolean create(Flight flight) {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery("");
        return false;
    }

    @Override
    public boolean delete(Flight flight) {
        return false;
    }

    @Override
    public Flight findById(long id) {
        return null;
    }

    @Override
    public List<Flight> getFlightList() {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery("from Flight");
        List<Flight> flightList=query.list();
        session.flush();
        return flightList;
    }
}
