package com.springcore.collectionInjectionD12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/collectionInjectionD12/collection.xml");
		
		
		System.out.println("Student Class Data");
		System.out.println("===================");
		Student student = context.getBean("student", Student.class);
		System.out.println(student + System.lineSeparator());
		
		
		System.out.println("Duration Class Data");
		System.out.println("====================");
		Duration duration = context.getBean("duration", Duration.class);
		System.out.println(duration + System.lineSeparator());
		
		
		System.out.println("Course Class Data");
		System.out.println("==================");
		Course course = context.getBean("course", Course.class);
		System.out.println(course + System.lineSeparator());
		
		
		System.out.println("Management Class Data");
		System.out.println("======================");
		Management management = context.getBean("management", Management.class);
		System.out.println(management + System.lineSeparator());
		
		
		System.out.println("CapGemini Class Data");
		System.out.println("=====================");
		CapGemini capgemini = context.getBean("capgemini", CapGemini.class);
		System.out.println(capgemini);
		
		
	}

}
