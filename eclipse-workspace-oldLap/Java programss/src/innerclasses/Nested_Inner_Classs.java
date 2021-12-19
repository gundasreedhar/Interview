/*
Inner class is a class within a class.

Why do we need the inner class in java?
  - increases the encapsulation
  - readability and maintainability of the code is increased since all the required classes
    will be placed inside the class.
  - Best example is EVENT HANDLERS
  	"For example, in designing a graphical user interface (GUI), a developer may have created a 
  	 button that performs a particular task after the user presses it.
		The button would need an event handler which listens for when that particular button is 
		pressed.

      In this case, creating the event handler for the button as an inner class would be best 
      practice as the inner class would not be utilized anywhere else other than with the 
      specific button within the GUI class."

Types of Inner classes:-
1. Nested or non-static inner class
2. Static Nested class 
3. Method Local inner class  
4. Anonymous class
5. Lambda // not a inner class

/*
 * This is nested inner class example
 * 
 * This non-static inner class WILL HAVE THE REFERENCE to the outer class so,
 * the inner class can HAVE ACCESS to all the members of outer class including private members directly without creating the object.
 * 
 * Any outer class method can create the object of the any(be it static or non static) inner class inside the method.

 * An outer class can have all the member of normal class.
 * 
 * Here the non-static inner class and also Outer class can inherit a class and can 
 * also implement an interface as well.
 *
 * A NESTED INNER CLASS means a CLASS CONTAINING NON-STATIC CLASS INSIDE IT.
 * But, 
 * we can have 'N' number of non-static and static classes inside a class.
 * but, static inner class can access ONLY static members of outer class.
 * where as, NON-static inner class can have access to both static and non-static members of outer class including private fields.
 *
 * You can have the static method in the outer class and can be accecced directely using its name in the inner class.
 *
 * Here the Outer class and inner class can be the abstract class but since you	CAN'T CREATE the object of the abstract class so 
 * you need to create an empty class and Extends that outer clsss and so then you can create the object of the 
 * New class and can use the Outer class.
 * 
 * Check the Object creation of both Outer and Inner class.
 */
package innerclasses;
abstract class Parent
{
     abstract public void sing();
     //{
       //  System.out.println("a parent can sing very  nice");
     //}
}
class OuterN extends Parent 
{
	private int salary = 22;  // outer class can have fields
	
	public int  getSalary()  // can have Concrete methods
	{
	    return salary;
	}
	void disp()    // can have static methods 
	{
	    System.out.println("inside the static mehod ");
	}
	OuterN ()   // can have constructos
	{
	    salary = 500;
	}
	public void sing()
		{
			System.out.println("a parent can sing  wellll");
		}
	// abstract void mantra(); //cant have abstract methods since we cant instantiate abstract class
	static void stMethod()
	{
		System.out.println("This is the static method"); 
	}
	class Inner 
	{
		
		public void show()
		{
			System.out.println("my name is shreedhar and my salary is " + salary);
			sing();
			stMethod();
		}
	}
}
public class Nested_Inner_Classs
{
	public static void main(String [] args)
	{
		OuterN o = new OuterN();  // Object of Outer class  
		o.disp();
		OuterN.Inner obj = o.new Inner(); // Object of Inner class
		obj.show();    // obj can access all the members outer class
	}
}
