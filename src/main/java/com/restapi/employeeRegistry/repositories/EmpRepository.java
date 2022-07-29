package com.restapi.employeeRegistry.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.employeeRegistry.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee,Integer> {

}
