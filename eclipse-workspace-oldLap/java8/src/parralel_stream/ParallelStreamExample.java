package parralel_stream;

import java.util.List;

public class ParallelStreamExample {
	public static void main(String args[])
	{
		long start = 0; long end = 0;
		/*
		start=System.currentTimeMillis();
        IntStream.range(1,10000).forEach(System.out::println);
        end=System.currentTimeMillis();
        System.out.println("Plain stream took time : "+(end-start));

       System.out.println("============================================");

       start=System.currentTimeMillis();
       IntStream.range(1,10000).parallel().forEach(System.out::println);
        end=System.currentTimeMillis();
        System.out.println("Parallel stream took time : "+(end-start));
        */
		
		List<Employee> listofemployess = EmployeeDAO.getAllEmployees();
		
		start=System.currentTimeMillis();
		Double salary = listofemployess.stream()
				.map(i->i.getSalary())
				.mapToDouble(i->i)
				.average().getAsDouble();
		end=System.currentTimeMillis();
		System.out.println("Plain or Sequential stream took time : "+(end-start) + "\nsum of salaray is :" + salary);
		
		
		start=System.currentTimeMillis();
		 salary = listofemployess.parallelStream()
				.map(i->i.getSalary())
				.mapToDouble(i->i)
				.average().getAsDouble();
		end=System.currentTimeMillis();
		System.out.println("Parallel stream took time : "+(end-start)+"\nsum of salaray is :" + salary);
		
		
		
        
        
		
	}
}
