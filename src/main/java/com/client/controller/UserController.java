package com.client.controller;

import com.client.entity.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @GetMapping("/")
    public String home(){
        return "<h1>Welcome</h1>";
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Long userId){
        System.out.println("Get details for userId ="+ userId);

        User user = new User();
        user.setId(userId);
        user.setFirstName("Amlan");
        user.setLastName("Alok");
        user.setEmail("aa@x.com");
        user.setPassword("polo");
        user.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        user.setEnabled(true);
        user.setRolesId(1);

        return user;
    }

}
