package SetUsingStreams;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparator<Student>
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
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getUsn()<o2.getUsn()?-1 : 0;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, usn);
	}
	@Override
	public boolean equals(Object obj) {
		/*
		 * if (this == obj) return true;
		 */
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && usn == other.usn;
	}
	
	
	
}
public class SetCheck{
	public static void main(String args[])
	{
		Student  s1 = new Student(146,"shreedhar");
		Student  s2 = new Student(102,"Brunda");
		Student  s3 = new Student(102,"Brunda");
		
		
		Set<Student> set = new HashSet<Student>();
		set.add(s2);
		set.add(s1);
		set.add(s3);

		set.stream().sorted( (i1,i2)-> i1.getUsn()<i2.getUsn()?-1 : i1.getUsn()<i2.getUsn()?1 : 0)
		.forEach(System.out::println);
		
		set.stream().sorted( (i1,i2) -> i1.getName().length() < i2.getName().length()?-1 :   
			i1.getName().length() < i2.getName().length()?1
			:0).forEach(System.out::println);
		
		
		
		Set<Student> setTree =  new TreeSet<Student>((a,b) -> a.getUsn()<b.getUsn()?-1 : a.getUsn()>b.getUsn()?1 : 0);
		setTree.add(s1);setTree.add(s2);setTree.add(s3);
		//setTree.stream().forEach(System.out::println);
		for(Student s : setTree)
		{
			System.out.println(s);
		}
		
		
		
		
	}
}
