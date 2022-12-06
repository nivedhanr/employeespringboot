package com.example.employeeapp_backend.controller;


import com.example.employeeapp_backend.Model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @PostMapping("/")
    public String Welcomepage(){
        return "Welcome to employeepage";
    }
    @PostMapping(path="/add",consumes ="application/json",produces = "application/json")
    public String Empadd(@RequestBody Employee e){

        System.out.println(e.getName().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getEmpcode());
        System.out.println(e.getMobile().toString());
        System.out.println(e.getCompany().toString());
        System.out.println(e.getSalary().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        return "welcome to add employee";
    }


}
