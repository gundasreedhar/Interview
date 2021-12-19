package interview;

public class MissingNumber {
	static void missingNumber(int[] arr,int lastNumber)
	{
		int sum1 = (lastNumber*(lastNumber+1))/2,sum2=0;
		for(int a : arr)
		{
			sum2 += a;
		}
		int missingNumber = sum1 - sum2;
		System.out.println("missing number is  : " + missingNumber);
				
	}
	public static void main(String [] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,10};
		missingNumber(arr,10);
	}
}
