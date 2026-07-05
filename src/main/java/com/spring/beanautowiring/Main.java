package com.spring.beanautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/beanautowiring/autowiring.xml");
		Car c = con.getBean("car", Car.class);
		System.out.println(c);
		
	}

}

//=====================================byName mode=======================================\\
/*
 * When we provide autowire="byName", the IOC container immediately looks at the
   class for which the bean is declared and checks the attribute name present
   inside that class. After picking up that attribute name, it searches for a
   bean defined in the xml-configuration file with the same name as the
   attribute or not.
 */

/*
 * if bean defined with the same name as the attribute name that time, it will
   inject the dependency with the help of the setter method.
 * as a result you will get values.
 * Car Details [Car-Name=Audi, Engine Details= {Engine-Type=EA825, Horse-power=591–621 HP}]
 */

/*
 * if bean is not defined with the same name as the attribute name that time, it
   will not inject the dependency with the help of the setter method. 
 * as a result you will get null values.
 * Car Details [Car-Name=Audi, null]  -->> Engine details are null
 */

/*
 * Note: If we change the attribute name of the class and try to inject with a
   different name, we get a null value, not an exception.
 */
//=====================================byName mode=======================================\\



//=====================================byType mode=======================================\\
/*
 * dentify the dependency by matching the class type of the target class ↩
 ↪ attribute with the bean's class type in the IOC container.
 * Perform the injection of the dependency through the setter method.
 */

/*
 * Note: If we use byType and provide two beans of the same type, we get an
   exception, because the IOC container gets confused about which bean should be
   injected. To resolve this, we write autowire-candidate="false" on one of the
   beans.
 */
//=====================================byType mode=======================================\\


//---------------------------Difference Between These Modes-------------------------------\\
/*
 * Both byName and byType work through the setter method. The basic difference
   between them is: 
 • In byType, if we change the name of the class attribute,
   there is no issue in injecting the value, because it checks the type, not the
   name. 
 • In byName, if we change the name of the class attribute, the value
   will not get injected, because it works with the name, not the type.
 */

//======================================constructor mode=========================================
/*
• Identify the dependency by matching the constructor argument type of the target class.
• Perform the injection through constructor injection.
*/

/*
 * Note: If we add two beans of the same class type while using autowire="constructor", we do not get
   an exception, but the value also does not get injected, because both beans are of the same type
   present in the constructor parameter. To get the value injected, we must write
   autowire-candidate="false" on one of the bean definitions.
*/

/*
 * Note: If a class has multiple constructors and we use constructor autowiring,
   the IOC container injects the dependency through constructor injection by
   able to satisfy.
   invoking the constructor with the maximum number of parameters that it is
 */