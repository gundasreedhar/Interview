package Shreedhar;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


class PrivateConstrctorUsingClassclass {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		Class c = Class.forName("Shreedhar.Student");
	
		Constructor[] dc = c.getDeclaredConstructors();
		for(int i = 0 ; i<dc.length ; i++)
		{
			System.out.println(dc[i]);
		}
		dc[0].setAccessible(true);
		//System.out.println(dc[0]);
		
		Student audi = (Student)dc[0].newInstance(null);
		audi.disp();
		//Constructor [] declaredConstructor = c.getDeclaredConstructor(null);
		//declaredConstructor.
	}
}