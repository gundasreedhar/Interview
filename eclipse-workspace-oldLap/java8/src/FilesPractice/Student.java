package FilesPractice;

public class Student {
	private String name;
	private String grade;
	double salary;

	public Student(String name, String grade, double salary) {
		this.name = name;
		this.grade = grade;
		this.salary = salary;
	}
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", salary=" + salary + "]";
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
