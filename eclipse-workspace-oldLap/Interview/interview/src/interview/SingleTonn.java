package interview;


public class SingleTonn {
	
	String name = "";
	private static SingleTonn obj = null;
	
	static public SingleTonn getSingleTonObject()
	{
		if(obj==null)
			obj = new SingleTonn();

		return obj;
	}
	
	public void disp()
	{
		System.out.println("Successfull in calling the method ");
	}
	
	
	//constructor
	// we force to use getSingleTonObject() method to get the object
	private SingleTonn(){}  // disable calling the SingleTon obj = new SingleTon(); from main
	
	public SingleTonn(String name )
	{
		this.name = name ;
	}
	
}

class Demoo
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleTonn obj1 = SingleTonn.getSingleTonObject();
		obj1.disp();
		
		SingleTonn obj2 = new SingleTonn("shreedhar");
		if(obj1==obj2)
			System.out.println("same reference");
		else 
			System.out.println("not same reference");
		
		

	}

}

