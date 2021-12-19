class Check
{
	public static void selection_sort(int [] arr)
	{
		for (int i =0 ; i<arr.length-1 ; i++ )
		{
			int check = arr[i];
			int index=0;
			for (int j =i+1 ; j<arr.length ; j++ )
			{
				if( check>arr[j] )
				{
					check = arr[j];
					index=j;
				}
			}
			arr[index] = arr[i];
			arr[i] = check;
		}

		for(int a : arr)
			System.out.println(a);
	}

	public static void main(String[] args)
	{
		int[] array = new int[]{35,21,5,7,3,10};
		selection_sort(array);
	}
}