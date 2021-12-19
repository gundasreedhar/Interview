package SrinivasPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//If two objects are equal than it should have same hash code but
//two objects having same hashcode then two objects may or may not equals
//hash code has to be over ridden to return the same value if values are same(new Employee("abc", 1) ,new Employee("abc", 1))
//if  you  don't over ride object class hash code returns different value 
//ex: new Employee("abc", 1) and new Employee("abc", 1) will have different hash
//equals has be to overridden to check content is same or not
public class HashCodeEquals {
	public static void main(String[] args) {
		// Map<String, String> map = new HashMap<String, String>();
		// map.put("rtyui", "yj");
		// map.put("qwe", "yj");
		// map.put("qwe", "yj");
		HashSet<Employee> set = new HashSet<Employee>();
		set.add(new Employee("abc", 1));
		set.add(new Employee("abc", 1));
		set.add(new Employee("abc", 1));
		System.out.println("Set elements  " + set);
		System.out.println("Set size " + set.size());

		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(new Employee("qwe", 123), "yj");
		map.put(new Employee("asd", 987), "hhbn");
		map.put(new Employee("asd", 987), "hhbn");
		map.put(new Employee("ert", 857), "fvb");
		System.out.println("Map elements " + map);
		System.out.println("Map size " + map.size());
		System.out.println(map.get(new Employee("bnhnj", 123)));
	}

	@Override
	public String toString() {
		return "HashCodeEquals [hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}

	public int hashCode() {
		return 1;
	}

	public boolean equals(Object obj) {
		return false;
	}
}

class Employee {
	String name;
	int id;

	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public int hashCode() {
		// return this.id + name.hashCode();
		return 1;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Employee)) {
			return false;
		}
		if (obj == this)
			return true;
		Employee emp = (Employee) obj;
		if (this.id == emp.id && this.name == emp.name)
			return false;// return false if u want to store duplicates
		return false;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
}