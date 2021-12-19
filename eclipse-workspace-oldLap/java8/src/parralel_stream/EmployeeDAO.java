package parralel_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeDAO {
	
	static public List<Employee > getAllEmployees()
	{
		List<Employee> list =  new ArrayList<Employee>();
		//creates 1000 employees
		for(int i =1 ; i<=1000 ; i++)
		{
			list.add(new Employee(i,"Employee"+i,Double.valueOf(new Random().nextInt(10000*100))));
		}
		
		return list;
		
	}
}
