package interview;

import java.util.HashMap;
import java.util.Map;

public class A_B__AB__CB_BC {
	//...A..B..A..B..C..C
	public void computeLengthOfLongestSubArrays(String str)
	{
		Map<Character,Integer> map = new HashMap<>();
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			
			if(ch!='.')
			{
				
				if(map.containsKey(ch))
				{
					System.out.println("The length from " + ch + "to" + ch + " is " + (i-map.get(ch)+1));
					map.remove(ch);
				}
				else 
					map.put(ch,i);
				
			}
		} 
	}	
}

class Launchh
{
	public static void main(String[] args)
	{
		A_B__AB__CB_BC obj = new A_B__AB__CB_BC();
		obj.computeLengthOfLongestSubArrays("...A..B..A..B..C.BB.C");
		
	}
}
