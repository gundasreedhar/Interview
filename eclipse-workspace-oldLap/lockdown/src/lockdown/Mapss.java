package lockdown;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
class Student
{
	int roll;
	String name;
	public String getName() {
		return name;
	}
	Student (int roll, String name)
	{
		this.name = name;
		this.roll = roll;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name ;
	}
	/*@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		if( arg0 instanceof Student )
		{
			Student arg = (Student)arg0;
			return (this.name.equal s(arg.name) && this.roll == arg.roll); 
			
		}
		else 
			return false;
	}*/
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return roll + name.hashCode();
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		Student s = (Student)arg0;
		return this.hashCode() == s.hashCode();
	}
}
public class Mapss {
	public static void main(String[] args)
	{
		Comparator compname =   new Comparator<Student>() {

			@Override
			public int compare(Student arg0, Student arg1) {
				// TODO Auto-generated method stub
				return arg0.name.compareTo(arg1.name);
				
			}
			
		};
		Comparator compint =   new Comparator<Student>() {

			@Override
			public int compare(Student arg0, Student arg1) {
				// TODO Auto-generated method stub
				
				/*if(arg0.roll>arg1.roll)
					return 1;
				else if(arg0.roll<arg1.roll)
					return -1;
				else
					return 0;*/
				return arg0.roll-arg1.roll;
			}
			
		};
		Student s1 = new Student(22,"shreedhar");
		Student s2 = new Student(23,"abc");
		Student s3 = new Student(9,"ccc");
		Map<Student,String> hm = new TreeMap<Student,String>(compint);
		hm.put(s1,"1000");
		hm.put(s2, "2000");
		hm.put(s3, "2000");
		for(Map.Entry m :hm.entrySet() ) {
			System.out.println(m);	
		}
  		
		Set l = new HashSet();
		l.add(null);
		l.add(null); 
		l.add(null);
		l.add(null);
		System.out.println(l);
	}
}
