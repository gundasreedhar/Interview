package Shreedhar;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class LambdaExpr
{
	public static void main(String args[])
	{
		Integer[] i_arr = new Integer[5];
		for(int i =0 ; i <5 ; i++)
		{
			i_arr[i] = i+1;
		}
				
		List<Integer> arr = Arrays.asList(i_arr);
		arr.forEach(i -> System.out.println(i));
				
		//forEach()
	}
}