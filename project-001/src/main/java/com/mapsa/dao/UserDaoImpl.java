package com.mapsa.dao;

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
public class UserDaoImpl implements UserDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<User> findAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from User");
        List<User> userList = query.list();
        session.flush();
        return userList;
    }

    @Override
    public User getUserById(int id) {
        Session session = sessionFactory.getCurrentSession();
        User user = (User)session.get(User.class, id);
        session.flush();
        return user;
    }

    @Override
    public void addUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
        session.flush();
    }

    @Override
    public void editeUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
        session.flush();
    }

    @Override
    public void delete(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(user);
        session.flush();
    }
}
