package com.annotation.autowireD20;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired(required = false)
	@Qualifier("departmentX")
//	@Qualifier("mangerY")
	private Department department;

	@Autowired(required = false)
	@Qualifier("mangerY")
//	@Qualifier("departmentX")
	private Manager manager;

	public Employee() {
		System.out.println("Employee class object by default constructor");
	}

//	@Autowired(required = false)
	public Employee(@Qualifier("departmentY") Department department, @Qualifier("managerX") Manager manager) {
		System.out.println("Employee Object Created");
		this.department = department;
		this.manager = manager;
	}

//	@Autowired(required = false)
	public Employee(@Qualifier("departmentY") Department department) {
		System.out.println("Department Object Created");
		this.department = department;
	}

//	@Autowired(required = false)
	public Employee(@Qualifier("managerX") Manager manager) {
		System.out.println("Manager Object Created");
		this.manager = manager;
	}

//	@Autowired(required = false)
//	@Qualifier("departmentY")       //work with required true&false --->>> we will get value coz type matched default constructor need
//	@Qualifier("managerY")          //work with required false --->>> we will get value null coz type not matched default constructor need
	public void setDepartment(Department department) {
		this.department = department;
	}

//	@Autowired(required = false)
//	@Qualifier("managerY")          //work with required true&false --->>> we will get value coz type matched default constructor need
//	@Qualifier("departmentY")       //work with required false --->>> we will get value null coz type not matched default constructor need
	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Employee Details [Department=" + department + ", Manager=" + manager + "]";
	}

}

/*
 * @Autowired(required = true) byDefault @Autowire having {required=true} It
 * will work with byType, so when we write @Autowired on the setter method, it
 * checks the type of the setter's parameter, searches the configuration file
 * for a matching bean definition, and if found, injects it through the setter
 * method (the same place where we wrote @Autowired).
 */
