package com.jrh.locals.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String username;
    private String email;
    private int karma;

    public User(int id, String username, String email, int karma) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.karma = karma;
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

    public String getEmail() {
        return username;
    }

    public void setEmail(String name) {
        this.username = name;
    }

    public int getKarma() {
        return karma;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }


    @Override
    public String toString() {
        return String.format(
                "Student [id=%s, username=%s, email=%s, karma=%s]", id,
                username, email, karma);
    }
}