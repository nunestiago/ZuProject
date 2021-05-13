package com.sunkenship.zup.controllers;

import com.sunkenship.zup.model.Address;
import com.sunkenship.zup.model.User;
import com.sunkenship.zup.repos.AddressRepository;
import com.sunkenship.zup.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/")
public class AppController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    AddressRepository addressRepository;

    @PostMapping("address/new")
    public Address getAddress(@RequestBody Address address){
        addressRepository.save(address);
        return address;
    }

    @PostMapping("/users/new")
    public User persist(@RequestBody final User user){
        userRepository.save(user);
        return user;
    };

    @GetMapping("/address/id")
    public List<Address> getAddress(@RequestBody User user){
        return addressRepository.findByUserId(user.getId());
    }

    @GetMapping("/users/all")
    public List<User> getUsers(){
        return (List<User>) userRepository.findAll();
    }


}
