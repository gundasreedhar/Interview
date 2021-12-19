package autowiring;
// Autowire helps u do the DI automatically
// we can do autowire in two ways:
// 1. XMLbased.
// 2. Annotation based.
import org.springframework.beans.factory.annotation.Autowired;

public class AutowireAnnotate {
	// if u dont use autowire and also if u don't do the DI in Xml there is exception thrown
	// but if you use @Autowired then u need to do the DI for the dependencies.
	// @Autowired(required = false) here required allows u to skip the DI for the specified property.
	// the default value of attribute required is true.
	@Autowired(required = false)
	private int age;
	public void setAge(int age) {
		this.age = age;
	}
	
}
