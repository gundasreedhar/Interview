package interview;

import java.util.Hashtable;
import java.util.Objects;

class Student{
	int roll;
	
	Student(int roll)
	{
		this.roll = roll;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return roll == other.roll;
	}

	public String toString()
	{
		return "Student rollnumber: " + roll + " and grade " ; 
	}
}

public class HashTableCheck {
	
	public static void main(String... args)
	{
		Hashtable<Student, String> students = new Hashtable<Student, String>();
		students.put(new Student(1),"A");
		students.put(new Student(2),"A");
		students.put(new Student(3),"A");
		students.put(new Student(1),"R");
		students.put(new Student(1),"T");
		System.out.println(students);
	}
	
}
