package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//if any element is repeating then remove all the occurences of that element
//if u want to show the unique elements from the array then use below code
/*
 * List<Integer> list = new ArrayList<>(Arrays.asList(arr));
 * Set<Integer> set = new HashSet(list);
 */
public class SingleOccurringElementInArray {
	static public void deleteRepeatedElementsInIntegerArray(Integer[] arr) {
		
		Set<Integer> repeated = new HashSet<>();
		List<Integer> nonRepeated = new ArrayList<>();
		
		for(int a : arr)
		{
			if(repeated.contains(a))
				continue;
			if(nonRepeated.contains(a))
			{
				nonRepeated.remove(a);
				repeated.add(a);
			}
			else {
				nonRepeated.add(a);
			}
		}
		List<Integer> numbers = new ArrayList(Arrays.asList(arr));  //  very imp
		
		
		for( Integer a : repeated)
		{
			while(numbers.contains(a))
				numbers.remove(a);  // removes only the first occurrence of the element
		}
		
		
		numbers.forEach(System.out::println);
		
		
	}

	public static void main(String... args) {
		Integer[] arr = {1,2,3,4,3,2,5};
		deleteRepeatedElementsInIntegerArray(arr);
	}
}
