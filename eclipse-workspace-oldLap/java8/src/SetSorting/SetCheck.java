package SetSorting;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Student //implements Comparator<Student>
{
	private Integer usn ;
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
	public Student(int usn, String name) {
		super();
		this.usn = usn;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + "]";
	}
//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return o1.getUsn()<o2.getUsn()?-1 : 0;
//	}
	@Override
	public int hashCode() {
		return Objects.hash(name, usn);
	}
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) return true;
		 
		if (obj == null)
			return false;
		
		if (!getClass().equals(obj.getClass()))
			return false;
		
		Student other = (Student) obj;
		return this.name.equals(other.name) && usn == other.usn;
	}
	
	
	
	
}
public class SetCheck{
	public static void main(String args[])
	{
		Student  s1 = new Student(146,"shreedhar");
		Student  s2 = new Student(102,"Brunda");
		Student  s3 = new Student(102,"Brunda");
		
		// HashSet and LinkedHashSet
		Set<Student> set = new HashSet<Student>();
		set.add(s2);
		set.add(s1);
		set.add(s3);
		
		//below statement is still not sorted coz u are putting into set only again. which dont preserve the order
		// so to get the sorted form of set either u can sort and displey directelt or collect into list object 
		Set<Student> modSet= set.stream().sorted((o1,o2) -> o1.getUsn() - o2.getUsn()).collect(Collectors.toSet());
		System.out.println(modSet + "-----> not sorted on roll");
		System.out.println("--------");
		List<Student> modList= set.stream().sorted((o1,o2) -> o1.getUsn() - o2.getUsn()).collect(Collectors.toList());
		System.out.println(modList + " ----->sorted on roll");
		//here direct disply
		System.out.println("---here direct disply---");
		set.stream().sorted( (i1,i2)-> i1.getUsn()<i2.getUsn()?-1 : i1.getUsn()<i2.getUsn()?1 : 0)
		.forEach(System.out::println);
		
		System.out.println("---");
		
		set.stream().sorted( (i1,i2) -> i1.getName().length() < i2.getName().length()?-1 :   
			i1.getName().length() < i2.getName().length()?1
			:0).forEach(System.out::println);
		
		
		
		//TreeSet
		System.out.println("----TreeSet---");
		Set<Student> setTree =  new TreeSet<Student>((a,b) -> a.getUsn()<b.getUsn()?-1 : a.getUsn()>b.getUsn()?1 : 0);
		setTree.add(s1);setTree.add(s2);setTree.add(s3);
		//setTree.stream().forEach(System.out::println);
		for(Student s : setTree)
		{
			System.out.println(s);
		}
		
		
		
		
	}
}



