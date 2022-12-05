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
    @GetMapping("/search")
    public String Empsearch(){
        return "wellcome to employee search";
    }
    @GetMapping("/edit")
    public String Empedit(){
        return "welcome to employee edit";
    }
}
