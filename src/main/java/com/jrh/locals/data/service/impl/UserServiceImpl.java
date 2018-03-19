package com.jrh.locals.data.service.impl;

import com.jrh.locals.data.model.Post;
import com.jrh.locals.data.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.jrh.locals.data.repository.UserRepository;
import com.jrh.locals.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class UserServiceImpl implements UserService {
    private static List<User> users = new ArrayList<>();
    private static List<Post> posts = new ArrayList<>();
    @Autowired
    private UserRepository userRepository;


    static {
        //Initialize Users and Posts
        initialize();
    }

    public List<User> retrieveAllUsers() {
        return users;
    }

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

    public List<Post> getPosts() {
        return posts;
    }

    public List<Post> getPostsByUsername(String username) {

        User user = getUserByName(username);

        if (user == null) {
            throw new RuntimeException("User not found");
        }
        return null;
    }

    public @ResponseBody
    Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    private static void initialize() {


        String randomId = UUID.randomUUID().toString();

        /*
        Post post1 = new Post(randomId, "Test Post 1", "<insert_text1_here>",
                Arrays.asList("child-post-id-1", "child-post-id-2"));

        randomId = UUID.randomUUID().toString();
        Post post2 = new Post(randomId, "Testing Post 2", "<insert_text2_here>",
                Arrays.asList("child-post-1", "child-post-2", "child-post-3"));


        randomId = UUID.randomUUID().toString();
        Post post3 = new Post(randomId, "Test Post 3", "insert-text3-here",
                Arrays.asList());

        randomId = UUID.randomUUID().toString();
        Post post4 = new Post(randomId, "Test Post 4", "<text>",
                Arrays.asList("id-1", "id-2"));
        */

        Post post1 = new Post("a", "b", 1);

        randomId = UUID.randomUUID().toString();
        Post post2 = new Post("a", "b", 1);


        randomId = UUID.randomUUID().toString();
        Post post3 = new Post("a", "b", 1);

        randomId = UUID.randomUUID().toString();
        Post post4 = new Post("a", "b", 1);

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);
    }

}
