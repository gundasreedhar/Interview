class Demo 
{
	public static void main(String[] args) 
	{
		String str = "aeIY   123#@2";
		char [] arr = str.toCharArray();
		int vowels = 0;
		int consonent = 0;
		int number = 0;
		int spcl = 0;
		int spaces = 0;
		for (int i =0 ; i<arr.length ; i++ )
		{
			if( arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' ||
				arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U' )
				vowels++;
			else if(arr[i] > 47 && arr[i] <58)
				number++;
			else if( arr[i] == 32 )
				spaces++;
			else if (arr[i]>=65 && arr[i] <=90 || arr[i] >=97 && arr[i] <=122)
				consonent++;
			else 
				spcl++;
 		}
		System.out.println(vowels  +"\n" + consonent +"\n" + spaces + "\n" + number + "\n" + spcl); 
	}
}
