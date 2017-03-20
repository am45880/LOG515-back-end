package com.findr.controllers;

import com.findr.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yassine on 2017-03-20.
 */
@RestController
public class Users {

    @RequestMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public User[] getUser(){

        User utilisateur1 =
                new User("Caroline","leblanc","F","M","caro@gmail.com","514 236 9823",
                        28,"I am beautiful girl looking for nice men.","secret123");
        User utilisateur2 =
                new User("George","Tremblay","M","F","George@gmail.com","514 233 0983",
                        23,"Looking for nice women.","secret123");
        User utilisateur3 =
                new User("Kreg","Jiga","M","F","Kregy11@gmail.com","514 233 0233",
                        25,"Looking for nice women.","secret123");
        User utilisateur4 =
                new User("Zac","Lacroche","M","F","lacromi@gmail.com","514 223 3243",
                        25,"Looking for nice women.","secret123");
        User utilisateur5 =
                new User("Maitre","Yoda","M","F","yoda@gmail.com","XER 2K3 3243",
                        25,"Looking for nice women.","secret123");

        User[] users= {utilisateur1,utilisateur2,utilisateur3,utilisateur4,utilisateur5};

        return users;
    }
}
