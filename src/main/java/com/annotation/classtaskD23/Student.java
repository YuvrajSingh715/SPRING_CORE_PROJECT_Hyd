package com.annotation.classtaskD23;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;

@Controller
@PropertySource("classpath:com/annotation/classtaskD23/applicationS1.properties")
public class Student {

	@Value("${Student_name}")
	private String name;

	@Value("${Student_id}")
	private String id;

	@Value("${Student_percentage}")
	private double percentage;

	@Value("${Student_fee}")
	private double fee;

	@Value("${Student_isEligible}")
	private boolean isEligible;

	public double calculateScholarship() {
		int scholarShip;
		if (percentage >= 75 && isEligible) {
			scholarShip = 25000;
		} else {
			scholarShip = 0;
		}
		return scholarShip;
	}

	public double calculateRemaningFee() {
		fee = fee - calculateScholarship();
		return fee;
	}

	@Override
	public String toString() {
		return "Student Details [name=" + name + ", id=" + id + ", percentage=" + percentage + ", fee=" + fee
				+ ", isEligible=" + isEligible + "]";
	}

}
