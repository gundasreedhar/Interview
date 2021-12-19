package interview;

import java.util.Scanner;

public class FactorialOfANumber {
	static int factorial(int num)
	{	
		if(num == 0)
			return 1;
		
		int fact = 1;
		fact = num;
		int check = num;  // manditory
		for(int i = 2 ; i <= check; i++)
		{
			fact*=--num;
			System.out.println();
		}
		return fact;
	}
	
	static int FactorialUsingRecursion(int num)
	{
		if(num == 0) // ZERO because fact of zero is one and also it is stopping condition
			return 1;
		
		return num * FactorialUsingRecursion(num-1);
	}
	
	public static void main(String... args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num = obj.nextInt();
		
		System.out.println("Factorial of " + num + " is " + FactorialUsingRecursion(num));
			
	}
}
