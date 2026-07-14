
/*Program 1: Setter Injection with Primitive Type
--------------------------------------------------
A library wants to store basic details of a Book — title, price, and number of pages. No object should depend on any other class here, just simple values.
Requirement:

Create a class Book with fields: title (String), price (int), pages (int)
Use setter injection only (no constructor injection)
Inject values using the <property> tag in XML
Print the book details using toString()

Hint (not solution):

Think about what happens inside each setter — add a print statement like "Book title setter called" similar to how Student class did it
Your <bean> tag will only use <property name="..." value="..."> — no <constructor-arg> here*/


package com.springcore.classtaskD10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class BookDetails {

	private String title;
	private int pages;
	private int price;

	public BookDetails() {
		System.out.println("BookDetails class default constructor called");
	}

	public void setTitle(String title) {
		System.out.println("BookDetails class title setter called");
		this.title = title;
	}

	public void setPages(int pages) {
		System.out.println("BookDetails class pages setter called");
		this.pages = pages;
	}

	public void setPrice(int price) {
		System.out.println("BookDetails class price setter called");
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookDatials {Title=" + title + ", Pages=" + pages + ", Price=" + price + "}";
	}

}

public class Library {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/classtaskD10/application-context.xml");
		BookDetails bd = ac.getBean("library" , BookDetails.class);
		System.out.println(bd);
		
	}

}
