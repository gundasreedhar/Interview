package Shreedhar;

public class Second
{
	{
		System.out.println("Non - Static block is Executing");
	}
	Second()
	{
		System.out.println("construcor is called");
	}
	public static void main(String [] args)
	{
		String str = new String ("Shreedhar");
		Second s = new Second();
	}
}
