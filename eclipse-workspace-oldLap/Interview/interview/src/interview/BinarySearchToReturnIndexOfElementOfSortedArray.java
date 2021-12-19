package interview;

import java.util.Arrays;
// Time complexity : O(log n) 
public class BinarySearchToReturnIndexOfElementOfSortedArray {
	static int BinarySearch(int[] arr, int key)
	{
		int low = 0, high = arr.length-1, mid = 0,index = -1;
		
		while(low<=high)
		{
			mid = low + ((high-low)/2);
			
			if(key>arr[mid])
				low = mid+1;
			else if(key<arr[mid])
				high = mid-1;
			else if(key == arr[mid])
			{
				index = mid;
				break;
			}
		}
		
		return index;
	}
	
	public static void main(String[] args)
	{
		//int[]  priceOfBottles= { 1000, 2500,3200,4000, 4500, 4700, 5000, 5200, 5400, 5444, 5500};
		int[]  priceOfBottles= { 1000, 2500,3200,4000};
		String[] bottles = {"Tuberg","Kingfisher","calsburg","Burry"};
		int key = 3200;
		System.out.println(Arrays.toString(priceOfBottles));
		int index = BinarySearch(priceOfBottles,key);
		if(index>=0)
			System.out.println("here you go, enjoy having : " + bottles[index] + " ;)");
		else 
			System.out.println("im sorry pls select the correct bottle");
	}
}
