package com.annotation.classtaskD23;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com.annotation.classtaskD23");

		Product pro = context.getBean("product", Product.class);

		System.out.println(pro);

		System.out.println("Discount details: " + pro.getDiscount());

	}

}
