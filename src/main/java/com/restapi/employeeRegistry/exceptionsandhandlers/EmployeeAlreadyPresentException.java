package com.restapi.employeeRegistry.exceptionsandhandlers;

public class EmployeeAlreadyPresentException extends Exception {
	public EmployeeAlreadyPresentException(String string)
	{
		super(string);
	}
	
}
