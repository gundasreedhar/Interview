
public class LargestContiguousIncreasingSubArray {

	public static void main(String args[]) {
		int arr[] = { 2, 1, 4, 7, 3, 50 };

		findLargestSumSubArray(arr);

	}

	private static void findLargestSumSubArray(int arr[]) {

		int a = -1;
		int b = -1;
		int s1 = 0;
		int s = 0;
		int e = 1;
		int sum = arr[0];
		int max = Integer.MIN_VALUE;
		int n = arr.length;
		while (s <= n - 1 && e <= n - 1) {
			if (arr[e] < arr[s]) {

				if (sum > max) {
					a = s1;
					b = e - 1;
					max = sum;
				}

				s = e;
				s1 = s;
				sum = arr[s1];
				e = e + 1;

			}

			else {
				sum = sum + arr[e];
				s = e;
				e = e + 1;
			}
		}

		if(sum>max){
			a = s1;
			b=e-1;
		}
		
		System.out.println("values  are " + "max is " +  max  + " with indexes " +  a + " , " + b);
	}

}
