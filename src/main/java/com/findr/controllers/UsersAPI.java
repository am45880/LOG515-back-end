package com.findr.controllers;
import com.findr.model.User;
import com.findr.repositories.UserRepo;
import com.findr.util.UsersGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yassine on 2017-03-20.
 */
@RestController
@RequestMapping("/")
public class UsersAPI {

    @Autowired
    private UserRepo userRepo;

    @RequestMapping
    @CrossOrigin(origins = "*")
    public List<User> getUser(){

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

        List<User> users = new ArrayList<User>();

        users.add(utilisateur1);
        users.add(utilisateur2);
        users.add(utilisateur3);
        users.add(utilisateur4);
        users.add(utilisateur5);

        return users;
    }

    @RequestMapping("/create")
    @CrossOrigin(origins = "*")
    public String creatUsers(){
        UsersGenerator usersGenerator = new UsersGenerator();
        usersGenerator.createFiveUser();
        return "The users have been created.";
    }
}
