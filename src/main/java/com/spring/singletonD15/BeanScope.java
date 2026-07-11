package com.spring.singletonD15;

public class BeanScope {

	private String name;
	private int id;

	public BeanScope() {
		System.out.println("default constructor");
	}
	public BeanScope(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BeanScope [name=" + name + ", id=" + id + "]";
	}

}
