package ListImplementedClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
	private int usn;
	private String fName;
	private String lName;
	
	
	public Student(int usn, String fName, String lName) {
		super();
		this.usn = usn;
		this.fName = fName;
		this.lName = lName;
	}
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Stduent [usn=" + usn + ", fName=" + fName + ", lName=" + lName + "]";
	}
	
	
}
public class ListClassesSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(1,"gunda","sreedhar");
		Student s2 = new Student(2,"brunda","shree");
		
		List<Student> studentList =  new ArrayList<Student>();	
		studentList.add(s2);studentList.add(s1);
		
		Comparator<Student> compUSN = new Comparator<Student>(){ // annonymous class

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				int i1 = o1.getUsn();
				int i2 = o2.getUsn();
				
				// using ternary operator  
				 return i1<i2?-1 : i1>i2?1 : 0; // Ascending order
				//return i1<i2?1 : i1>i2?-1 : 0;  // Descending order
			}
			
		};
		
		Comparator<Student> compFname = new Comparator<Student>()
		{
			public int compare(Student s1,Student s2)
			{
				return s1.getfName().compareTo(s2.getfName());  // Ascending order
				//return -s1.getfName().compareTo(s2.getfName()); // Descemding order
				//return s2.getfName().compareTo(s1.getfName()); // Descemding order
			}
		};
		
			// Till java 1.7 sorting
		//  Collections.sort(studentList,compFname); 
		//  System.out.println(studentList);
		
		Comparator<Student> compLname = new Comparator<Student>()
		{

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getlName().length() < o2.getlName().length()?-1 : o1.getlName().length() > o2.getlName().length()?1 : 0;
			}
			
		};
		 
		Collections.sort(studentList, compLname);
		//studentList.stream().forEach(System.out::println);
		
		//studentList.stream().sorted((o1,o2) -> o1.getUsn()<o2.getUsn()?-1 : o1.getUsn()>o2.getUsn()?1 : 0).collect(Collectors.toList());
		
		
		
		// from java 1.8 sorting
		List<Student> modifiedList = new ArrayList<Student>();
		//modifiedList = studentList.stream().sorted(compFname).collect(Collectors.toList());
		modifiedList = studentList.stream()
				.sorted((o1,o2) -> o1.getUsn()<o2.getUsn()?-1 : o1.getUsn()>o2.getUsn()?1 : 0)
				.collect(Collectors.toList());
		modifiedList.stream().forEach(System.out::println);  // prints one by one
		System.out.println(modifiedList);
		
	}

}
