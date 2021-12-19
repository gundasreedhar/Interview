//comments
import java.util.Scanner;
class CoreApp
{
	
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your input6");
		int input = scan.nextInt();
		System.out.println(input);
	}
}

class Student
{
	private String name;
	private String age; 
	
	
	
	void setName(String name)
	{
		this.name = name;
	}
	String getname() 
	{
		return this.name;
	}
	
	
	
	
}