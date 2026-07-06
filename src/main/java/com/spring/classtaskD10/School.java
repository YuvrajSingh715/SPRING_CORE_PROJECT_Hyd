
/*Program 3: Constructor Injection with Primitive Type
------------------------------------------------------
A school wants to register a Teacher with subject name and years of experience. These values must be set only once, at the time the object is created
— no changes allowed after that.

Requirement:

Create a class Teacher with fields: subject (String), experience (int)
Use constructor injection only — no setters should be used for injection
Inject values using <constructor-arg> in XML

Note : After getting the ans try this below 

Just like point earlier notes — if the matching parameterized constructor is missing, Spring will not silently use the default constructor. 
Try removing the constructor and observe what error you get
This will prove to you once again that constructor injection is mandatory to have the matching constructor*/


package com.spring.classtaskD10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Teacher {

	private String subject;
	private int experience;

	public Teacher(String subject, int experience) {
		this.experience = experience;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Teacher Details {Subject=" + subject + ", Experience=" + experience + "}";
	}

}

public class School {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/classtaskD10/application-context.xml");
		Teacher td = ac.getBean("teacher", Teacher.class);
		System.out.println(td);
	}

}
