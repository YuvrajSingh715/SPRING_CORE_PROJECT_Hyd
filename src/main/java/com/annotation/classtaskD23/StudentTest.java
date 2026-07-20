package com.annotation.classtaskD23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com.annotation.classtaskD23");

		Student stud = context.getBean("student", Student.class);

		System.out.println(stud);

		System.out.println("Get Scholarship or Not: " + stud.calculateScholarship());
		System.out.println("Remaning Fee: " + stud.calculateRemaningFee());

	}

}
