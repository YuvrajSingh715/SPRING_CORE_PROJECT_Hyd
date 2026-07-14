package com.springcore.classtaskD10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager {

	private String managerName;
	private String department;

	public Manager(String managerName, String department) {
		this.managerName = managerName;
		this.department = department;
	}

	@Override
	public String toString() {
		return "{Manager Name=" + managerName + ", Department=" + department + "}";
	}

	
	// This code is just for verification purposes, to check whether the values are
	// injected into the variables or not
	
	  public static void main(String[] args) {
	  
	  ApplicationContext ac = new
	  ClassPathXmlApplicationContext("com/springcore/classtaskD10/application-context.xml");
	  Manager manager = ac.getBean("manager", Manager.class);
	  System.out.println(manager);
	  
	  }
	 
}
