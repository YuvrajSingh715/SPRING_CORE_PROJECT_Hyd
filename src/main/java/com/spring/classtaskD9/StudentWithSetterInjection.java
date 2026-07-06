package com.spring.classtaskD9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Student{
	
	private int rollNumber;
	private String studentName;
	private String course;
	
	public Student() {	
	}
	
	public void setRollNumber(int rollNumber) {
	    this.rollNumber = rollNumber;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student {Roll Number = " + rollNumber + ", Student Name = " + studentName + ", Course = " + course + "}";
	}
	
}

public class StudentWithSetterInjection {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/classtaskD9/application-context.xml");
		Student student = ac.getBean("studentSetter", Student.class);
		System.out.println(student);
	}

}
