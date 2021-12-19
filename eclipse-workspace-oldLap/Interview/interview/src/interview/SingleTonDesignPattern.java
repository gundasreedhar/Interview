package interview;
/*
Advantges:

	1. Lazy initialization is possible.
	2. It is also thread safe.
	3. Performance might affect in the first time due to Synchronized block.
	
Analize: 
 In the multithreaded environment,
 During first time of object creation there is chance that many threads come to getSingleTonObject() for asking the object.
 Here in the below code, instead of giving synchronized keyword in the method level which affects the performance greately.
 we can give the synchronized block for the code that creates the object. so there by performance affecting can be greately reduced.
 in the synchronized block it is compulsion that we have to check for the "obj == null" everytime, If u don't write the this, then 
*/
class SingleTon
{
	String name = "";
	
	private static SingleTon obj = null;
	
	static public SingleTon getSingleTonObject()
	{
		if(obj==null)
		{
			// many threads during first time will be waiting here so, again inside synchronized block we have to check for the obj==null
			// if not writing the synchronized block is meir of waste.
			synchronized (SingleTon.class) {
				if(obj==null)
				{
					obj = new SingleTon();
				}
			}
		}
		return obj;
	}
	
	public void disp()
	{
		System.out.println("Successfull in calling the method ");
	}
	
	
	//constructor
	// we force to use getSingleTonObject() method to get the object
	private SingleTon(){}  // disable calling the SingleTon obj = new SingleTon(); from main
	
	public SingleTon(String name )
	{
		this.name = name ;
	}
}
public class SingleTonDesignPattern {
	public static void main(String... args)
	{
		SingleTon obj1 = SingleTon.getSingleTonObject();
		SingleTon obj2 = SingleTon.getSingleTonObject();
		
		obj1.disp();
		
		if(obj1==obj2)
			System.out.println("same reference");
		else 
			System.out.println("not a same reference");
	}
}
