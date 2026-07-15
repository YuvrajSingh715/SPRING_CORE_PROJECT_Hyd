package com.annotation.circular_depD19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ABCMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/annotation/circular_depD19/context.xml");

		A bean = context.getBean("a", A.class);
		
		System.out.println(bean);
		
		
		//if we are trying to inject the value of variables then we have to use setter injection 
        //coz constructor is mandatory but setter is optional.
		
		//in case of constructor this is circular dependencies situation we are facing. 
		
	}

}
