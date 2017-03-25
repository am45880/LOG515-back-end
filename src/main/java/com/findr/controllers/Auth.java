package com.findr.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yassine on 2017-03-24.
 */
@RestController
@Secured(value="ROLE_USER")
@CrossOrigin
@RequestMapping("/auth")
public class Auth {


    @RequestMapping("/login")
    public String login(){
        return("You have been login");
    }

    @RequestMapping("/logout")
    public String logout(){
        return "You have been logout";
    }


    @RequestMapping("/fail_login")
    public String failLogin(){
        return "Fail login";
    }

}
