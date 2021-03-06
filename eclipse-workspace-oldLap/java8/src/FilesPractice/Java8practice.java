package FilesPractice;

import java.util.List;
import java.util.stream.Collectors;

public class Java8practice {
	public static void main(String[] args) {
		List<Student> listOfStudents = StudentDAO.getAllStdeuntRecords();
		
		double sum = listOfStudents.stream()
				.filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
				.map(employee->employee.getSalary())
				.mapToDouble(i->i)
				.sum();
		System.out.println("The sum of salaries of grade A employees is : " + sum);

		
		double average = StudentDAO.getAllStdeuntRecords().stream()
				.filter(employee->employee.getGrade().equalsIgnoreCase("B"))
				.map(emp->emp.getSalary())
				.mapToDouble(i->i)
				.average().getAsDouble();
		System.out.println("Average salary of grade B employees is : \n" + average);
		
		
		double min = StudentDAO.getAllStdeuntRecords().stream()
						.filter(emp->emp.getGrade().equalsIgnoreCase("a"))
						.map(emp -> emp.getSalary())
						.min((emp1,emp2) -> (int)(emp1 - emp2))
						.get();
		System.out.println("minimum salary of grade A employees is :" + min);
		
		
		double max = StudentDAO.getAllStdeuntRecords().stream()
				.filter(emp->emp.getGrade().equalsIgnoreCase("a"))
				.map(emp -> emp.getSalary())
				.max((emp1,emp2) -> (int)(emp1 - emp2))
				.get();
		System.out.println("maximum salary of grade A employees is :" + max);
		
		
		System.out.println(listOfStudents.stream()
				.sorted((emp1,emp2)->(int)(emp1.getSalary() - emp2.getSalary()))
				.collect(Collectors.toList()));
		
		
	}
	
}
