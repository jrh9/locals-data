package com.jrh.locals.data.model;

import java.util.List;

public class User {
    private int id;
    private String username;
    private int karma;
    private List<Post> posts;

    public User(int id, String name, int karma,
                   List<Post> posts) {
        super();
        this.id = id;
        this.username = name;
        this.karma = karma;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public int getKarma() {
        return karma;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }


    @Override
    public String toString() {
        return String.format(
                "Student [id=%s, username=%s, karma=%s, Posts=%s]", id,
                username, karma, posts);
    }
}