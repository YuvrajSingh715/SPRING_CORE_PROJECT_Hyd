package com.springcore.beanlifecycleD13;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	int  x ;

	public BeanLifeCycleDemo() {
		System.out.println("default constructor executes");
	}
	
	public void destroy() {
		System.out.println("pre distruction logic executes (destroy)");
		this.x = 0;
		System.out.println("x" + " = " + x);
	}

	public int getX() {
		System.out.println("get method executes");
		return x;
	}

	public void setX(int x) {
		System.out.println("set method executes");
		this.x = x;
	}

	@Override
	public String toString() {
		System.out.println("toString method executes");
		return "BeanLifeCycleDemo [lifeCycle=" + x + "]";
	}

	public void init() {
		System.out.println("post construction logic executes (init)");
		this.display();
	}

	public void display() {
		System.out.println("Custom method executes");
	}

	

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanlifecycleD13/app-context.xml");

		BeanLifeCycleDemo blc = context.getBean("lifeCycle", BeanLifeCycleDemo.class);
		
		System.out.println(blc);
		
		context.close();
	}

}
