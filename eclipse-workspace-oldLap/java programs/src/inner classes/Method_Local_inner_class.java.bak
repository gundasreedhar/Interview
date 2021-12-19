/*
Inner class is a class within a class.

Types of Inner classes:-
1. Nested or non-static inner class
2. Static Nested class 
3. Method Local inner class  
4. Anonymous class
5. Lambda

*/
/* This is "Method_Local_inner_class" example
 * 
 * In this type of inner class, a class will be present inside the member function of the outer class
 * Here the method can be non-static or the static. static method call-rules do apply.    
 *
 * The inner class have reference to the outer class memebrs and also the members of the method 
 * in which the class is present.
 *
 * Method can access the class members upon creaing its object, as shown below.
 */

class Outer 
{
	int num = 10;
	public void show() 
	//static public void show() 
	{
		int a = 20;
		class Inner
		{
			public void disp()
		    {
				System.out.println("Hello World! " + num );  // access outer class members
				System.out.println("Hello World! " + a );  // access method's data
			}
		}
		// Accessing the inner class members.
		Inner o = new Inner();  
		o.disp();   
	}
}
class Method_Local_inner_class
{
	public static void main(String [] srags)
	{
		Outer obj = new Outer();
		obj.show();
	}
} 
