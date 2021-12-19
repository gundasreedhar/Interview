/*
 * Set doesnt allow duplicate for imbuilt classes whereas set allows duplicates for the custom class
 * since Set doesnt do the deep checking.
 * So, now we should make the Set not allow to store for the custom class duplicates objects, by overriding the 
 * hashCode() method and equals() method as shown below:     
 */

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;

class Student {
	String name = "";
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	/* 
	 * If two objects are equal then hashCode() method on both the objects should return the   
	 * same integer.
	 */
	
	// code that returns the same Hashcode for the same object   
	public int hashCode()
	{
		return this.age + name.hashCode(); 
	}
	
	// Code Written as checking the object internal content  
	public boolean equals(Object o)
	{
		Student s = (Student)o;
		if(this.age == s.age && this.name == s.name)
			return true;  
		else 
			return false;
	}
}

public class OneMoreWayToStoreDuplicatesInSet {
	public static void main(String[] args) {
		Student s1 = new Student("shreedhar", 21);
		Student s2 = new Student("shreedhar", 21);
		Set<Student> obj1 = new HashSet();
		obj1.add(s1);
		obj1.add(s2);
		obj1.forEach( n -> System.out.println(n.name + "   " + n.age));
	}
}