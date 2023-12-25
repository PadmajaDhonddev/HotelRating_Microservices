package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    //user operations

    //create
    User saveUser(User user);

    // get list of users
    List<User> getAllUsers();
    //get single user
    User getUser(String userId);

    //TODO: update user
    //TODO: delete user


}
