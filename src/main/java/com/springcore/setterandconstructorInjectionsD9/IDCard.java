package com.springcore.setterandconstructorInjectionsD9;

public class IDCard {

	private String schoolCode;
	private String standard;

	public IDCard() {
		System.out.println("IDCard Object Created by default constructor");
	}

	public IDCard(String schoolCode, String standard) {
		super();
		System.out.println("IDCard Object Created by parameterize constructor");
		this.schoolCode = schoolCode;
		this.standard = standard;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "{schoolCode=" + schoolCode + ", standard=" + standard + "}";
	}

}
