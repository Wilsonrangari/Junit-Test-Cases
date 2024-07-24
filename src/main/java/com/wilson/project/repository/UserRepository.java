package com.wilson.project.repository;


import com.wilson.project.binding.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {

    private final Map<String, User> mapdata = new HashMap<>();

    public void save(User user) {
        mapdata.put(user.getEmail(), user);
    }

    public void edit(User user) {

        if (mapdata.containsKey(user.getEmail())) {
            mapdata.put(user.getEmail(), user);
        }
        else{
            System.out.println("Email id is not found");
        }
        }
}
