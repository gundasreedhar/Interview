package ListImplementedClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(34);list.add(3);list.add(25);list.add(45);list.add(17);list.add(97);list.add(54);
		
		List<Integer> l2 =  new ArrayList<Integer>();
		
		/* for(int l : list ) { l2.add(l*2); }*/
		l2 = list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(l2);
		
		System.out.println(list.stream().filter(i->i<3).count());
		
		l2 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(l2);
		
	}

}
