package com.spring.beanautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Engine {

	private String engineType;
	private String horsePower;
	
	public Engine() {
		
	}
	
	public Engine(String engineType, String horsePower) {
		this.engineType = engineType;
		this.horsePower = horsePower;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public void setHorsePower(String horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Engine Details= {Engine-Type=" + engineType + ", Horse-power=" + horsePower + "}";
	}
	
	//just for verification purpose like values are injected or not
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/beanautowiring/autowiring.xml");
		Engine eng = context.getBean("engine", Engine.class);
		System.out.println(eng);
		
	}

}
