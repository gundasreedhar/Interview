package beans.Spring;

import java.lang.reflect.InvocationTargetException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowiring.AutowireAnnotate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException
    {
		// Using the J2EE Container
    	// Application context is built on top of the BeanFactory i.e., it extends the Beanfactory 
    	// and so it has all the features of BeanFactory and also more othr features as wel
    	// Mainly application context is used for building the large "Enterprise applicaions"
    	// Now through this Application context im accessing the Spring Containr(in specific the 
    	// J2EE container).
    	// so now im loading the spring.xml file into the Spring conatiner.

		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("resource/Spring.xml"); Car c = (Car)
		 * context.getBean("car"); List<String> models = c.getModel(); models.forEach( n
		 * -> System.out.println(n));
		 */
    	
    	/*
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("resource/Spring.xml");
    	LifeCycleAnnotation bean = (LifeCycleAnnotation)context.getBean("life");
    	bean.service();
    	context.close();
		*/
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("resource/Spring.xml");
    	AutowireAnnotate bean = (AutowireAnnotate) context.getBean("anno");
    	
    	
    	
    	/*
		 * SingletonDesign obj1 = (SingletonDesign)context.getBean("obj");
		 * SingletonDesign obj2 = (SingletonDesign)context.getBean("obj"); if(obj1 ==
		 * obj2) { System.out.println("Same References"); } obj1.disp(); obj2.disp();
		 */
    	
		/*
		 * Class oo = Class.forName("SingletonDesign"); Constructor[] con =
		 * oo.getConstructors(); con[0].setAccessible(true); //SingletonDesign no =
		 * (SingletonDesign)con[0].newInstance(null);
		 * 
		 * 
		 * //no.disp(); System.out.println("cloningggggggggggg"); //SingletonDesign bala
		 * = (SingletonDesign) obj1.clone(); //bala.disp();
		 */    	
    	
    	
    /*
     * Life cycle implementation code is below:
     *  	
    	ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("Spring.xml");
    	LifeCycleAnnotation t = (LifeCycleAnnotation)cap.getBean("test");
    	t.service();
    	cap.close();
	*/
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
