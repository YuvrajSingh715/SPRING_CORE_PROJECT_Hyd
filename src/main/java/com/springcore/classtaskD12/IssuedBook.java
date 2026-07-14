package com.springcore.classtaskD12;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IssuedBook {

	private List<String> issuedBook;

	public IssuedBook() {

	}

	public IssuedBook(List<String> issuedBook) {
		this.issuedBook = issuedBook;
	}

	public List<String> getIssuedBook() {
		return issuedBook;
	}

	public void setIssuedBook(List<String> issuedBook) {
		this.issuedBook = issuedBook;
	}

	@Override
	public String toString() {
		return "{Issued-Book=" + issuedBook + "}";
	}

	// This code is just for verification purposes, to check whether the values are
	// injected into the variables or not

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/classtaskD12/app-context.xml");
		IssuedBook issuedBook = context.getBean("issuedBook", IssuedBook.class);
		System.out.println(issuedBook);

	}

}
