package com.example.employeeapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String Welcomepage(){
        return "Welcome to employeepage";
    }
    @GetMapping("/add")
    public String Empadd(){
        return "welcome to add employee";
    }

}
