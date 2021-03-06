class Binary_Search 
{
	public static int [] sort(int[] arr, int n)  // Shell sort technique
	{
		for(int gap = n/2 ; gap>0 ; gap=gap/2 )  //  this forloop for gap = gap/2; formula until it satisfies i.e., untill gap=0
		{
			for(int i = gap ; i<=n-1  ; i++ ) //this forloop to trace all the values from the point of gap towards right till the last element of array
			{
				/* this forloop is for :-> from the point of gap to compare
				with all the values((left side of fixed value i.e.,arr[gap])) that satisfies "j-gap index >=0". 
				*/
				for(int j = i ; j>=0 && (j-gap)>=0 ; ) 
				{
					
					if(arr[j]<arr[j-gap])
					{
						int temp = arr[j];
						arr[j] = arr[j-gap];
						arr[j-gap] = temp;
						j= j-gap;
					}
					j--;
				}
			}
		}
		return arr;
	}

	public static int search_index(int[] arr,int l,int h,int x,int count)
	{
		count+=count;
		
		if (h >= l)
		{ 
            int mid = l + (h - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
			{System.out.println(count+1);
			return mid; }
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            else if (arr[mid] > x) 
			{
				System.out.println(count+1);
				return search_index(arr, l, mid - 1, x, ++count); 
			 
			}
  
            // Else the element can only be present 
            // in right subarray 
            else
			{
				System.out.println("value of h");
				return search_index(arr, mid + 1, h, x, ++count); 
				
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
		array = sort(array,n);
		System.out.println("The sorted array is : ");
		for(int a : array)
			System.out.println(a);

		int val = 11;
		int index = search_index(array,0,n-1,val, 0 );
		if (index==-1)
			System.out.println("element " + val + " is not found in the array");
		else
			System.out.println("index of element " + val + " in array is " +  index);
	}
}
