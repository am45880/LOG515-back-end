package com.findr.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Rachid, Mohamed Yassine on 2017-03-20.
 */
@Document(collection = "Users")
public class User {

    @Id
    private String email;
    private String firstName;
    private String lastName;
    private String sex;
    private String interested;
    private String snapchat;
    private String phone;
    private String age ;
    private String description ;

//    public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();
    private String password;

    public User( String firstName, String lastName, String sex, String interested,String snapchat,String email, String phone, String age, String description, String password) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.interested = interested;
        this.snapchat = snapchat;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sexe) {
        this.sex = sexe;
    }

    public String getInterested() {
        return interested;
    }

    public void setInterested(String interested) {
        this.interested = interested;
    }

    public String getSnapchat() {
        return snapchat;
    }

    public void setSnapchat(String snapchat) {
        this.snapchat = snapchat;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
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
//        this.password = PASSWORD_ENCODER.encode(password);
        this.password = password;
    }
}
