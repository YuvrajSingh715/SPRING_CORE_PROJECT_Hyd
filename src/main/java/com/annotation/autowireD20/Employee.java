package com.annotation.autowireD20;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private Department department;

	/*
	 * public Employee() {
	 * System.out.println("Employee class object by default constructor"); }
	 */
	 
	
//	@Autowired(required = true)
	public Employee(Department department) {
		System.out.println("Employee class object by parameterize constructor");
		this.department = department;
	}

//	@Autowired(required = true)
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee {Department: " + department + "}";
	}

}

/*
 * @Autowired(required = true) byDefault @Autowire having {required=true} It
 * will work with byType, so when we write @Autowired on the setter method, it
 * checks the type of the setter's parameter, searches the configuration file
 * for a matching bean definition, and if found, injects it through the setter
 * method (the same place where we wrote @Autowired).
 */
