package com.restapi.employeeRegistry.exceptionsandhandlers.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.restapi.employeeRegistry.exceptionsandhandlers.EmployeeNotFoundException;

@ControllerAdvice
public class ENFExceptionHandler {

	@ExceptionHandler(value = EmployeeNotFoundException.class)
	public ResponseEntity notFoundException(EmployeeNotFoundException ResourceNotFoundException)
	{
		return new ResponseEntity("Employee Not Found in the Database Check your Input!",HttpStatus.CONFLICT);		
	}


}
