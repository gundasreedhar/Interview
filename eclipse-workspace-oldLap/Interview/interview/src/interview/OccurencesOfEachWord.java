package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccurencesOfEachWord {
	static public void checkOccurences(String str)
	{
		Map<String,Integer> hashMap = new HashMap<>();
		String[] words = str.split(" ");
		for(String word : words)
		{
			if(hashMap.containsKey(word))
				hashMap.put(word, hashMap.get(word)+1);
			else 
				hashMap.put(word,1);
		}
		
		//iterate using keySet() method
		for(String key : hashMap.keySet())
		{
			System.out.println(key +" : " + hashMap.get(key) );
		}
		
		//iterate using entrySet()
		for(Entry<String,Integer> e : hashMap.entrySet())
		{
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
	public static void main(String[] args)
	{
		String str1 = "im shreedhar and im also shreedhar also";
		checkOccurences(str1);
	}
}
