package com.company.exception.controller;

import com.company.exception.entity.User;
import com.company.exception.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/index")
    public String sayHello(){
        return "HELLO WORLD";
    }

    @GetMapping("/byid/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

}
