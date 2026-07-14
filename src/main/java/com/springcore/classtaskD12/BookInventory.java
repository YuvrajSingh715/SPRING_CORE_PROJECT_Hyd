package com.springcore.classtaskD12;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookInventory {

	private Map<String, Integer> bookInventory;

	public BookInventory() {

	}

	public BookInventory(Map<String, Integer> bookInventory) {
		this.bookInventory = bookInventory;
	}

	public Map<String, Integer> getBookInventory() {
		return bookInventory;
	}

	public void setBookInventory(Map<String, Integer> bookInventory) {
		this.bookInventory = bookInventory;
	}

	@Override
	public String toString() {
		return "[Book-Inventory=" + bookInventory + "]";
	}

	// This code is just for verification purposes, to check whether the values are
	// injected into the variables or not

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/classtaskD12/app-context.xml");
		BookInventory bookInventory = context.getBean("bookInventory", BookInventory.class);
		System.out.println(bookInventory);

	}
}
