package com.annotation.stereotypeD22;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Order {

	 @Value("#{'Pizza,Pasta'.split(',')}")
	private List<String> dishName;

	public void setDishName(List<String> dishName) {
		this.dishName = dishName;
	}

	@Override
	public String toString() {
		return "{Dish-Name=" + dishName + "}";
	}

}
