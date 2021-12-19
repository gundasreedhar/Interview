package lockdown;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;
class IntrestCalc
{
	
}
class Bank{
	private int num;
	private int den;
	int compute()
	{
		try {
			System.out.println("please provide the numeraor and denominator");
			num = new Scanner(System.in).nextInt();
			den = new Scanner(System.in).nextInt();
			System.out.println(num/den);
			System.out.println("try block");
			return 25;
		}
		
		
		
		finally {
			System.out.println("final block");
		}
		//System.out.println("after catch");
	}
	
	
}

public class ExceptionHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj = new Bank();
		try{
			
			System.out.println(obj.compute());
		}
		catch(Exception e)
		{
			//System.out.println(e);
			System.out.println("exception handled in main");
		}

	}

}
