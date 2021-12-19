package interview;

public class ReverseAString {
	static public String reversString(String str)
	{
		char temp = 0;
		char [] arr = str.toCharArray();
		int length = arr.length;
		for(int i = 0 ; i < length/2 ; i++)
		{
			temp = arr[i];
			arr[i] = arr[length-1-i];
			arr[length-1-i] = temp;
		}
		
		return new String(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "shreedhar";
		System.out.println(reversString(str));
	}

}
