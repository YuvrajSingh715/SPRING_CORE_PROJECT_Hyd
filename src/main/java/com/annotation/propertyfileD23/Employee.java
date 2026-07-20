package com.annotation.propertyfileD23;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PropertySource("classpath:com/annotation/propertyfileD23/application.properties")
public class Employee {

//	@Value("Yuvi") // Never recommend to HardCode the value. but simple way 
//	@Value("#{myprops.emp_name}")  //it will work with XML file (#)
	@Value("${emp_name}")  //it will work without XML file ($)  
	private String name;

//	@Value("D324E") // Never recommend to HardCode the value. but simple way 
//	@Value("#{myprops.emp_id}")  //it will work with XML file (#)   
	@Value("${emp_id}")  //it will work without XML file ($)   
	private String id;

//	@Value("DevOps") // Never recommend to HardCode the value. but simple way 
//	@Value("#{myprops.emp_dep}")  //it will work with XML file (#)   
	@Value("${emp_dep}")  //it will work without XML file ($)   
	private String department;

//	@Value("5") // Never recommend to HardCode the value. but simple way 
//	@Value("#{myprops.emp_exp}")  //it will work with XML file (#)   
	@Value("${emp_exp}")  //it will work without XML file ($)   
	private int exprience;

//	@Value("56346.43") // Never recommend to HardCode the value. but simple way 
//	@Value("#{myprops.emp_salary}")  //it will work with XML file (#)   
	@Value("${emp_salary}")  //it will work without XML file ($)   
	private double salary;

//	@Value("true") // Never recommend to HardCode the value. but simple way 
//	@Value("#{myprops.emp_status}")  //it will work with XML file (#)   
	@Value("${emp_status}")  //it will work without XML file ($)   
	private boolean projectStatus;

	// @Value Annotation will work with fields and setters both places

	public double getIncrementSalary() {
		if (projectStatus) {
			salary = salary + 10000;
		}
		return salary;
	}

//	@Value("Yuvraj")
	public void setName(String name) {
		this.name = name;
	}

//	@Value("YD321")
	public void setId(String id) {
		this.id = id;
	}

//	@Value("Full Stack")
	public void setDepartment(String department) {
		this.department = department;
	}

//	@Value("4")
	public void setExprience(int exprience) {
		this.exprience = exprience;
	}

//	@Value("64346.43")
	public void setSalary(double salary) {
		this.salary = salary;
	}

//	@Value("false")
	public void setProjectStatus(boolean projectStatus) {
		this.projectStatus = projectStatus;
	}

	@Override
	public String toString() {
		return "Employee Details [Name=" + name + ", Id=" + id + ", Department=" + department + ", Exprience="
				+ exprience + ", Salary=" + salary + ", ProjectStatus=" + projectStatus + "]";
	}

}
