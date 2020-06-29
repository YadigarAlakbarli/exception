package com.company.exception.service;

import com.company.exception.entity.User;
import com.company.exception.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUserById(int id){
        throw new UserNotFoundException(id+"'Users not found");
    }
}
