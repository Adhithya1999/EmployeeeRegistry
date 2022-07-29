package com.restapi.employeeRegistry.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.employeeRegistry.*;
import com.restapi.employeeRegistry.entity.Employee;
import com.restapi.employeeRegistry.exceptionsandhandlers.EmployeeAlreadyPresentException;
import com.restapi.employeeRegistry.exceptionsandhandlers.EmployeeNotFoundException;
import com.restapi.employeeRegistry.service.EmpService;



@RestController
public class EmpController {
	
	 @Autowired
	 private EmpService service;

	    @RequestMapping(method=RequestMethod.POST,value="/create")
		public Employee addEmployee(@RequestBody Employee employeeRequest) throws EmployeeAlreadyPresentException 
		{
			return service.addData(employeeRequest);
		}
	    
	    @RequestMapping(method=RequestMethod.PUT,value="/update/{id}/{salary}")
		public Employee update(@PathVariable("id")int id, @PathVariable("salary")double salary) throws  EmployeeNotFoundException
		{
			 
			 return service.update(id, salary);
		}
	    
	    @RequestMapping(method=RequestMethod.GET,value="/all")
		public ResponseEntity<List<Employee>> fetchAllEmployees()
		{
			List<Employee>employees=service.fetchAll();
			return new ResponseEntity<>(employees,HttpStatus.OK);
		}
	    
	    @RequestMapping("/deleteAll")
	    public void deleteAll()
	    {
	    	service.deleteAll();
	    }
	  
}
