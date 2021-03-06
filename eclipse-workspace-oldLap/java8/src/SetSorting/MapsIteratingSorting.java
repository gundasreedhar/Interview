package SetSorting;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapsIteratingSorting {
	
	static Map<Student,Integer> valueSort(Map<Student,Integer> treeMap)
	{
		TreeMap<Student,Integer> newMap ;
		Comparator<Student> valueComp = new Comparator<Student>()
		{
			@Override
			public int compare(Student o1, Student o2) {
				
				
				return treeMap.get(o1).compareTo(treeMap.get(o2));
			}
		};
		
		newMap = new TreeMap<Student,Integer>(valueComp);
		newMap.putAll(treeMap);
		return newMap;
	}
	
	public static void main(String[] args)
	{
		Map<Student,Integer> map = new LinkedHashMap<Student,Integer>();
		Student s1 = new Student(5,"shredhar");
		Student s2 = new Student(2,"brunda");
		Student s3 = new Student(3,"Raghu");
		
		map.put(s1,95);
		map.put(s2,100);
		map.put(s3,35);
		
		//way 1
		System.out.println(map);
		
		//way 2
		for(Entry<Student,Integer> e: map.entrySet())
		{
			System.out.println(e.getKey() + ":" + e.getValue());
		}
		
		System.out.println("----------------------------------");
		
		//way 3
		map.entrySet().stream().forEach(System.out::println);
		
		System.out.println("----------------------------------");
		
		
		
		Set setOfEntryObjects = map.entrySet();
		
		System.out.println(setOfEntryObjects);
		
		System.out.println("---------------ch-------------------");
		
		map.entrySet().stream().sorted((a,b) -> a.getValue().compareTo(b.getValue())).forEach(System.out::println);
		
		System.out.println("----------------------------------");
		
		map.entrySet().stream().sorted( (a,b) -> a.getValue().compareTo(b.getValue()) ).forEach(System.out::println);
		
		System.out.println("----------------------------------");
		
		map.entrySet().stream().sorted( (a,b) -> a.getKey().getUsn() < b.getKey().getUsn() ? -1 : a.getKey().getUsn() > b.getKey().getUsn() ? 1 : 0)
			.forEach(System.out::println);
		
		System.out.println("----------------------------------");
		
		int min = map.entrySet().stream().map( i -> i.getValue()).min((a,b) -> a<b?-1 : a>b?1 : 0).get();
		int max = map.entrySet().stream().map( i -> i.getValue()).max((a,b) -> a<b?-1 : a>b?1 : 0).get();
		System.out.println("minimum value : " + min);
		System.out.println("maximum value : " + max);
		
		System.out.println("----------------------------------");
		//s3 = null;
		map.entrySet().stream().forEach(System.out::println);
		
		System.out.println("----------------------------------");
		
			}
}