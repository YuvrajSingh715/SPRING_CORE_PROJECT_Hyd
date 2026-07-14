package com.annotation.classtaskD18;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Employee {

	int employeeId;
	String employeeName;
	double employeeSalary;
	Department department;

}
