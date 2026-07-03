package com.spring.firstdemo_files;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {
	
	public static void main(String[] args) {
		
//		Traditional Approach
		System.out.println("With java approach");
		System.out.println("------------------>" +"\u001B[32m");
		Student student1 = new Student();
//		Student student1 = new Student(1, "Peter","hyd");
		student1.setId(53432);
		student1.setName("Ramsay");
		student1.setCity("Pune");
		System.out.println(student1);
		System.out.println(System.lineSeparator() + "\u001B[0m");
		
//		Spring Approach
		System.out.println("With spring approach");
		System.out.println("-------------------->" +"\u001B[36m");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/config/application-context.xml");
//		Student student2 = (Student) context.getBean("studentClass");
		Student student2 = context.getBean("studentClass", Student.class);
		System.out.println(student2);
	}

}
