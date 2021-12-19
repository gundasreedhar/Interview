package interview;

//Java code for Bill Pugh Singleton Implementation
class GFG {

	private GFG() {
		// private constructor
	}

//Inner class to provide instance of class
	private static class BillPughSingleton {
		private static final GFG INSTANCE = new GFG();
	}

	public static GFG getInstance() {
		return BillPughSingleton.INSTANCE;
	}
}

public class BillPughSingletonImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GFG obj1 = GFG.getInstance();
		GFG obj2 = GFG.getInstance();
		
		
		if (obj1 == obj2)
			System.out.println("same reference");
		else
			System.out.println("not a same refenrece");

	}

}
