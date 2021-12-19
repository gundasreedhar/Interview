//Program to store the duplicates in the HashSet and the LinkedHashSet
/*
	* Internally the HashSet and the LinkedHashSet does not allow the duplicated to store upon insertion.
	   but,
			wITHOUT OVERRIDING any methods the HashSet and the LinkedHashSet does not allow duplicates to store 
			in their object ONLY for Primitive data types and wrapper class objects. but whereas, for the
			custom class objects this ALLOW you to have the duplicates in store.
			So to NOT TO ALLOW THE DUPLICATES to store into the HashSet or the LinkedHashSet we need to override 
			the hashCode() and equals() methods as shown below in the program.

 */
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

class Emp
{
	String name;
	int age;
	
	Emp (String name,int age )
	{
		this.name = name;
		this.age = age;
	}
	Emp(){}
	public String toString()
	{
		return "Emp_Name = " + name + "   Emp_Age = " + age + "\n";
	}

	public int hashCode()
	{
		return this.age + name.hashCode() ;
	}

	public boolean equals(Object obj)
	{
		Emp e = (Emp) obj;
		if ( this.age == e.age && this.name ==  e.name  )
		//if(this == e  )  allow duplicates
			return true ;
		return false;
	}

}
class DuplicatesInHashSet 
{
	public static void main(String [] srgs) 
	{
		HashSet<Emp> ts = new HashSet<Emp>();   // possible to store duplicates
		LinkedHashSet<Emp> s = new LinkedHashSet<Emp>(); // possible to store duplicates
		//TreeSet<Emp> ts = new TreeSet<Emp>();    we cant store the duplicates in TreeSet 
		/*{
			public boolean equals( int o)
			{
				return false;
			}
		};*/
		HashSet<Integer> hg = new HashSet<Integer>();   
		hg.add(2);
		hg.add(4);
		hg.add(2);


		Emp s1 = new Emp("shree",40);
		Emp s2 = new Emp("amma",20);
		Emp s3 = new Emp("shree",40);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		

		
		System.out.println(ts);
		System.out.println("Wrapper class objects\n" + hg);
	}
} 