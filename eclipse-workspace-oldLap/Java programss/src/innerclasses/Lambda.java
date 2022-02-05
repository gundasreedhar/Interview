 /*
Inner class is a class within a class.

Types of Inner classes:-
1. Nested or non-static inner class
2. Static Nested class 
3. Method Local inner class  
4. Anonymous class
5. Lambda  // not a inner class 

*/
/* This is "Lambda Expression" example
 * LAmbda Expression is through which we can represent the Anonymous function.
 * Anonymous function is nameless function.
 * syntax: ( )     ->      {}                          //parameter expression body
 * First-of-all Lambda Expression is NOT A INNER-CLASS.
     Since, upon compiling, the inner class's .class file is not created.
 * Introduced in java 8 
 * Lambda expressions allow you to create the function that does not belong to any class and pass functionality as 
	an argument to the method and is executed on demand.
 * Used for implementing the functional interface only.
		-fun_interface is a interface with ONLY-ONE abstract method in it and can contain any number of default methods and static methods.
 * This majorly focuses on removing the boiler plate code in traditional way of implementing the interface and
   in inner class aswell.
    --------------------------------
    ADVANTAGE IN DOING THIS IS THAT,
	--------------------------------
	1. NO need to create a new class to implement the functional interface:->
	     -Removes the over-head in creating new class that implements the interface which is created 
	     for ONLY-AND-ONLY to implement that functional interface.
	2. Removal of boiler plate code or reduces the code length :->
		 - Reduces the code that required to pass the functonality as argument to the method.
		 - No need to specify the function name and datatype of arguments aswell.
		 - () is not required if only one argument that function is taking.
		 - open and close braces and the return keyword((if fun imple returning smtg)), is not required for SINGLE LINE IMLEMENATION 
	
	3. NO INNER CLASS IS CREATED upon compiling so the size of byte code is reduced thus, Memory efficient. 
	--------------
	DISADVANTAGEs,
	--------------
	1. This works for only Functional interface.
	2. This doesnot work for abstract class with one abstract method also.
	3. above advantage cant be applied for interface with more than one abstract methods in it.

*/
import java.util.function.Consumer;
	interface Maths
	{
		void fun(int h,int j);
	} 
	
	class Cal
	{
		/*public void operate (Integer a,Consumer m ) 
		{
			m.accept(a);
		}*/

		public void operate(Integer a, Integer b, Maths m)
		{
			m.fun(a,b);
		}
	}
	class Lambda
	{
		public static void main(String [] args)
		{
	
			Integer p = 5;
			Integer q = 10; 
			Maths add = (h,j) -> System.out.println(" Addition : " + (h+j) ); // implementation
			Maths sub = (h,j) -> System.out.println(" substract : " + (h-j) );// implementation
			Cal c = new Cal(); 
			c.operate(p,q,add);  // passing the functionality "add" as an argument to a method
			c.operate(p,q,sub);  // passing the functionality "sub*" as an argument to a method
			
			
			
			
			
			
			
			
			//Maths add = (h,j) -> {System.out.println("Addition : " );
		//						  return h+j;
		//						  };
			//Maths sub = (h,j) -> {return (h-j) ;};
			///BiConsumer<Integer,Integer> c = (Integer i, Integer j) -> System.out.println(" addition : " + (i+j));
		/*	Consumer<Integer> c = i -> System.out.println(" addition : " + i);
			Cal d = new Cal();
			d.operate(p,c); */


			
			//c.operate(p,q,(h,j) -> System.out.println(" addition : " + (h-j)));
//			System.out.println("Addition : " + c.operate(p,q,add));
//			System.out.println("subsract : " + c.operate(p,q,sub));
			//c.operate(40,35,add);

		}
	}

// Lambda expression definition :
// Lambda expression is required to implement the functional interface wihtout creating the 
// inner_class upon compiling and allows to pass the fuctionality as an argument in function call.