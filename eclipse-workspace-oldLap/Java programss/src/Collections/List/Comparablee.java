// Sorting the Collections that store the custom class objects like Students (or) Employees
// by using the Comparable interfaces. 
/* 
 * Before i use the list to iterate, I need the list to b in sorted format.
 * This List can be sorted in two ways by using,
 * 1. Comparable interface. 
 * 2. Comparator interface.
 * 
 * UPON USING THE COMPARATOR INERFACE FoR THE SORTING THEN U WILL HAVE TO implment the comparator interface in
 * the student class or employee class and override the compareTo() method as shown below.
 * 
 * Now calling the Collections.sort(list); method the list is going to be sorted internally.
 * 
 * Upon iterating the list we can see the list in sorted format.
 * 
 * Problem: we can sort the collections based on only ONE parameter. 
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

class Student implements Comparable<Student> {
	String name = "";
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}

}

public class Comparablee {
	public static void main(String[] args) {
		Student s1 = new Student("shreedhar", 21);
		Student s2 = new Student("Guru", 20);
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);

		Collections.sort(list);

		System.out.println("sorting using the comparable interface");
		list.forEach( n -> System.out.println(n.name + "   " + n.age));

		
	}
}