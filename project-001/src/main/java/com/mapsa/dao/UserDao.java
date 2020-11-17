package com.mapsa.dao;

import com.mapsa.model.User;

import java.util.List;

public interface UserDao {

    List<User> findAllUsers();

    User getUserById(int id);

    void addUser(User user);

    void editeUser(User user);

    void delete(User user);
}
