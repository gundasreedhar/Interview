package com.gunda.Magic;
// This is SingleTon Class implementation 
public class CarSingleton {

	private static CarSingleton c;
	private CarSingleton() {}
	//factory method should be static
	public static CarSingleton getObject()
	{
		if(c==null)
		{
			c = new CarSingleton();
			return c;
		}
		else
		{
			return c;
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	public void disp()
	{
		System.out.println("Method of Car class is called");
	}
	
	
	
}
