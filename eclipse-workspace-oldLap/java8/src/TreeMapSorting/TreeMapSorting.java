package TreeMapSorting;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;
// TreeMap constructor provides u the reference of KEYS only.
// so using constructor allows sorting based on keys only. if atall u want to sort based on values. then refer below cases
// case 1 : if u want the NEW SORTED MAP OBJECT based on values then go with using below mentioned way in valueSort() method.
// case 2: if u just want to display tthe sorted map using values then go with stream() .
class Student{
	private int usn;
	private String name;
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + "]";
	}
	public Student(int usn, String name) {
		super();
		this.usn = usn;
		this.name = name;
	}
	
	
	
	
}
public class TreeMapSorting {
	
	
	// we can get the value of Map only by using the Map object so passing the map object
	static Map<Student,Integer> valueSort(Map<Student,Integer> treeMap)
	{
		//TreeMap constructor allows only sorting based on the keys. so we have to go with key
		/*
		Comparator<Student> valueComp = new Comparator<Student>()
		{
			@Override
			public int compare(Student o1, Student o2) {
				
				
				return treeMap.get(o1).compareTo(treeMap.get(o2));
			}
		};
		
		TreeMap<Student,Integer> newMap  = new TreeMap<Student,Integer>(valueComp);
		*/
		
		TreeMap<Student,Integer> newMap = new TreeMap<Student,Integer>
		           ( (a,b) -> treeMap.get(a).compareTo(treeMap.get(b)) );
		
		
		newMap.putAll(treeMap);
		return newMap;
	}
	
	public static void main(String[] args)
	{
		
		//tree 
		System.out.println("sorting based on keys -  using USN of student --  using constructor");
		
		Map<Student,Integer> treeMap = new TreeMap<Student,Integer>( (a,b) -> a.getUsn()<b.getUsn()?-1 : 
			a.getUsn()>b.getUsn()?1 : 0);
		
		treeMap.put(new Student(167,"Raghuu"),05);
		treeMap.put(new Student(7,"shreedhar"),44);
		treeMap.put(new Student(9,"brunda"),2);
		System.out.println(treeMap);
		
		System.out.println("------------------------------------------------------------------------------------------------------");
		/*
		treeMap.values().stream().sorted((a,b) -> a.compareTo(b)).forEach(System.out::println);
		treeMap.entrySet().stream().map( i -> i.getValue()).sorted((a,b) -> a.compareTo(b)).forEach(System.out::println);
		*/
		
		
		// just to display
		System.out.println("----------sorting on values using stream - just display------------");
		treeMap.entrySet().stream().sorted((a,b) -> a.getValue().compareTo(b.getValue())).forEach(System.out::println);
		System.out.println("------------------------------------------------------------------------------------------------------");
		// u can generate the new map object
		System.out.println("sorting using values of TreeMap object - can generate new map object");
		System.out.println(valueSort(treeMap));
	}
}