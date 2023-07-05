package com.nirmal.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_user")
public class User{
    @Id
    @GeneratedValue
    private Integer id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
}