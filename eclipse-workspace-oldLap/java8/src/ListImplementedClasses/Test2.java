package ListImplementedClasses;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
	public static void main(String [] rgs)
	{
		List<Integer> list= new ArrayList<Integer>();
		list.add(23);
		list.add(65);
		list.add(86);
		list.add(21);
		list.add(7);
		list.add(94);
		list.add(5);
		
		List<Integer> l2 =  new ArrayList<Integer>();
		l2 = list.stream().filter(i-> i%2 == 0).collect(Collectors.toList());   
		
		System.out.println("filter() method ------>");
		l2.stream().forEach(System.out::println);
		System.out.println("end of filter() method ------>");
		System.out.println();System.out.println();
		
		System.out.println("map() method ----->");
		// here i would like to add 5 grace marks for tall the students
		l2 = list.stream().map(i -> i*2).collect(Collectors.toList());
		l2.stream().forEach(System.out::println);
		System.out.println("end of map() method ----->");
		
		System.out.println();System.out.println();
		System.out.println("count() method------>");
		Integer count = (int) list.stream().filter(i-> i<35).count();
		System.out.println("no of failed students are : " + count);
		System.out.println("end of count() method------>");
		System.out.println();System.out.println();
		
		l2 = list.stream().sorted().collect(Collectors.toList());
		System.out.println("default natural sortiing order " + l2);
		l2 = list.stream().sorted((i1,i2)-> i1.compareTo(i2)).collect(Collectors.toList());
		//l2.stream().forEach(System.out::println);
		System.out.println("sorted collection object in Descending: " + l2);
	}
	
	
}
