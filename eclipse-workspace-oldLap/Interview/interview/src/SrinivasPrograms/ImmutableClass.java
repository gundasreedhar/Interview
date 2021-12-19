

// Following are the requirements:
// • Class must be declared as final (So that child classes can’t be created)
// • Data members in the class must be declared as final (So that we can’t
// change the value of it after object creation)
// • A parameterized constructor
// • Getter method for all the variables in it
// • No setters(To not have option to change the value of the instance variable)
final class Student {
	final String name;
	final int regNo;

	public Student(String name, int regNo) {
		this.name = name;
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}
}

// Driver class
public final class ImmutableClass {
	public static void main(String args[]) {
		Student s = new Student("ABC", 101);
		System.out.println(s.name);
		System.out.println(s.regNo);
		// Uncommenting below line causes error
		// s.regNo = 102;
	}
}