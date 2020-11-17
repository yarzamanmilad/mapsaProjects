package com.mapsa.dao;

import com.mapsa.model.AirlineList;
import com.mapsa.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class AirlineListDaoImpl implements AirlineListDao {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<AirlineList> findAllAirlineList() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from AirlineList");
        List<AirlineList> airlineLists = query.list();
        session.flush();
        return airlineLists;

    }

    @Override
    public AirlineList getAirlineListById(long id) {
        Session session = sessionFactory.getCurrentSession();
        AirlineList airlineList = (AirlineList)session.get(AirlineList.class, id);
        session.flush();
        return airlineList;

    }

    @Override
    public void addAirlineList(AirlineList airlineList) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(airlineList);
        session.flush();

    }

    @Override
    public void editeAirlineList(AirlineList airlineList) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(airlineList);
        session.flush();

    }

    @Override
    public void delete(AirlineList airlineList) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(airlineList);
        session.flush();

    }


}
