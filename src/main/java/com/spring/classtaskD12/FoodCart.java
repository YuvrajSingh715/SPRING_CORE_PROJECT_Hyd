package com.spring.classtaskD12;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FoodCart {

	private List<String> dishName;

	public FoodCart() {

	}

	public List<String> getDishName() {
		return dishName;
	}

	public void setDishName(List<String> dishName) {
		this.dishName = dishName;
	}

	@Override
	public String toString() {
		return "FoodCart {Dish-Name=" + dishName + "}";
	}
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/classtaskD12/app-context.xml");
		FoodCart bean = context.getBean("foodCart", FoodCart.class);
		System.out.println(bean);
		
	}

}
