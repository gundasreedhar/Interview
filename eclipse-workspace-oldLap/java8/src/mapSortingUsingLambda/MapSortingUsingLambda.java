package mapSortingUsingLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapSortingUsingLambda {
	public static void main(String[] args)
	{
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("shree",90);map.put("brunda",99);map.put("nikil",60);map.put("raghu",70);
		List<Entry<String,Integer>> entrySet =  new ArrayList(map.entrySet());
		System.out.println(entrySet);
		Collections.sort(entrySet, new Comparator<Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue()) ;
			}
			
		});
		
		for(Entry<String,Integer> entry:entrySet)
		{
			System.out.println(entry.getKey()+"::"+entry.getValue());
		}
		
		System.out.println(map);
		
		
		map.entrySet().stream()
			.sorted( (a,b) -> a.getValue().compareTo(b.getValue()) )
			.collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("-----------------");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("-----------------");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		System.out.println("-----------------");
		
		map.entrySet().stream().forEach(System.out::println);
	
	}

}
