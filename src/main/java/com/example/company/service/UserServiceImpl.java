package com.example.company.service;

import com.example.company.dto.UserDTO;
import com.example.company.entities.User;
import com.example.company.repository.UserRepository;
import com.googlecode.jmapper.JMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(10);

    public void save(UserDTO userDTO){
        userDTO.setPassword(bCryptPasswordEncoder.encode(userDTO.getPassword()));
        JMapper<User,UserDTO> userDTOJMapper = new JMapper<>(User.class,UserDTO.class);
        User result = userDTOJMapper.getDestination(userDTO);

    }

    //public

}
