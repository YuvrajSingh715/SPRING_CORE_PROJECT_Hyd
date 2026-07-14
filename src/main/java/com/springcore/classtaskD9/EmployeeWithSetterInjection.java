package com.springcore.classtaskD9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class EmployeeS {

	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	public EmployeeS() {
		
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	public void displayEmployee() {
		System.out.println(" Employee Data Initialization by Setter Injection ");
		System.out.println("==================================================");
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Salary: " + employeeSalary);
	}
}

public class EmployeeWithSetterInjection {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/classtaskD9/application-context.xml");
		EmployeeS emp = ac.getBean("employeeSetter", EmployeeS.class);
		
		emp.displayEmployee();
	}

}
