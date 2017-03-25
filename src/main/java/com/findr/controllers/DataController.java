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
 * Created by Yassine on 2017-03-24.
 */
@RestController
@CrossOrigin
@Secured(value="ROLE_USER")
@RequestMapping("/data")
public class DataController {

    @Autowired
    private UserRepo userRepo;

    @RequestMapping("delete")
    public String deleteUsers(){
        userRepo.deleteAll();
        return "all users has been deleted";
    }


    @RequestMapping("/init")
    public String creatUsers() {

        List<User> users = new ArrayList<User>();

        users.add(
                new User("Caroline", "leblanc", "F", "M", "caro@gmail.com", "514 236 9823",
                        31, "I am beautiful girl looking for nice men.", "secret123")
        );

        users.add(
                new User("Christina", "Blanchette", "F", "M", "christi@gmail.com", "438 236 0382",
                        38, "I am beautiful girl looking for nice men.", "secret123")
        );

        users.add(
                new User("Sabrina", "Ouelette", "F", "M", "wawa.sab@gmail.com", "450 324 3418",
                        27, "I am beautiful girl looking for nice men.", "secret123")
        );

        users.add(
                new User("Yell", "Fantas", "F", "M", "yello@gmail.com", "450 324 3418",
                        29, "I am beautiful girl looking for nice men.", "secret123")
        );

        users.add(
                new User("George", "Tremblay", "M", "F", "George@gmail.com", "514 233 0983",
                        23, "Looking for nice women.", "secret123"
                ));

        users.add(
                new User("Kreg", "Jiga", "M", "F", "Kregy11@gmail.com", "514 233 0233",
                        25, "Looking for nice women.", "secret123"
                ));
        users.add(
                new User("Zac", "Lacroche", "M", "F", "lacromi@gmail.com", "514 223 3243",
                        32, "Looking for nice women.", "secret123"
                ));
        users.add(
                new User("Maitre", "Yoda", "M", "F", "yoda@gmail.com", "XER 2K3 3243",
                        28, "Looking for nice women.", "secret123"
                ));
        users.add(
                new User("Jeff", "Gay", "M", "F", "lgbt432@gmail.com", "450 324 2341",
                        26, "Looking for nice men", "secret123"
                ));

        users.add(
                new User("Jerry", "Gayy", "M", "F", "pro-choice@gmail.com", "514 234 5423",
                        26, "Looking for nice men", "secret123"
                ));

        userRepo.save(users);

        return "10 users has been created";
    }
}
