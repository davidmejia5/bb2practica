package com.example.company.service;

import com.example.company.entities.User;
import com.example.company.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }
    /*public boolean loadUser(){

    }*/

}
