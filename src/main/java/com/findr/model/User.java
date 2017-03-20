package com.findr.model;

/**
 * Created by Rachid, Mohamed Yassine on 2017-03-20.
 */
public class User {
    private String firstName;
    private String lastName;
    
    
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}