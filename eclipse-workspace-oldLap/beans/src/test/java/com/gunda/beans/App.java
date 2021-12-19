package com.gunda.beans;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		public static void main(String[] args) {
			// Using the J2EE Container
	    	// Application context is built on top of the BeanFactory i.e., it extends the Beanfactory 
	    	// and so it has all the features of BeanFactory and also more othr features as wel
	    	// Mainly application context is used for building the large "Enterprise applicaions"
	    	// Now through this Application context im accessing the Spring Containr.
	    	// so now im loading the spring.xml file into the Spring conatiner.

	    	ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("Spring1.xml");
	    	LifeCycleAnnotation t = (LifeCycleAnnotation)cap.getBean("test");
	    	t.service();
	    	cap.close();

	    	//  scope check for Car class i.e., prototype 
	    	/*	Car c1 = (Car)context.getBean("rangerover");
	    		Car c2 = (Car)context.getBean("rangerover");
	    		c1.drive();
	    		
	    		c2.change("MRF");
	    		System.out.println("after change");
	    		c1.drive();
	    		c2.drive();
	    	*/
	    		/*Car c2 = (Car)context.getBean("audi");
	    		Car c3 = (Car)context.getBean("bmw");
	    		System.out.println("Before Changing");
	    		c1.drive();
	    		c2.drive();
	    		c3.drive();
	    		System.out.println("After Changing C2, The change is not Reflected in all the objects but only in the C2 object");
	    		c2.change("mahca");
	    		c1.drive();
	    		c2.drive();
	    		c3.drive();*/
	    		//c.drive();
			/* Tyre t = (Tyre)context.getBean("tyre"); */
			/* System.out.println(t); 
			 * */
	    	
	    	
	   

		}

}
}
