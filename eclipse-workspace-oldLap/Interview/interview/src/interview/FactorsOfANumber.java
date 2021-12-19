package interview;

import java.util.ArrayList;
import java.util.List;

public class FactorsOfANumber {

	static public void factorsOfANumber(int num)
	{
		List factors = new ArrayList();
		factors.add(1);
		
		for(int i = 2 ; i <= num/2 ; i++)
		{
			if(num%i==0)
				factors.add(i);
		}
		
		factors.forEach(System.out::println);
			
	}
	
	public static void main(String[] args) {
		factorsOfANumber(6);
		
	}

}
