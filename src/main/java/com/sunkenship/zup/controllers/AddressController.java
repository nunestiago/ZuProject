package com.sunkenship.zup.controllers;

import com.sunkenship.zup.data.Address;
import com.sunkenship.zup.repos.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("index/address")
    public String viewHomePage() {
        return "address";
    }

    @PostMapping
    public @ResponseBody Address newAddress(@RequestParam(name ="id", defaultValue = "1")int id) {
        Address address = new Address((long)id, "aoiwj", "oaiwj", "ieuh", "osiej", "oiejf", "023948", "654987");
        addressRepository.save(address);
        return address;
    }
}
