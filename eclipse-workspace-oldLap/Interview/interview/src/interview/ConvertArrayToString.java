package interview;

import java.util.Arrays;

public class ConvertArrayToString {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		String str = Arrays.toString(arr);
		System.out.println(str); // prints [1,2,3,4]
		
		//following wont work
		// arr.toString()       //  prints the reference value of array
		// String.valueOf(arr)  //  prints the reference value of array
		
//		Integer a = 2;
//		System.out.println(String.valueOf(a).getClass());
		
	}

}
