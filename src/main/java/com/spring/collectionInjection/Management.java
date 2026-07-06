package com.spring.collectionInjection;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Management {

	private List<Student> studentDetails;
	private Map<Duration, Course> courseDetails;

	public Management() {
	}

	public Management(List<Student> studentDetails, Map<Duration, Course> courseDetails) {
		super();
		this.studentDetails = studentDetails;
		this.courseDetails = courseDetails;
	}

	public void setStudentDetails(List<Student> studentDetails) {
		this.studentDetails = studentDetails;
	}

	public void setCourseDetails(Map<Duration, Course> courseDetails) {
		this.courseDetails = courseDetails;
	}

	@Override
	public String toString() {
		return "Management [Student-Details=" + studentDetails + ", Course-Details=" + courseDetails + "]";
	}

	// This code is just for verification purposes, to check whether the values are
	// injected into the variables or not

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/collectionInjection/collection.xml");
		Management bean = context.getBean("management", Management.class);
		System.out.println(bean);

	}

}
