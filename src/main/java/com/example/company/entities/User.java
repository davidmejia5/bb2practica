package com.example.company.entities;

import com.example.company.dto.UserDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
public class User {
    @Id
    @Column(name = "iduser")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_id_seq")
    @SequenceGenerator(name = "user_id_seq",sequenceName = "user_id_seq", allocationSize = 1)
    private Long idUser;
    private String name;
    private String surname;
    private String email;
    private String password;


}
