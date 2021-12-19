package interview;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ShowOnlyUniqueElementsinPremitiveArray {

	static public void showUnique(int[] arr)
	{
		// convert primitive int array to ArrayList using java-8 streams
		Set<Integer> uniqueElements = Arrays.stream(arr).boxed().collect(Collectors.toSet());
		System.out.println(uniqueElements);
	}
	public static void main(String[] args) {
		int [] arr = {1,2,4,6,7,3,2,2,4,6,8,9};
		showUnique(arr);
	}

}
