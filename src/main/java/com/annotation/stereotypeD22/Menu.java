package com.annotation.stereotypeD22;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class Menu {

	@Value("#{{'Pizza':'₹250', 'Burger':'₹150', 'Pasta':'₹220', 'Momos':'₹120', 'Biryani':'₹300'}}")
	private Map<String, String> dishesNameAndPrice;

	public void setDishesNameAndPrice(Map<String, String> dishesNameAndPrice) {
		this.dishesNameAndPrice = dishesNameAndPrice;
	}

	@Override
	public String toString() {
		return "{Dishes-Name-And-Price=" + dishesNameAndPrice + "}";
	}

}
