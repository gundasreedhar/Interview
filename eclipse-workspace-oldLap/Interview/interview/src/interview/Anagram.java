package interview;

import java.util.Arrays;
import java.util.Iterator;
// length must be equal and both words must contain all the characters


public class Anagram {
	static public void checkAnagram(String str1,String str2)
	{
		try {
				if(str1.length() == str2.length())
				{
					char[] arr1 = str1.toLowerCase().toCharArray();
					char[] arr2 = str2.toLowerCase().toCharArray();
					int sum1 =0,sum2=0;
					
					for(char b : arr1)
						sum1+=b;
					for(char b : arr2)
						sum2+=b;
					
					if(sum1==sum2)
						System.out.println("anagram");
					else 
						System.out.println("not an aanagram");
					
				}
				else {
					System.out.println("not an anagram");
				}
			
		}
		catch(NullPointerException ex)
		{
			ex.printStackTrace();
			System.out.println("please enter the valid string");
		}
	}
	public static void main(String[] args) {
		checkAnagram("shreedhar","sharrehed");
		checkAnagram("shreedhar",null);
	}

}
