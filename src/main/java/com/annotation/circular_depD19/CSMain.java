package com.annotation.circular_depD19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//Make the setter injection mandatory
public class CSMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/annotation/circular_depD19/context.xml");

		Student stu = context.getBean("student", Student.class);

		System.out.println(stu);

	}

}
