package com.jrh.locals.data.service;

import com.jrh.locals.data.model.Post;
import com.jrh.locals.data.model.User;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.jrh.locals.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public interface UserService {


    public List<User> retrieveAllUsers();

    public User addUser(String username);

    public User getUserByName(String username);

    public User getUserById(int id);

    public Iterable<User> getUsers();
}