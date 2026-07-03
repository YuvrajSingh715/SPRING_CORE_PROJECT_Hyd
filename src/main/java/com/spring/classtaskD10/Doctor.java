package com.spring.classtaskD10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Patient{
	
	private String name;
	private int age;
	private Hospital hospital;
	
	public Patient(String name, int age, Hospital hospital) {
		this.age = age;
		this.name = name;
		this.hospital = hospital;
	}

	@Override
	public String toString() {
		return "Patient Details [Name=" + name + ", Age=" + age + ", Hospital Details=" + hospital + "]";
	}
	
}

public class Doctor {
	
	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/spring/config/application-context.xml");
		Patient pd = ap.getBean("patient", Patient.class);
		System.out.println(pd);
		
	}

}
