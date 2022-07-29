package com.restapi.employeeRegistry.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import net.bytebuddy.utility.nullability.NeverNull;

@Entity
@Data
@Table
public class Employee {
	
@Id
@Column(name="id")
private int id;

@Column(name="e_name")
private String e_name;

@Column(name="salary")
private double salary;

@Column(name="designation")

private String designation;
public Employee() {
	super();
}
public Employee(int id, String e_name, double salary, String designation) {
	super();
	this.id = id;
	this.e_name = e_name;
	this.salary = salary;
	this.designation = designation;
}
public int getE_id() {
	return id;
}
public void setE_id(int id) {
	this.id = id;
}
public String getE_name() {
	return e_name;
}
public void setE_name(String e_name) {
	this.e_name = e_name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", e_name=" + e_name + ", salary=" + salary + ", designation=" + designation
			+ "]";
}

}
