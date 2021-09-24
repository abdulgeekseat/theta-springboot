package com.geekseat.theta.controller;

import com.geekseat.theta.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService service;

    @GetMapping("/list")
    public ResponseEntity<?> list() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }
}
