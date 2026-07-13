package com.spring.AnnotationD18;

public class ESTest {

	public static void main(String[] args) {

//	with record
		Employee emp = new Employee("John", 32, "Hyderabad");
		System.out.println("with record: "+emp);
		// emp.setName("JonSnow"); // Not allowed - no setter exists
		// emp.name("JonSnow");
		System.out.println(System.lineSeparator());

//		with Lambok
		Student stu = new Student("Rohan", 12311, "Math");
		System.out.println("with lambok: "+stu);
		stu.setName("Steve");
		System.out.println("Name modification: "+stu);
	}

}
