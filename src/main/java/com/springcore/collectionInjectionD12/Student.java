package com.springcore.collectionInjectionD12;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {

	private List<String> studentName;

	public Student() {

	}

	public Student(List<String> studentName) {
		this.studentName = studentName;
	}

	public void setStudentName(List<String> studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "{Student-Name=" + studentName + "}";
	}

	
	// This code is just for verification purposes, to check whether the values are
	// injected into the variables or not
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collectionInjectionD12/collection.xml");
		Student bean = context.getBean("student", Student.class);
		System.out.println(bean);
		
	}

}
