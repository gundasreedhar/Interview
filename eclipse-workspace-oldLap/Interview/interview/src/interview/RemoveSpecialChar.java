package interview;

import java.util.ArrayList;
import java.util.List;

public class RemoveSpecialChar {
	public static void removeSpecialCharUsingRegex(String str)
	{
		if(str != null)
		{
			String reGenStr = str.replaceAll("[^A-Za-z0-9]","");
			System.out.println(reGenStr);
		}
		else {
			System.out.println("please provide the string");
		}
	}	
	
	public static void removeSpclChar(String str)
	{
		
		if(str != null)
		{
			char[]  arr = str.toCharArray();
			int sum = 0;
			List<Character> list = new ArrayList<>(); 
			for(Character ch : arr)
			{
				if((ch >= 48 && ch <= 57) || (ch >= 65 && ch  <= 91) || (ch >= 97 && ch  <= 123))
				{
					list.add(ch);
				}
			}
			String mStr = "";
			for(Character c : list)
			{
				mStr += c;
			}
			System.out.println(mStr);
		}
		else 
			System.out.println("please provide the string");
		
	}
	
	public static void main(String[] args) {
		String str = "SHReedhar@123";
		removeSpclChar(null);
		
	}

}
