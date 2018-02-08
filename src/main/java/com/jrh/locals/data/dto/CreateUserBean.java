package com.jrh.locals.data.dto;

public class CreateUserBean {

    private int id;
    private String username;
    private String password;
    private String email;

    public CreateUserBean(int id, String username, String password, String email) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String name) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String name) {
        this.password = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email= email;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "UpdateUserBean [id=" + id + ", name=" + username +
                ", password=" + password +  " email=" + email + "]";
    }
}
