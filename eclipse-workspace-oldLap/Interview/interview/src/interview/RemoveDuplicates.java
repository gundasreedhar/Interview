package interview;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	
	public static void removeDuplicates(int[] arr)
	{
		List<Integer> list = new ArrayList<Integer>();
		
		for (int a : arr)
		{
			if(!list.contains(a))
				list.add(a);
		}
		
		System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,3,3,4,4,5,5,5,5,7,8,8,8,9,10,10};
		removeDuplicates(arr);
	}

}
