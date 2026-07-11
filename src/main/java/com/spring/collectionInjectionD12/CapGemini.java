package com.spring.collectionInjectionD12;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CapGemini {

	private Properties database;

	public CapGemini() {

	}

	public CapGemini(Properties database) {
		this.database = database;
	}

	public void setDatabase(Properties database) {
		this.database = database;
	}

	@Override
	public String toString() {
		return "CapGemini [database=" + database + "]";
	}

	// This code is just for verification purposes, to check whether the values are
	// injected into the variables or not

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/collectionInjectionD12/collection.xml");
		CapGemini bean = context.getBean("capgemini", CapGemini.class);
		System.out.println(bean);

	}

}
