package interview;

import java.util.ArrayList;
import java.util.List;

public class FibnocciSeries {
	public static void generateFibnocci(int range)
	{
		int[] fibSeries = new int[range];
		fibSeries[0] = 0; fibSeries[1] = 1;
		if(range>2)
		{
			for( int i=2; i<range ; i++ )
			{
				fibSeries[i] = fibSeries[i-1] + fibSeries[i-2];
			}
		}
		
		for(int a : fibSeries)
		{
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateFibnocci(6);
	}

}
