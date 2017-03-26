package com.findr.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yassine on 2017-03-25.
 */
@RestController
//@Secured(value="ROLE_USER")
@RequestMapping("/auth")
public class AuthAPI {


    @RequestMapping(value="/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value="/connection_reussite")
    public String connection_reussite(){
        return "success";
    }

    @RequestMapping(value="/connection_echoue")
    public String connection_echoue(){
        return "fail";
    }


    @RequestMapping(value="/whoiam")
    public String whoIam(Authentication authentication){
        return authentication.getName();
    }

    @RequestMapping(value = "/logout")
    public String logout(){
     return "logout";
    }

    @RequestMapping(value="logout_success")
    public String logoutSuccess(){
        return "Successful logout";
    }


}
