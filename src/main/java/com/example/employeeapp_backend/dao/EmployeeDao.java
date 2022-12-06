package com.example.employeeapp_backend.dao;

import com.example.employeeapp_backend.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
