package beans.Spring;

/* SingleTon class is a class which allows u to create only one instance of that class and return
 * the same instance everytime when request for new instance is made.
 *   
 *   <---Rules of SingleTon class--->
 *   
 *   1. Restricts the instantiation of class and ensures only one instance exits in the JVM.
 *   2. The singleton should provide the Global Access Point to get the instance of the class  
 *   
 *   
 *   Used in:-->
 *   
 *   1. core java class like java.lang.Runtime and java.awt.Desktop
 *   
 *   
 *   Used for :--> 
 *   
 *   1. logging.
 *   2. drivers object.
 *   3. caching and thread pool.
 *   
 *   Creating the SingleTon class:->
 *   
 *       There are so many ways of creating the singleton class but two recommended ways are:
 *       1.  Using the Double checked locking principle.
 *       2.  Using enum. (Highly recommended)
*/
// 1. Thread-Safe Singleton with Double checked locking principle.
//
// Here the checking for the instance take place two times once before Locking and 
// another time after locking in order to overcome the cost for synchronization.
public class SingletonDesign implements Cloneable{

	// since static factory method cant access the non-static content so the instance(ref variable)
	// is made static.
	private static SingletonDesign instance;
	private SingletonDesign() {}
	// Factory method shud be public and static  
	public static SingletonDesign getInstance()
	{
		if(instance == null)
		{
			synchronized(SingletonDesign.class)
	 		{
				if(instance == null)
				{
					instance = new SingletonDesign();
				}
			}
		}
		
		return instance;
	}
	
	public void disp()
	{
		System.out.println("Successfully implemented");
	}
	/*
	 * protected Object clone() throws CloneNotSupportedException { throw new
	 * CloneNotSupportedException(); }
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException();
	}
}
/*
 This is Singleton using the enum.
 // This is simple but need to learn the dependency injection for this.

package Shreedhar;

public enum EnumClass {
	instance(15000);
	
	private int salary;
	private EnumClass(int salary) {
		this.salary = salary;
	}
	public void disp()
	{
		System.out.println("The salary is : " + salary);
	}
	
}
*/