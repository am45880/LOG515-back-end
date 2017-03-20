package com.findr.model;

/**
 * Created by Rachid, Mohamed Yassine on 2017-03-20.
 */
public class User {
    private String firstName;
    private String lastName;
    private String sexe;
    private String intererested;
    private String email;
    private String phone;
    private int age ;
    private String description ;
    private String password ;

    public User(String firstName, String lastName, String sexe, String intererested, String email, String phone, int age, String description, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sexe = sexe;
        this.intererested = intererested;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.description = description;
        this.password = password;
    }

    public User() {
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

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getIntererested() {
        return intererested;
    }

    public void setIntererested(String intererested) {
        this.intererested = intererested;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
