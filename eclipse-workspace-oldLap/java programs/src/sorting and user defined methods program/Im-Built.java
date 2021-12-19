
/*
we can convert the array of characters into string object in two ways
1. using Im-Built String functions.
2. using User defined function.
*/
/*
1.using Im-Built functions i.e.,
  String str = new String(char_array);
	(or)
  String.valueOf(char_array);
*/class Im-Built 
{
	public static void main(String[] args) 
	{
		char[] arr = {'d', 'f','E', 'u'};
		String str = new String(arr);
		System.out.println(str);
		// (or)
		System.out.println(String.valueOf(arr));
	}
}
