package interview;

import java.util.Arrays;

public class ConvertFromWrapperAndPremitiveArraytoString {

	public static void main(String[] args) {
		Integer i = null;
		String str = String.valueOf(i);
		
		//System.out.println(str);
		//System.out.println(i.toString());  // gives java.lang.NullPointerException
		//so always go with String.valueOf(object)  since returns as null for object ponting to null
		
		int[] arr = {1,2,3,5,6,7};
		System.out.println(Arrays.toString(arr));
		
		
	}

}
