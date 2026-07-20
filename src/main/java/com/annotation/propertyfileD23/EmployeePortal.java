package com.annotation.propertyfileD23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeePortal {

	public static void main(String[] args) {

		//Doing the things With XML
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/annotation/propertyfileD23/context.xml");

		//Doing the Same things Without XML
		ApplicationContext context = new AnnotationConfigApplicationContext("com.annotation.propertyfileD23");
		
		Employee emp = context.getBean("employee", Employee.class);
//		Employee emp1 = context.getBean("employee", Employee.class);
//		Employee emp2 = context.getBean("employee", Employee.class);

		System.out.println(emp + System.lineSeparator());

		System.out.println("Incremented Salary is: " + emp.getIncrementSalary());
//		System.out.println("Incremented Salary is: " + emp1.getIncrementSalary());
//		System.out.println("Incremented Salary is: " + emp2.getIncrementSalary());

	}

}
/* when only one object is created {@Scope("singleton")} we will get output like this
 * Incremented Salary is: 56532.54 
 * Incremented Salary is: 66532.54000000001
 * Incremented Salary is: 76532.54000000001
 * ===================================================================================
 * when different objects are created {@Scope("prototype")} we will get output like this
 * Incremented Salary is: 56532.54
 * Incremented Salary is: 56532.54
 * Incremented Salary is: 56532.54
 */