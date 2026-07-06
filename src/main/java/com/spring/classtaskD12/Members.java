package com.spring.classtaskD12;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Members {

	private Set<String> memberEmails;

	public Members() {

	}

	public Members(Set<String> memberEmails) {
		this.memberEmails = memberEmails;
	}

	public Set<String> getMemberEmails() {
		return memberEmails;
	}

	public void setMemberEmails(Set<String> memberEmails) {
		this.memberEmails = memberEmails;
	}

	@Override
	public String toString() {
		return "[Member-Emails=" + memberEmails + "]";
	}

	// This code is just for verification purposes, to check whether the values are
	// injected into the variables or not

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/classtaskD12/app-context.xml");
		Members members = context.getBean("members", Members.class);
		System.out.println(members);

	}

}
