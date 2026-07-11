package com.spring.collectionInjectionD12;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Duration {

	private Set<String> courseDuration;

	public Duration() {
	}

	public Duration(Set<String> courseDuration) {
		this.courseDuration = courseDuration;
	}

	public void setCourseDuration(Set<String> courseDuration) {
		this.courseDuration = courseDuration;
	}

	@Override
	public String toString() {
		return "[Course-Duration=" + courseDuration + "]";
	}

	// This code is just for verification purposes, to check whether the values are
	// injected into the variables or not
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collectionInjectionD12/collection.xml");
		Duration bean = context.getBean("duration", Duration.class);
		System.out.println(bean);
		
	}

}
