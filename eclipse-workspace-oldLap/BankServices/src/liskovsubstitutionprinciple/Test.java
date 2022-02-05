package liskovsubstitutionprinciple;

import openforextenstionandcloseformodificationprinciple.Employee;
import openforextenstionandcloseformodificationprinciple.TraineeEmployee;

/*
 * This principle states that “Derived or child classes must be substitutable for their base or parent classes”
 * 	this in other words nothing but "Loose Couping" 
 * 
 *  1. provide loose coupling in the method arguments 
 *  2. create a seperate class if new functionality for that class or for interface occurs. i,e., writing the interface
 *  		class on top of existing class by extending.
 * */



public class Test {
	
	public static void main(String[] args) {
		Employee emp = new Employee("shreedhar",1);
		emp.print();
		TraineeEmployee traineeEmployee = new TraineeEmployee("shreedhar",1,"siruguppa");
		traineeEmployee.print();
		
		Test test = new Test();
		test.useME(traineeEmployee);
	}
	
	public void useME(Employee emp)
	{
		emp.print();
	}
}
