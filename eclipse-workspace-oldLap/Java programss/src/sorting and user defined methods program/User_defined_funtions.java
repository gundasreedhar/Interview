class User_defined_funtions
{
	/*
	This method removes the number and special characters from the string 
	*/
	public static String remove_num_spcl (String s)
	{
		String str = "";
		char [] arr = s.toCharArray();
		for(int i=0 ; i<arr.length ; i++ )
			if( arr[i]>=65 && arr[i] <=90 || arr[i]>=97 && arr[i] <= 122 )
				str = str + arr[i];
		
		return str;
	}

	/*
	This method converts upper case to lower case
	*/
	public static String LowerCase(String str )
	{
		char [] array = str.toCharArray();
		for(int i = 0 ; i<str.length() ; i++)
		{
			if( array[i]>=65 && array[i] <=90 )
				array[i] += 32;				
		}
		return ArrayToString(array); //user defined method   
		//return new String(array); //imbuilt method
		//return String.valueOf(array); // imbuilt method
	}

	/*
	This method converts Array of characters to String 
	*/
	public static String ArrayToString(char[] arr)
	{
		String str = "";
			for(char c : arr)
				str += c;
			return str;
	}

	public static void main(String[] args) 
	{
		System.out.println("sHrEEdhAr1362b,jFah");
		System.out.println("after removing the special characters :-->\n " + remove_num_spcl("sHrEEdhAr1362b,jFah") );
		System.out.println("converting the above mentioned string to Lower case :-->\n " + LowerCase(remove_num_spcl("sHrEEdhAr1362b,jFah")));	
		
	}
}