package innerclasses;

/*
Inner class is a class within a class.

Types of Inner classes:-
1. Nested or non-static inner class
2. Static Nested class 
3. Method Local inner class  
4. Anonymous class
5. Lambda

*/
/*
 * This is "Static_Nested_Inner_Class" example
 * 
 * Here static inner class will NOT have the refernce to the outer class
 * 
 * A static inner class can access ONLY static fields and methods in outer class. 
 * It cant access instance methods and non static variables of outer class directely.
 * but, can use non-static fields by using outer class object.
 * 
 * you can create the object of the static inner class in the outer class method and can use it.
 * 
 * if u want to create the object of the static inner class, you will need the object of the outer class here. as shown below
 * 
 * 
 */


class Outerrr
{
	
	static public void disp()
	{
		System.out.println("shreedhar");
	}
	static int num = 60;
	public void s()
	{
		new Inner().show();
		System.out.println("Non - Static method or Instance method can be accessed only \nthrough Outer class object ");
	}
    static class Inner 
	{
		public void show()
		{
			System.out.println("shreedhar" + num);
			disp();
			//  s();  here inner class dont have an access to the instance methods
			new Outerrr().s();  //  can use non-static fields like this.
		}
	}

}

public class Static_Nested_Inner_Class
{
	public static void main(String[] args)
	{
		Outerrr.Inner obj = new Outerrr.Inner();
		obj.show();
		//so s() method can be accessed only through the Outer class object
		new Outerrr().s();
	}

}

