package com.restapi.employeeRegistry.service;

import java.util.Comparator;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.restapi.employeeRegistry.*;
import com.restapi.employeeRegistry.entity.Employee;
import com.restapi.employeeRegistry.exceptionsandhandlers.EmployeeAlreadyPresentException;
import com.restapi.employeeRegistry.exceptionsandhandlers.EmployeeNotFoundException;
import com.restapi.employeeRegistry.repositories.EmpRepository;






@Service
@Component
public class EmpService {
	
	@Autowired
	private EmpRepository repo;
	
	  //Create
	  public Employee addData(Employee employee) throws EmployeeAlreadyPresentException 
	  {
		  Optional<Employee> emp = repo.findById(employee.getE_id());
			 if(emp.isPresent())
			 {
				 throw new EmployeeAlreadyPresentException(""); 
			 }
			 else
			 {
			
			employee.setE_id(employee.getE_id());
			employee.setE_name(employee.getE_name());
			employee.setSalary(employee.getSalary());
			employee.setDesignation(employee.getDesignation());
			
			return repo.save(employee);
			}
	    }

    //Update
	public Employee update(int id,double salary)throws EmployeeNotFoundException
	{
	      Optional<Employee> employee=repo.findById(id);
	      if(employee.isPresent())
	      {
	    	  Employee obj = employee.get();
	      	
	      	  obj.setSalary(salary);
	    
	      	  repo.save(obj);
	          return obj;
	    	  
	      }
	      else
	      {
	    	  throw new EmployeeNotFoundException("");
	    	 
	    	
	    	
	      }
	}


    //Retrieve ALL
	public List<Employee> fetchAll()
	{
		List<Employee>list=repo.findAll();
		 list.sort(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getE_name));

		 
		 return list;
		
	}




	//deleteAll
	public void deleteAll() {
		// TODO Auto-generated method stub
		repo.deleteAllInBatch();		
	}
}
