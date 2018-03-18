package com.jrh.locals.data.service;

import com.jrh.locals.data.model.Post;
import com.jrh.locals.data.model.User;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    private static List<User> users = new ArrayList<>();
    private static List<Post> posts = new ArrayList<>();


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

    private SecureRandom random = new SecureRandom();

    public Post addPost(String submittedBy, Post post) {
        User user = getUserByName(submittedBy);

        if (user == null) {
            return null;
        }

        /*
        String randomId = UUID.randomUUID().toString();
        post.setId(randomId);
        */

        return post;
    }

    public List<User> getUsers() {
        return users;
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

//        User user1 = new User("jon", );
//
//        User user2 = new User(2, "Jane Doe", 2,
//                new ArrayList<>(Arrays.asList(post2, post3)));
//
//        User user3 = new User(3, "Test Ing",3,
//                new ArrayList<>(Arrays.asList(post4)));
//
//        User user4 = new User(4, "Ran Dom", 4,
//                new ArrayList<>(Arrays.asList()));
//
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//        users.add(user4);



    }
}