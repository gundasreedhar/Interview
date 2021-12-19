package interview;

public class SwappingWithoutThirdVariable {
	//numberSwap
	static public void numberSwap(int a,int b)
	{
		System.out.println("input : a = " + a + " , " + "b = " + b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("output : a = " + a + " , " + "b = " + b);
		
	}
	
	//stringSwap
	static public void stringSwap(String a, String b)
	{
		System.out.println("input : a = " + a + " , " + "b = " + b);
		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println("output : a = " + a + " , " + "b = " + b);
	}
	
	
	public static void main(String[] args) {
		numberSwap(2,3);
		stringSwap("dhar","shree");
	}

}
