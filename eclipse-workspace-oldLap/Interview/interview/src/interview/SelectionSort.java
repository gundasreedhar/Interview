package interview;
/*
 * here in this algorithm, the given array is sorted by repeatedly finding the min element from unsorted 
   part and putting it at the beginning of the unsorted array.
   
 */
public class SelectionSort {
	
	static public void sort(int[] arr)
	{
		boolean flag = false;
		int tempValue = 0;
		int index = 0;
		int min = 0;
		
		for (int i = 0 ; i < arr.length-1 ; i++)
		{
			min = arr[i];
			index = i;
			tempValue = 0;
			flag = false;
			for(int j = i+1 ; j<arr.length ; j++)
			{
				if(arr[j] < min)
				{
					min = arr[j];
					index = j;
					flag = true;
				}
			}
			if(flag == false)
				continue;
			
			tempValue = arr[i]; 
			arr[i] = min;
			arr[index] = tempValue;
		}
		
		for(int a : arr)
		{
			System.out.println(a);
		}
	}
	public static void main(String... args)
	{
		int[] arr = {6,7,8,9,-1,10,4,5,1,2,3};
		sort(arr);
		
		
	}
}
