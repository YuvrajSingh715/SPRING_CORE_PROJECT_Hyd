package com.spring.collectionInjectionD12;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Course {

	private Map<String, Integer> courseInfo;

	public Course() {

	}

	public Course(Map<String, Integer> courseInfo) {
		this.courseInfo = courseInfo;
	}

	public void setCourseInfo(Map<String, Integer> courseInfo) {
		this.courseInfo = courseInfo;
	}

	@Override
	public String toString() {
		return "[Course-Info=" + courseInfo + "]";
	}

	// This code is just for verification purposes, to check whether the values are
	// injected into the variables or not

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/collectionInjectionD12/collection.xml");
		Course bean = context.getBean("course", Course.class);
		System.out.println(bean);

	}

}
