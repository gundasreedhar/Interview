package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WaystoConvertFromArrayToArrayList {

	public static void main(String[] args) {
		// convert from Wrapper Array to List using Arrays.asList();
		Integer[] arr = {1,2,4,5,6,7,3,21,};
		//List<Integer> list1 = Arrays.asList(arr);
		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		//ArrayList<Integer> list = (ArrayList<Integer>) Arrays.asList(arr);
		System.out.println(list);
		
		// convert primitive array to List using java 8 streams
		int[] primitiveArr = {1,2,4,5,6,7,3,21};
		List<Integer> listOfPrimitive = Arrays.stream(primitiveArr).boxed().collect(Collectors.toList());
		System.out.println(listOfPrimitive.getClass());
		System.out.println(listOfPrimitive);
		
		
	}
}
