package interview;

import java.util.Arrays;

public class SecondHighestUsingSorting {

	static public void SecondHighestUsingSorting(int[] arr)
	{
		Arrays.sort(arr);
		int first = arr[arr.length-1];
		int second = arr[arr.length-2];
		int i = arr.length-3;
		while(second==first)
		{
			second = arr[i];
			i--;
			if(i<0)
			{
				second = first;
				break;
			}
			
			
		}
		System.out.println("second highest : "+second);
	}
	public static void main(String[] args) {
		int [] arr1 = {3,2,3,1,3,3,3,3,3,3};
		int [] arr2 = {3,3,3};
		int [] arr3 = {3,3,-3};  // [-3,3,3]
		SecondHighestUsingSorting(arr3);

	}

}
