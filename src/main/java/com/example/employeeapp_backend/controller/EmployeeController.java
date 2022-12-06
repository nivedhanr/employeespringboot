package com.example.employeeapp_backend.controller;


import com.example.employeeapp_backend.Model.Employee;
import com.example.employeeapp_backend.dao.EmployeeDao;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    public EmployeeDao dao;
    @CrossOrigin(origins = "*")
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
        dao.save(e);
        return "welcome to add employee";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employee> EmpView(){
        return (List<Employee>) dao.findAll();
    }


}
