package com.demo.springjpa.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User {
    
    @Id
    private Integer id;

    private String firstname;

    private String lastname;

    // @ManyToOne will create a column called location_id
    @ManyToOne
    private Location location;

    private String email;

    public User() {
    }

    public User(Integer id, String firstname, String lastname, Location location, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.location = location;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

}