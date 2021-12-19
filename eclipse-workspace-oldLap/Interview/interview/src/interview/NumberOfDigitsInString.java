package interview;

public class NumberOfDigitsInString {
	static public int numberOfDigitsInString(String str)
	{
		char[] arr = str.toCharArray();
		int count = 0;
		
		//48 = 0  // 65 = A  // 97 = a
		
		for(char c : arr)
		{
			if((c>=48) && (c<=57))
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("number of digits in the string are :" + 
		numberOfDigitsInString("abc1000def9"));
	}

}
