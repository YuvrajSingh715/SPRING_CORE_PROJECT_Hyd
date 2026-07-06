
/*Program 2: Setter Injection with Reference Type
--------------------------------------------------
A company wants to maintain an Employee record, but every employee also has an Address (city and pincode). The Address should be a separate class,
and the Employee should hold a reference to it.

Requirement:

Create two classes: Employee (name, id) and Address (city, pincode)
Employee should have a reference variable of type Address
Inject Address object into Employee using setter injection with ref
All values (Employee's own fields + Address bean) should be injected only through setters

Hint:
First create the Address bean separately in XML, then use <property name="address" ref="..."/> inside the Employee bean —
similar to how resume bean was referred inside studentclass bean, but here through property tag, not constructor-arg

Notes : After getting the ans try this below 

Check what value you get for address if you forget to add the ref property — this will help you understand optional vs mandatory concept again*/


package com.spring.classtaskD10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class EmpDetails {

	private String name;
	private int id;
	private EmpAddress empAddress;

	public EmpDetails() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEmpAddress(EmpAddress empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Employee Details [Name=" + name + ", Id=" + id + ", Employee Address=" + empAddress + "]";
	}

}

public class Employee {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/classtaskD10/application-context.xml");
		EmpDetails ed = ac.getBean("empDetails", EmpDetails.class);
		System.out.println(ed);
	}

}
