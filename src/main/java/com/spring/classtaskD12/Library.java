package com.spring.classtaskD12;

import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Library {

	private Set<Members> memberInfo;
	private Map<IssuedBook, BookInventory> bookInfo;

	public Library() {

	}

	public Library(Set<Members> memberInfo, Map<IssuedBook, BookInventory> bookInfo) {
		super();
		this.memberInfo = memberInfo;
		this.bookInfo = bookInfo;
	}

	public Set<Members> getMemberInfo() {
		return memberInfo;
	}

	public Map<IssuedBook, BookInventory> getBookInfo() {
		return bookInfo;
	}

	public void setMemberInfo(Set<Members> memberInfo) {
		this.memberInfo = memberInfo;
	}

	public void setBookInfo(Map<IssuedBook, BookInventory> bookInfo) {
		this.bookInfo = bookInfo;
	}

	@Override
	public String toString() {
		return "Library [MemberInfo=" + memberInfo + ", BookInfo=" + bookInfo + "]";
	}

	// This code is just for verification purposes, to check whether the values are
	// injected into the variables or not

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/classtaskD12/app-context.xml");
		Library library = context.getBean("library", Library.class);
		System.out.println(library);

	}

}
