package java8practice;

//functional interface
interface Calculator {
	public float perform(float a,float b);
}

public class CalculatorimplUsingLambda 
{
	public static void main(String args[])
	{
		Calculator sum = (a,b) -> a+b; // returns a+b
		Calculator substraction = (a,b) -> a-b;
		Calculator division = (a,b) -> a/b;
		Calculator multiplication = (a,b) -> a*b;
		Calculator modulus = (a,b) -> a%b;
		
		System.out.println(sum.perform(2, 3));
		System.out.println(substraction.perform(3, 2));
		System.out.println(division.perform(4, 2));
		System.out.println(multiplication.perform(2,3));
		
		
		
		System.out.println("mudulus : " + modulus.perform(8, 3));
		
	}
}
