package com.annotation.classtaskD18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DEClient {

	public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("com/annotation/classtaskD18/context.xml");
	
	Department dep = context.getBean("department", Department.class);
	System.out.println(dep);
	
	Employee emp = context.getBean("employee", Employee.class);
	System.out.println(emp);
	
	}

}
