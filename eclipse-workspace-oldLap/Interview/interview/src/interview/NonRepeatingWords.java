package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class NonRepeatingWords {
	static public void nonRepeatingWords(String str)
	{
		String[] words = str.split(" ");
		Map<String,Integer> hashMap = new HashMap<String,Integer>();
		for(String word : words)
		{
				if(hashMap.containsKey(word))
					hashMap.put(word, hashMap.get(word)+1);
				else 
					hashMap.put(word,1);
		}
		List<Entry<String,Integer>> list = new ArrayList<>();
		
		list = hashMap.entrySet().parallelStream().toList();  // imp
		
		List<Entry<String,Integer>> regen = list.stream().
				filter( e -> e.getValue() == 1).
				collect(Collectors.toList());
		
		System.out.println(regen);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonRepeatingWords("im shreedhar and im also");
	}

}
