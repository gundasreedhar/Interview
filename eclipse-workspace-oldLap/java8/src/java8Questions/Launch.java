package java8Questions;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Launch {
	public void showAllDepartmetns(List<Employee> employees)
	{
		if(employees != null)
		{
			System.out.println("========================================================================");
			for(
					String department : employees.stream().
						map((obj1) -> obj1.getDepartment())
						.collect(Collectors.toSet())
				)
			{
				System.out.println();System.out.println();
				System.out.println("List of employees working in the department : " + department + " are :");
				employees.stream()
					.filter( (e1) -> e1.getDepartment().equalsIgnoreCase(department) )
					.forEach(System.out::println);
			}
			System.out.println("========================================================================");
		}
	}
	
	public void employeeCountInEachDepartment(List<Employee> employees)
	{
		if(employees != null)
		{
			System.out.println("========================================================================");
			for(
					String department : employees.stream()
											.map( (e1) -> e1.getDepartment() )
											.collect(Collectors.toSet())
				)
			{
				System.out.println();System.out.println();
				System.out.println("The number of employees in department " + department + " are : " +
								employees.stream()
								.filter( (e1) -> e1.getDepartment().equalsIgnoreCase(department) )
								.count()
						);
			}
			System.out.println("========================================================================");
		}
	}
	
	public void showActiveAndInactiveMembersOfGroup(List<Employee> employees)
	{
		if(employees != null)
		{
			System.out.println("========================================================================");
			for(
					boolean flag : employees.stream().map( (e1) -> e1.isActive() ).collect(Collectors.toSet())
				)
			{
				System.out.println();
				String g = flag ? "ACTIVE" :"INACTIVE" ;
				System.out.println("list of " + g + " employees are :");
				
				employees.stream()
					.filter( (e1) -> e1.isActive() == flag)
					.forEach(System.out::println);
			}
			System.out.println("========================================================================");
		}
	}
	
	
	public void printMAxAndMinSalary(List<Employee> list)
	{
		if (list != null)
		{
			System.out.println("========================================================================");
			System.out.println();
			System.out.println("The minimum salary is " +
					list.stream().map( (e) -> e.getSalary() ).min( (s1,s2) -> s1.compareTo(s2) ).get()
					+ "\n" +
					"The MAximum salary is " +
					list.stream().map( (e) -> e.getSalary() ).max( (s1,s2) -> s1.compareTo(s2) ).get()
					);
			System.out.println("========================================================================");
		}
	}
	
	public void printMaxSalaryFromEachDepartment(List<Employee> employees)
	{
		if (employees != null)
		{
			System.out.println("========================================================================");
			for(
					String department : employees.stream()
											.map( (e1) -> e1.getDepartment() )
											.collect(Collectors.toSet())
				)
			{
				System.out.println();
				System.out.println("Maximum salary from department " + department +  " is " +
						employees.stream()
							.filter( (e1) -> e1.getDepartment().equalsIgnoreCase(department) )
							.map( (e1) -> e1.getSalary() )
							.max( (s1,s2) -> s1.compareTo(s2) )
							.get()
					);
			}
			System.out.println("========================================================================");
		}
	}

	public static void main(String[] args) {
		
		List<Employee> list =  EmployeeDAO.getAllEmployees();
		
		//1.Write a program to print employee details working in each department
		Launch launch = new Launch();
		launch.showAllDepartmetns(list);
		
		//2.Write a program to print employees count working in each department
		launch.employeeCountInEachDepartment(list);
		
		//3.Write a program to print active and inactive employees in the given collection
		launch.showActiveAndInactiveMembersOfGroup(list);

		//4.Write a program to print Max/Min employee salary from the given collection
		launch.printMAxAndMinSalary(list);
		
		//5.Write a program to print the max salary of an employee from each department 
		launch.printMaxSalaryFromEachDepartment(list);
	}

}
