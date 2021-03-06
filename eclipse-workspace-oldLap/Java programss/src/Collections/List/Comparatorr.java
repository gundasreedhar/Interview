// by using the Comparator interfaces. 
/* 
 * Before i use the list to iterate, I need the list to b in sorted format.
 * This List can be sorted in two ways by using,
 * 1. Comparable interface. 
 * 2. Comparator interface.
 *
 * Upon using the comparator interface and Anonymous inner class you can create the multiple comparator objects,
 * such that each comparator objects can sort the collections based on different parameters.
 *
 * now upon calling the Collections.sort(list,comp_name); method the objects in the list gets sorted.
 *
 * now upon iterating the list u can see the objects in the list got sorted according to comparator object.
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

}

public class Comparatorr {
	public static void main(String[] args) {
		Student s1 = new Student("shreedhar", 21);
		Student s2 = new Student("Guru", 20);
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);

		System.out.println("sorting using the comparator interface");
		Comparator<Student> comp_name = new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
		};
		Collections.sort(list, comp_name);
		list.forEach(n -> System.out.println(n.name + "   " + n.age));
	}
}