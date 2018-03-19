package com.jrh.locals.data.service.impl;

import com.jrh.locals.data.model.Post;
import com.jrh.locals.data.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.jrh.locals.data.repository.UserRepository;
import com.jrh.locals.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class UserServiceImpl implements UserService {
    private static List<User> users = new ArrayList<>();
    private static List<Post> posts = new ArrayList<>();

    @Autowired
    private UserRepository userRepository;

    public User addUser(String username) {
        int id = users.size();
        User newUser = new User(id, username, "", 0);

        return newUser;
    }

    public User getUserByName(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public @ResponseBody
    Iterable<User> getUsers() {
        return userRepository.findAll();
    }

}
