package com.findr.controllers;

import com.findr.model.User;
import com.findr.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yassine on 2017-03-24.
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")
public class UserAPI {

    @Autowired
    private UserRepo userRepo;

    @RequestMapping(method = RequestMethod.POST)
    public User getUserByName(@RequestParam String email){
        return userRepo.findByEmail(email);
    }

//************************************     Frontend Features  *****************************************
    @RequestMapping(value="/new",method = RequestMethod.POST)
    public void insertNewUser(@ModelAttribute User user){
        userRepo.save(user);
    }

    @RequestMapping(value = "/edit_profil", method= RequestMethod.POST)
    public void editProfil(@RequestParam String email,@RequestParam String description,@RequestParam String phone, @RequestParam String snapchat){
       User user = userRepo.findByEmail(email);
       user.setDescription(description);
       user.setPhone(phone);
       user.setPhone(snapchat);
       userRepo.save(user);
    }

    @RequestMapping(value = "/edit_personnal_info", method= RequestMethod.POST)
    public void editPersonnalInfo(@RequestParam String email,@RequestParam String firstName,@RequestParam String lastName, @RequestParam String phone,@RequestParam String age){
        User user = userRepo.findByEmail(email);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPhone(phone);
        user.setAge(age);
        userRepo.save(user);
    }

    @RequestMapping(value="/change_password",method = RequestMethod.POST)
    public void changePassword(@RequestParam String email,@RequestParam String password){
        User user = this.userRepo.findByEmail(email);
        user.setPassword(password);
        this.userRepo.save(user);
    }


//************************************    Control of all the data  **************************************
    @RequestMapping("/all")
    public List<User> getAll(){
        return userRepo.findAll();
    }

    @RequestMapping(value = "/delete_all", method = RequestMethod.DELETE)
    public String deleteUsers(){
        userRepo.deleteAll();
        return "all users has been deleted";
    }

    @RequestMapping("/init")
    public String creatUsers() {

        userRepo.deleteAll();

        List<User> users = new ArrayList<User>();

        users.add(
                new User("Caroline", "leblanc", "F", "M","caromix" , "caro@gmail.com", "514 236 9823",
                        "31", "I am beautiful girl looking for nice men.", "secret123")
        );

        users.add(
                new User("Christina", "Blanchette", "F", "M","christo", "christi@gmail.com", "438 236 0382",
                        "38", "I am beautiful girl looking for nice men.", "secret123")
        );

        users.add(
                new User("Sabrina", "Ouelette", "F", "M", "sabrinos","wawa.sab@gmail.com", "450 324 3418",
                        "27", "I am beautiful girl looking for nice men.", "secret123")
        );

        users.add(
                new User("Yell", "Fantas", "F", "M", "yell23", "yello@gmail.com", "450 324 3418",
                        "29", "I am beautiful girl looking for nice men.", "secret123")
        );

        users.add(
                new User("George", "Tremblay", "M", "F", "george23","George@gmail.com", "514 233 0983",
                        "23", "Looking for nice women.", "Jibotro"
                ));

        users.add(
                new User("Kreg", "Jiga", "M", "F", "kreguy23","Kregy11@gmail.com", "514 233 0233",
                        "25", "Looking for nice women.", "cassendra"
                ));
        users.add(
                new User("Zac", "Lacroche", "M", "F", "zacovich","lacromi@gmail.com", "514 223 3243",
                        "32", "Looking for nice women.", "lacro12"
                ));
        users.add(
                new User("Maitre", "Yoda", "M", "F","yoda123", "yoda@gmail.com", "XER 2K3 3243",
                        "28", "Looking for nice women.", "starswars"
                ));
        users.add(
                new User("Jeff", "Gay", "M", "F", "jeff241","lgbt432@gmail.com", "450 324 2341",
                        "26", "Looking for nice men", "Namibo"
                ));

        users.add(
                new User("Jerry", "Gayy", "M", "F","jerry3876", "pro-choice@gmail.com", "514 234 5423",
                        "26", "Looking for nice men", "Gotomiko"
                ));
        users.add(
                new User("Francois", "Map", "M", "F","caca03876", "FrancoisSamere@hotmail.com", "432 432 4423",
                        "25", "Looking for nice girl", "wasd"
                ));

        userRepo.save(users);

        return "10 users has been created";
    }
}
