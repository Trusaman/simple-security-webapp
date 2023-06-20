package com.example.demosimpleauthenticatedapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

//@Entity
@Getter
@Setter
public class Usez {
    private String username;
    private String password;
    private String code;
}
