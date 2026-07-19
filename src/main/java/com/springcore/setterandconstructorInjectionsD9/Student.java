package com.springcore.setterandconstructorInjectionsD9;

public class Student {

	private int id;
	private String name;
	private String city;
	private IDCard idCard;

	public Student() {
		System.out.println("Student class default constructor called");
	}

	public Student(int id, String name, String city, IDCard idCard) {
		System.out.println("Student class parameterized constructor called");
		this.id = id;
		this.name = name;
		this.idCard = idCard;
		this.city = city;
	}

	public void setId(int id) {
		System.out.println("Id setter called");
		this.id = id;
	}

	public void setName(String name) {
		System.out.println("Name setter called");
		this.name = name;
	}

	public void setCity(String city) {
		System.out.println("City setter called");
		this.city = city;
	}

	public void setIdCard(IDCard idCard) {
		this.idCard = idCard;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", idCard=" + idCard + "]";
	}

}
