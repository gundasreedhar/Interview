package Practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee>{
	String name = "";
	int roll;
	Employee(String name, int roll)
	{
		this.name = name;
		this.roll = roll;
	}
	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		if(this.roll > arg0.roll)
			return 1;
		else
			return -1;
		//return this.name.compareTo(arg0.name);
	}

	/*@Override
	public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub
		if(arg0.roll > arg1.roll)
			return 1;
		else
			return 0;
	}*/
}
public class Sep19 {
	
	public static void main(String [] args)
	{
		Employee s1 = new Employee ("shreedhar",25);
		Employee s2 = new Employee ("brunda",1);
		Employee s3 = new Employee ("kirana",35);
		Employee s4 = new Employee ("rama",6);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(s1);al.add(s2);al.add(s3);al.add(s4);
		al.forEach( n -> System.out.println(n.name + "==" + n.roll));
		Collections.sort(al);
		al.forEach( n -> System.out.println(n.name + "==" + n.roll));
	}
	

}
