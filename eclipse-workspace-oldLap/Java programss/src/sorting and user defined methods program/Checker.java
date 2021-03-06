class Binary_Search 
{
	public static int search_index(int[] arr,int low,int high,int x)
	{
	//	count+=count;
		
		if (high >= low)
		{ 
            int mid = low + (high - low) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] > x) 
				return search_index(arr, low, mid - 1, x); 
			

            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            else if (arr[mid] < x) 
				return search_index(arr, mid + 1, high, x); 
  
            // Else the element can only be present 
            // in right subarray 
			
            else 
			{
				System.out.println("h=" + high + "\nl=" + low + "\nmid=" + mid);
			    return mid;
			}
        } 
  
        // We reach here when element is not present 
        // in array 
       return -1;
	}
	public static void main(String[] args) 
	{
		int [] array = {5,7,11,13,25,32};
		int n = array.length;
		System.out.println("The given array is : ");
		for(int q : array)
			System.out.println(q +" " );
		int val = 123;
		int index = search_index(array,0,n-1,val);
		if (index==-1)
			System.out.println("element " + val + " is not found in the array");
		else
			System.out.println("index of element " + val + " in array is " +  index);
	}
}
