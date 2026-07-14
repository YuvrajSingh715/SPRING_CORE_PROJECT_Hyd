
/*Program 4: Constructor Injection with Reference Type
-------------------------------------------------------
A hospital wants to register a Patient, and every patient is assigned one Doctor. Both Patient's own details and the Doctor reference must be set together,
only once, when the Patient object is created.

Requirement:

Create two classes: Patient (name, age) and Doctor (doctorName, specialization)
Patient should hold a reference of type Doctor
Use constructor injection for both Patient's own fields and for injecting the Doctor object
The Doctor bean should be created separately in XML and passed using ref inside <constructor-arg>


This is exactly the same pattern as point your notes (Student depending on Resume) — just change the domain to Patient and Doctor

Note : After getting the ans try this below 
Try creating the Patient object without creating the Doctor object first — check whether you get a compile-time error 
(traditional way) or exception (Spring way), same as before*/


package com.springcore.classtaskD10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hospital {

	private String doctorName;
	private String specialization;

	public Hospital(String doctorName, String specialization) {
		this.doctorName = doctorName;
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "{Doctor Name=" + doctorName + ", Specialization=" + specialization + "}";
	}

	// This code is just for verification purposes, to check whether the values are
	// injected into the variables or not
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/classtaskD10/application-context.xml");
		Hospital hosp = ac.getBean("hospital", Hospital.class);
		System.out.println(hosp);

	}

}
