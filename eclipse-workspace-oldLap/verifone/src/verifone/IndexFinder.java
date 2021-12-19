package verifone;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
//input : gunda shreedhar
//gunda shree d  h  a  r
//01234 56789 10 11 12 13
public class IndexFinder {
	
	static public void display(String str)
	{
		Map<Character,ArrayList<Integer>> map = 
				new LinkedHashMap<Character,ArrayList<Integer>>();
		
		for(int i= 0 ; i< str.length() ;i++ )
		{
			char c = str.charAt(i);
			if(c == ' ')
				continue;
			if(!map.containsKey(c))
			{
				ArrayList index = new ArrayList();
				index.add(i);
				map.put(c,index);
			}
			else if(map.containsKey(c))
			{
				map.get(c).add(i);
			}
		}
		
		for(Entry<Character,ArrayList<Integer>> e : map.entrySet())
		{
			System.out.println(e.getKey() + " is in position " + e.getValue());
		}
		
	}
	public static void main(String[] args) {
		
		display(args[0]+args[1]);
	}

}
