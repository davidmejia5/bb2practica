package com.example.company.service;

import com.example.company.dto.UserDTO;
import com.example.company.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public void save(UserDTO userDTO);
    public UserDTO findUserByEmail(String email);
    public List<UserDTO> getAllUser();
}
