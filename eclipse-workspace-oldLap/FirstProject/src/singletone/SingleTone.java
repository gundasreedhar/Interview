package singletone;

/*
 * SingleTone:-> 
 *    This ensures to have only "one" object per application. 
 * 
 * SingleTone class have the private Constructor so we will have the public static Factory method   
 * to create the object of that class. since the Factory mehod is static so the reference variable
 * must also be static.  
 * 
 * Here the Factory method is responsible to create only the same class object
 */
public class SingleTone {
	private static SingleTone obj;

	public static SingleTone getSingleTone() {
		if (obj == null) {
			obj = new SingleTone();
			return obj;
		}

		return obj;

	}
	
	public void disp()
	{
		System.out.println("my name is shreedhar");
	}
	
	private SingleTone() {
		System.out.println("object is created");
	}
}
