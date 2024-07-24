package com.wilson.project.controller;


import com.wilson.project.binding.User;
import com.wilson.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path="/add")
    public void addUser(@RequestBody User user){
            userService.addUser(user);
    }

    @PutMapping(path="/editUser")
    public void editUser(@RequestBody User user ){
        userService.editUser(user);

    }
}
