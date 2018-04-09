package com.jrh.locals.data.service;

import com.jrh.locals.data.dao.UserDao;
import com.jrh.locals.data.model.User;

public interface UserService {

    public Iterable<User> getUsers();

    public User addUser(String userJson) throws Exception;

    public User getUserByName(String username);

    public User getUserById(int id);

}