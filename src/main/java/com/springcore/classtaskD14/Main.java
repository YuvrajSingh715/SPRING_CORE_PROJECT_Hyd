
/*
Q1. If all three Library beans were left eligible for autowiring,
would "byType" autowiring still work for LibraryService? Why or
why not?
Ans- No. autowire="byType" works only when there is one bean of the required type. 
     If there are three beans of the same type, the IoC container cannot decide which bean to inject, 
     so it throws a NoUniqueBeanDefinitionException.


Q2. In what order do the four life cycle stages you used above
actually run for a single bean, from creation to shutdown?
Ans- Bean creation -> Depandancy injection -> init method(post construction logic) 
     -> destroy method(pre Destruction logic)


Q3. What is the difference between a bean simply "existing in the
container" and a bean being "autowire-eligible"?
Ans- Bean existing in the container mean IOC container has created and stored it.
     autowire-eligible it means ioc container is allowed to inject this bean automatically 
     into another bean. a bean with autowire-candidate="false" still exists but won't be chosen 
     for autowiring. 

*/


package com.springcore.classtaskD14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/classtaskD14/context.xml");

		LibraryService bean1 = context.getBean("libraryService", LibraryService.class);

		System.out.println(bean1.getNameAndCode());

		Library bean2 = context.getBean("library3", Library.class);

		int code = bean2.getLibraryCode();

		Library info = bean1.getInfo(code);

		//for getting Given Code is not found
//		Library info = bean1.getInfo(4);

		if (info != null) {
			System.out.println(info);
		} else {
			System.out.println("Given library code is not found");
		}

	}
}
