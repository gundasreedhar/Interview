package beans.Spring;

/*
 *  In this LifeCycle implementation the methods init() and destroy() are there.
 *  The init() method is the method which executes only once in its entire life time.
 *  The destroy() method is executed before the object is destroyed.
 *  Here we need to use ConfigurableApplicationContext to implement the LifeCycleMethods.
 *  To activate annotations we need to use:->
 *  <bean class = "org.springframework.context.annotation.CommonAnnotationBeanPostProcessor">
	</bean>     
 *  we can use either XML based or Annotation based config.	
 */




import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;

public class LifeCycleAnnotation {
	
	@PostConstruct
	public void myInit()
	{
		System.out.println("connextions are open"); 
	}
	
	@Autowired()
	public LifeCycleAnnotation() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor");
	}
	
	public void service()
	{
		System.out.println("services are served");
	}
	
	@PreDestroy
	public void myDestroy()
	{
		System.out.println("Connections are Closed");
	}
	
}
