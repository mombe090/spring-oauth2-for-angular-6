package com.github.arocketman.controllers;

import com.github.arocketman.entities.Role;
import com.github.arocketman.entities.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


@RestController
public class HomeController {

    @GetMapping(value = "/")
    public String index(){
        return "Hello world";
    }

    @GetMapping(value = "/private")
    public User privateArea(){

        return new User("Yaya", "Hooo", Arrays.asList(new Role("Mombea")));
    }

}
