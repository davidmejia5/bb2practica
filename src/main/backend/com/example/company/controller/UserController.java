package com.example.company.controller;

import com.example.company.dto.UserDTO;
import com.example.company.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{email}")
    public UserDTO getUserByEmail(@PathVariable String email){
        return userService.findUserByEmail(email);
    }

    @GetMapping("/user")
    public List<UserDTO> getAllUser(){
        return userService.getAllUser();
    }


}
