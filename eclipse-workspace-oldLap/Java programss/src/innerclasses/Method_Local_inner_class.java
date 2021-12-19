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
 * in which the class is present, so can access directely.
 * 
 * Here this inner class inside the method is SPECIFIC TO ONLY METHOD in which it is present
 * we CAN'T USE THIS CLASS OUTSIDE THE METHOD.
 *
 * Method can access the class members upon creating its object, as shown below.
 * 
 * Outside the method we cant access the inner class present in the method.
 */
package innerclasses;
class OuterML 
{
	int num = 10;
	public void show() 
	//static public void show() 
	{
		int a = 20;
		// cant create the obejct of inner class here
		class Inner
		{
			public void disp()
		    {
				System.out.println("Hello World! " + num );  // access outer class members
				System.out.println("Hello World! " + a );  // access method's data
			}
		}
		// Accessing the inner class members.
		// can create the object of inner class here
		// can write after the class only. you cant write before the class declartion
		Inner o = new Inner();  
		o.disp();   
	}
	
	
	
	
}
class Method_Local_inner_class
{
	public static void main(String [] srags)
	{
		OuterML obj = new OuterML();
		obj.show();
	}
} 
