package com.annotation.stereotypeD22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Here we are using the Stereo Type annotations.
//instead of @Component we can use @Service, @Repository, @Controller, @RestController also; 

@Component("hotel") //it will work as a bean id;
@Scope("prototype") 
public class Restaurant {

	private Menu menu;
	private Order order;

	public Restaurant() {
		System.out.println("Restaurant Object created by default constructor");
	}

	@Autowired
	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	@Autowired
	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Restaurant [Menu=" + menu + ", Order=" + order + "]";
	}

}
