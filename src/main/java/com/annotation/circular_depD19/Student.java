package com.annotation.circular_depD19;

import lombok.ToString;

@ToString
public class Student {

	private Course course;

	public Course getCourse() {
		return course;
	}

//	@Required
	// it will not work directly required needs the spring core&context version less than 6
	public void setCourse(Course course) {
		this.course = course;
	}

}
