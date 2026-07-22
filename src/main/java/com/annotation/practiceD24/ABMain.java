package com.annotation.practiceD24;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ABMain {

	public static void main(String[] args) {

		System.out.println("Main method executed");

//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"com/annotation/practiceD24/application-context.xml");
//		B b = context.getBean("b", B.class);

		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.annotation.practiceD24");

		A a = context.getBean("a", A.class);

		
	}

}
