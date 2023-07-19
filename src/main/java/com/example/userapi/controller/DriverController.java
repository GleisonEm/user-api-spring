package com.example.userapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.userapi.entity.Driver;
import com.example.userapi.model.JsonResponse;
import com.example.userapi.repository.DriverRepository;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/drivers") // This means URL's start with /demo (after Application path)
public class DriverController {
    @Autowired(required = true)
    private DriverRepository driverRepository;

    @PostMapping(path = "/") // Map ONLY POST Requests
    public @ResponseBody ResponseEntity<JsonResponse> create(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String cpf,
            @RequestParam String dateBirth,
            @RequestParam Integer cityId) {

        if (driverRepository.findExistsUser(email, cpf) > 0) {
            return new ResponseEntity<>(new JsonResponse("User already exists"), HttpStatus.BAD_REQUEST);
        }

        // Driver driver = new Driver();
        // driver.setName(name);
        // driver.setEmail(email);
        // driverRepository.save(driver);

        return new ResponseEntity<>(new JsonResponse("Driver saved with success"), HttpStatus.OK);
    }

    // @GetMapping(path = "/all")
    // public @ResponseBody Iterable<Driver> getAllDrivers() {
    // // This returns a JSON or XML with the users
    // return driverRepository.findAll();
    // }
}
