package org.launchcode.spaday.models;

import java.util.Date;
import java.util.Objects;

public class User {
    private String username;
    private String email;
    private String password;
    private Date dateCreated;
    private int id;
    private int nextId = 1;

    public User() {
        this.id = nextId;
        nextId++;
        this.dateCreated = new Date();
    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

}
