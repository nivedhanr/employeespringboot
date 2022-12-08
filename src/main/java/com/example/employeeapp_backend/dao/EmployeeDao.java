package com.example.employeeapp_backend.dao;

import com.example.employeeapp_backend.Model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
    @Query(value = "SELECT `id`, `company`, `designation`, `empcode`, `mobile`, `name`, `password`, `salary`, `username` FROM `employee` WHERE empcode=:empcode",nativeQuery = true)
    List<Employee> Search(@Param("empcode") Integer empcode);
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `employee` WHERE `id`=:id",nativeQuery = true)
    void delete(@Param("id") Integer id);
}
