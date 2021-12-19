package tcs;

public class Sorting {
	static public void sort(int[] arr)
	{
		int temp = 0;
		for(int i = 0 ; i < arr.length-1 ; i++) {
			
			for(int j = 0 ; j <arr.length-1-i ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
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
		int[] arr = {2,4,67,81,5,0,3};
		sort(arr);
	}

}
