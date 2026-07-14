package com.springcore.classtaskD9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class EmployeeC {

	private int employeeId;
	private String employeeName;
	private double employeeSalary;

	public EmployeeC(int employeeId, String employeeName, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public void displayEmployee() {
		System.out.println(" Employee Data Initialization By Constructor Injection ");
		System.out.println("=======================================================");
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Salary: " + employeeSalary);
	}
}

public class EmployeeWithConstructorInjection {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/classtaskD9/application-context.xml");
		EmployeeC emp = context.getBean("employeeConstructor", EmployeeC.class);

		emp.displayEmployee();
	}

}
