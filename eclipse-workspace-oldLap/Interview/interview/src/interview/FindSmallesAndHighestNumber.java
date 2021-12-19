package interview;

public class FindSmallesAndHighestNumber {
	static public void FindSmallesAndHighestNumber(Integer[] arr)
	{
		int small = arr[0],high = arr[0];

		for(int i = 1 ; i<arr.length ; i++)
		{
			if(small>arr[i])
				small = arr[i];
				
			if(high<arr[i])
				high = arr[i];
		}
		
		System.out.println("smallest element : "+ small + "\n" + 
				"highest number : "+high);
	}
	public static void main(String... args)
	{
		Integer[] arr = {4,5,6,1,2,3};
		FindSmallesAndHighestNumber(arr);
	}
}
