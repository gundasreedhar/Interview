package interview;
/*
 	this sorts the given array by repeatedly swapping the adjacent element.
 	in the process during each iteration, 
 	the heaver element bubbles-up to the end.
 */
public class BubbleSort {
	
	public static void sort(int[] arr)
	{
		int temp = 0;
		for(int i = 0 ; i < arr.length-1 ; i++) // -1 coz whn i = length-1 then below wil be i>j so to avoid it
		{
			for(int j = 0 ; j < arr.length-1-i ; j++ )  // -1 coz we check the adjacent elemnt
			{											// -i coz during each iteration the heavear element settle to the end
														// so in next iteration no need to compare with that heaver one so
				if(arr[j]>arr[j+1])
				{   //swap
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int a : arr)
		{
			System.out.println(a);
		}
	}
	
	public static void main(String... args)
	{
		int[] arr = {2,4,5,8,1,7,-1,6,3,0};
		sort(arr);
	}
}
