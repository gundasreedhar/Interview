package interview;

public class FirstHighestNumber{
	static public int highest(int... arr )
	{
		int highest = arr[0];
		
		for(int a : arr)
		{
			if(highest<a)
				highest=a;
		}
		return highest;
	}
	public static void main(String[] args) {
		int highest = highest(1,2,3,5,6,6,3,77);
		System.out.println(highest);

	}

}
