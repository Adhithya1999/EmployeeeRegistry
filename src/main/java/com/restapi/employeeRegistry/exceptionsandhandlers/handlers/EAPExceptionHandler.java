package com.restapi.employeeRegistry.exceptionsandhandlers.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.restapi.employeeRegistry.exceptionsandhandlers.EmployeeAlreadyPresentException;


@ControllerAdvice
public class EAPExceptionHandler {
	@ExceptionHandler(value = EmployeeAlreadyPresentException.class)
    public ResponseEntity handleBlogAlreadyExistsException(EmployeeAlreadyPresentException ResourceExistsException) {
        return new ResponseEntity("Employee already present try changing the input id", HttpStatus.CONFLICT);
    }
}
