package interview;

import java.util.Arrays;
import java.util.List;

public class ConvertFromCollectionToArray {
		
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5); // array to arrayList
		Integer[] arr2 = list.stream().toArray(Integer[]::new);
		System.out.println(Arrays.toString(arr2));  
	}

}
