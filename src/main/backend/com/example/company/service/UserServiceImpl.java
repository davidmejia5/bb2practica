package com.example.company.service;

import com.example.company.dto.UserDTO;
import com.example.company.entities.User;
import com.example.company.repository.UserRepository;
import com.googlecode.jmapper.JMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(10);

    public void save(UserDTO userDTO){
        userDTO.setPassword(bCryptPasswordEncoder.encode(userDTO.getPassword()));
        User user = new User();
        user.setIdUser(userDTO.getIdUser());
        user.setPassword(userDTO.getPassword());
        user.setEmail(user.getEmail());
        user.setName(user.getName());
        user.setSurname(user.getSurname());
        userRepository.save(user);
    }

    public UserDTO findUserByEmail(String email){
        User user = userRepository.findByEmail(email);
        UserDTO userDTO = new UserDTO(user);
        return userDTO;
    }
    public List<UserDTO> getAllUser(){
        List<User> userList = userRepository.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        for(User user: userList){
            UserDTO userDTO = new UserDTO(user);
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }


}
