package com.springcore.setterandconstructorInjectionsD9;

public class Student {

	private int id;
	private String name;
	private String city;

	public Student() {
		System.out.println("Student class default constructor called");
	}
	
	public Student(int id, String name, String city) {
		System.out.println("Student class parameterized constructor called");
		this.id = id;
		this.name = name;
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

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		System.out.println("toString method called");
		return "Student {ID = " + id + ", NAME = " + name + ", CITY = " + city + "}";
	}

}
