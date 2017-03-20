package com.findr.controllers;

import com.findr.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Rachid, Mohamed Yassine on 2017-03-20.
 */
@RestController
public class Test {

    @RequestMapping
    public User[] retourneUtilisateur(){
        User users[] = {new User("Jimmy","Fleury"),new User("Chris","Patrinos"),new User("Karl","Vinos")};
        return users;
    }
}
