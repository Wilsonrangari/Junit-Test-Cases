package com.wilson.project.service;


import com.wilson.project.binding.User;
import com.wilson.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) {
        if(user.getAge() > 18){
            userRepository.save(user);
        }

    }

    public void editUser(User user) {
        userRepository.edit(user);
    }
}
