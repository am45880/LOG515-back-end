package com.findr.util;

import com.findr.model.User;
import com.findr.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Yassine on 2017-03-22.
 */
public class UsersGenerator {

    @Autowired
    private UserRepo userRepo;

    public void createFiveUser(){


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

//        List<User> users = new ArrayList<User>();

//        users.add(utilisateur1);
//        users.add(utilisateur2);
//        users.add(utilisateur3);
//        users.add(utilisateur4);
//        users.add(utilisateur5);

        //userRepo.save(utilisateur1);

    }

}