package java8Questions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDAO {

	public static List<Employee> getAllEmployees()
	{
		return Stream.of(
				new Employee("shreedhar","shreedharguptha2@gmail.com",10000,"A",true),
				new Employee("Guru prakash","Guruprakash@gmail.com",10000,"A",false),
				new Employee("srikanth","srikanth@gmail.com",20000,"B",true),
				new Employee("srinivas","srinivas@gmail.com",20000,"B",false),
				new Employee("sravani","sravani@gmail.com",30000,"C",false),
				new Employee("brunda","brunda@gmail.com",30000,"C",true)
				).collect(Collectors.toList());
	}
}
