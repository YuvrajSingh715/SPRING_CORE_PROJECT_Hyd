package com.spring.AnnotationD18;

import java.lang.annotation.Retention;

//Custom Annotation

@CACarShowRoom(brandName = "BMW", gear = 8, carModel = "A8")

/*
 * Annotation attributes can be written in an order
 * 
 * @CACarShowRoom(gear = 8, carModel = "A8", brandName = "BMW")
 */

public class CACompany {

	public static void main(String[] args) {

		// Annotation attributes can be written in an order
		CACompany cac = new CACompany();
		System.out.println("String hashCode: " + cac); // give the hashCode in a string from
		System.out.println("Integer hashCode: " + cac.hashCode()); // give the hashCode in a Integer from
		
		
		// Annotation attributes can be written in an order
		Class<CACompany> ref = CACompany.class;
		CACarShowRoom csr = ref.getAnnotation(CACarShowRoom.class);
		
		System.out.println("Brand Name: " + csr.brandName());
		System.out.println("Gear: " + csr.gear());
		System.out.println("Car Model: " + csr.carModel());
		
	}

}
