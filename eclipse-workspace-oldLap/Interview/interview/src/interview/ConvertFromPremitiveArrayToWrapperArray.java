package interview;

import java.util.Arrays;

public class ConvertFromPremitiveArrayToWrapperArray {
	public static void main(String... args)
	{
		int [] arr = {1,2,4,5,6,7,32};
		Integer[] wraapperArray = 
				Arrays.stream(arr).boxed().toArray(Integer[]::new);
		System.out.println(Arrays.toString(wraapperArray));
	}
}
