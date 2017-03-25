package com.findr.controllers;
import com.findr.model.User;
import com.findr.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yassine on 2017-03-20.
 */
@RestController
@Secured(value="ROLE_USER")
@RequestMapping(value = "/")
public class UsersAPI {

    @Autowired
    private UserRepo userRepo;

    @RequestMapping(value = "/users")
    public List<User> getUser(){
        List<User> users = userRepo.findAll();
        return users;
    }

}
