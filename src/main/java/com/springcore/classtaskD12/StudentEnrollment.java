package com.springcore.classtaskD12;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentEnrollment {

	private Set<String> subjectName;

	public StudentEnrollment() {

	}

	public StudentEnrollment(Set<String> subjectName) {
		this.subjectName = subjectName;
	}

	public void setSubjectName(Set<String> subjectName) {
		this.subjectName = subjectName;
	}

	public Set<String> getSubjectName() {
		return subjectName;
	}

	@Override
	public String toString() {
		return "StudentEnrollment {subjectName=" + subjectName + "}";
	}

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/classtaskD12/app-context.xml");
		StudentEnrollment bean = context.getBean("studentEnrollment", StudentEnrollment.class);
		System.out.println(bean);

	}
	
}
