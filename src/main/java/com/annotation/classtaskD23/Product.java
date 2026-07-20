package com.annotation.classtaskD23;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:com/annotation/classtaskD23/applicationP.properties")
public class Product {

	@Value("${Product_name}")
	private String name;

	@Value("${Product_id}")
	private String id;

	@Value("${Product_price}")
	private double price;

	@Value("${Customer_isPremium}")
	private boolean isPrime;

	public double getDiscount() {
		if (isPrime) {
			price = price - (price * 0.20); // 20% discount
		}
		return price; // original price
	}

	@Override
	public String toString() {
		return "Product Details [name=" + name + ", id=" + id + ", price=" + price + ", isPrime=" + isPrime + "]";
	}

}
