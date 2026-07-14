package com.springcore.classtaskD16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ECClient {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/classtaskD16/app-context.xml");

		ExamController ec = context.getBean("examController", ExamController.class);
		ExamController ec1 = context.getBean("examController", ExamController.class);
		ExamController ec2 = context.getBean("examController", ExamController.class);
		
		System.out.println("hashCode of ec1: " + ec1.hashCode());
		System.out.println("hashCode of ec2: " + ec2.hashCode());
		System.out.println("Both references same or not: " + (ec1==ec2));
		
		System.out.println(ec);
		
	}

}
