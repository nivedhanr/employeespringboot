package com.example.employeeapp_backend.controller;


import com.example.employeeapp_backend.Model.Employee;
import com.example.employeeapp_backend.dao.EmployeeDao;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {
    @Autowired
    public EmployeeDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping("/")
    public String Welcomepage(){
        return "Welcome to employeepage";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes ="application/json",produces = "application/json")
    public Map<String,String> Empadd(@RequestBody Employee e){

        System.out.println(e.getName().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getEmpcode());
        System.out.println(e.getMobile().toString());
        System.out.println(e.getCompany().toString());
        System.out.println(e.getSalary().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        dao.save(e);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employee> EmpView(){
        return (List<Employee>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Employee> Search(@RequestBody Employee e){
        String empcode=String.valueOf(e.getEmpcode());
        System.out.println(empcode);
        return (List<Employee>) dao.Search(e.getEmpcode());
    }

}
