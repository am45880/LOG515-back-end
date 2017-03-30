package com.findr.controllers;



import com.findr.model.User;
import com.findr.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Yassine on 2017-03-25.
 */
@RestController
@RequestMapping("/auth")
public class AuthAPI {

    @Autowired
    UserRepo userRepo;

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login(@RequestParam String email, @RequestParam String password){

        User user = userRepo.findByEmail(email);
        if( user != null && user.getPassword().equals(password)){
            return "success";
        }else {
            return "fail";
        }
    }

    @RequestMapping(value="/connection_reussite")
    public String connection_reussite(){
        return "success";
    }

    @RequestMapping(value="/connection_echoue")
    public String connection_echoue(){
        return "fail";
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
