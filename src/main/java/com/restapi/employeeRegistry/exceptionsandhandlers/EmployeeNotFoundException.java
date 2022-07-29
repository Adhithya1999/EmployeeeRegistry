package com.restapi.employeeRegistry.exceptionsandhandlers;

public class EmployeeNotFoundException extends Exception {
	public EmployeeNotFoundException(String string)
	{
		super(string);
	}
}
