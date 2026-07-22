package com.annotation.classtaskD23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com/annotation/classtaskD23");

		Employee emp = context.getBean("employee", Employee.class);
		
		System.out.println(emp);
		
		System.out.println("Salary Incremented or Not: " + emp.getIncrement());
		
	}

}
