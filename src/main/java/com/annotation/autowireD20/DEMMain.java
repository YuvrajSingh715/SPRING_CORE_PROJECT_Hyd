package com.annotation.autowireD20;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DEMMain {

	 public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/annotation/autowireD20/context.xml");

		Employee emp = context.getBean("employee", Employee.class);
		
		System.out.println(emp);

	}
	
}
