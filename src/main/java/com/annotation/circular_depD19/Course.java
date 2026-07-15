package com.annotation.circular_depD19;

import lombok.ToString;

@ToString
public class Course {

	private String courseName;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
