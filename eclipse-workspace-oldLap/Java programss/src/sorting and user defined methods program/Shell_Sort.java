class Shell_Sort 
{
	public static int [] sort(int[] arr, int n)
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

	public static void main(String[] args) 
	{
		int [] input = {2,5,21,3,5,15,6,4}; 
		int l = input.length;
		input = sort(input,l);
		for(int a : input )
			System.out.println(a);
	}
}