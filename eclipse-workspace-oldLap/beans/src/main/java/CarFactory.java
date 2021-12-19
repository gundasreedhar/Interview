

//Non-static factoryClass
public class CarFactory {

	private String className;
	
	public  void setClassName(String className ) {
		this.className = className;
	}
	//Constructor private or public doesn't matter
	
	public Car getCar() throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		return ((Car)Class.forName(className).newInstance());
	}
	
}
