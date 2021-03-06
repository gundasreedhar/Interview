
class Insertion_Sort 
{
	public static int[] adjust (int[] arr, int change, int fixed)
	{
		int temp = arr[fixed];
		int fix=fixed;
		for( int i = fix-1 ; i >= change ; i-- )
		{
			arr[fix--] = arr[i];
		}
		arr[change] = temp;
		return arr;
	}
	public static void main(String[] args) 
	{
		int[] array = new int[]{10,2,2,11,4,4};
		for ( int i=1 ; i<array.length ; i++ )
		{
			int temp =-1;
			for (int j = i-1 ; j != -1 ; j-- )
			{				
				if( array[i] < array[j] )
						temp = j;
			}
			if(temp!=-1)
				array = adjust(array, temp , i );
		}
		for(int a : array)
			System.out.println(a);
	}
}
