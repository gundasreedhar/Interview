/*
Inner class is a class within a class.

Types of Inner classes:-
1. Nested or non-static inner class
2. Static Nested class 
3. Method Local inner class  
4. Anonymous class
5. Lambda

*/
/* This is "Anonymous_inner_class" example
 * Anonymous inner class is a inner class with no name to it.
 * They make the code to look more CONCISE.
 * They enable us to DECLARE AND INSTANTIATE a class at the same time.
 * They are like Local Class only but they dont have a name to it.
  
 * wrt CONCRETE CLASS this Anonymous_inner_class allow us to OVERRIDE the method, ADD NEW method 
   and data member to that object ONLY.
	And this DOES NOT AFFECT the original members of class upon other object creation.
	  
 * wrt INTERFACES AND ABSTRACT CLASS if we want to use that class for only once then we go with 
   using anonymous class to implement interfaces or abstract classes instead, of creating a SEPERATE
   CLASS and implementing these interfaces or abstract classes. 
     

  --------------------------------------
   syntax:->
 
   Test t = new Test()
   {
	 //defining the body for t
   };
   ---------------------------------------
   Test can be concrete class, abstract class 
   or intrface
 * These two cases are demonstrated below:
 * 
 * we have three types Anonymous inner class they are:
   1. Anonymous inner class that extends a class.
   2. Anonymous inner class that implements a interface.
   3. Anonymous inner class that defines inside the method/ constructor argument.
        - in this we define the annms_class that implements a interface and creates the object of that class
			and the ref of that object is PASSED as argument of that menthod or constructor.
			 ex:
				-----------------------------------------------------
			    Thread t = new Thread ( new Runnable()
				{  // annoms_class that implements Runnable interface
					public void disp()
					{
						System.out.println("my name is shreedhar");
					}
				});

				t.disp();
				------------------------------------------------------
 */

 abstract class Outer // abstract class
 { 
	 public void show()
	 {
		 System.out.println("Anonymous");
	 }
 }
 interface Outer_inter  // interface
 {
	 public void show_inter();
 }

 class Anonymous_inner_class
 {
	 public static void main(String[] srag)
	 {
		 
		 Outer obj1 = new Outer()  // for abstract class
		 {
			public void show()  //overriding a method
			{
				Syst em.out.println("modified show() of obj1: " + num);
			}
			int num = 20;  // and also create new filds in this object only.
		 };

		Outer_inter obj2 = new Outer_inter() //  calling consructor
		 {  
			// defining a class that implements the interface
			// new keyword going to create the object of this class and = opertor returns the ref of this object
			public void show_inter() 
			 {
				System.out.println("Anonymous using inerface : " + num);
			 }
			int num = 100;
		 };
		 obj1.show();
		 obj2.show_inter();
	 }
 } 
 
 