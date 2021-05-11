package com.sunkenship.zup.controllers;

import com.sunkenship.zup.data.User;
import com.sunkenship.zup.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AppController {

    @Autowired
    private UserRepository userRepo;

    @GetMapping(path = {"/index", ""})
    public String viewHomePage() {
        return "index";
    }

    @GetMapping
    public User getUser(@RequestParam(name ="id", defaultValue = "1")int id) {
    return new User((long) id, "Maira Joana", "alegria@alegria.com", "987.987.654-00", "01/01/2021");
    };
}
