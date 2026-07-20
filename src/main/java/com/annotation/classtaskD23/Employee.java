package com.annotation.classtaskD23;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component 
@PropertySource("classpath:com/annotation/classtaskD23/applicationE.properties")
public class Employee {

	@Value("${Employee_id}")
	private String id;

	@Value("${Employee_name}")
	private String name;

	@Value("${Employee_experience}")
	private int exprience;

	@Value("${Employee_basicSalary}")
	private double salary;

	@Value("${Employee_projectCompleted}")
	private boolean projectCompleted;

	public double getIncrement() {
		if (projectCompleted) {
			salary = salary + 50000;
		}
		return salary;
	}

	@Override
	public String toString() {
		return "Employee Details [id=" + id + ", name=" + name + ", exprience=" + exprience + ", salary=" + salary
				+ ", projectCompleted=" + projectCompleted + "]";
	}

}
