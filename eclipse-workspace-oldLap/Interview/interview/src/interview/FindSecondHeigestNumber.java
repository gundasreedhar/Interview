package interview;

// for this problem we should not solve by sorting the given array 
// coz {1,2,3,3} for this sorted array the second highest is 2 but gives 3.
public class FindSecondHeigestNumber {
	static int SecondHeigestNumber(int[] arr) {
		int first = arr[0],second = arr[1];
		int temp = 0;
		try 
		{
			for(int a : arr)
			{
				if(a > first)
				{
					temp = first;
					first = a;
					second = temp;
				}
				else if(a > second && a!= first)
					second = a;
			}
			System.out.println("first : " + first + "\nsecond : " + second);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			ex.printStackTrace();
		}
		return second;

	}

	public static void main(String... args) {
//		int[] array = { 2, 5, 25, 28, 1, 8, 26, 27, 28 };
//		int[] array = { -1, -2, -3 };// {2,5,25,28,1,8,26,27,28};
//		int[] array = { 3, 3, 3, 3 };
		int[] array = { -1, -2, 1 };

		System.out.println("second heigest number : " + SecondHeigestNumber(array));

	}
}
