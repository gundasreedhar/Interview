//unchecked Exception
import java.util.Scanner;
class Demo
{
	public void alpha()
	{
		int nr = 10;
		Scanner scan = new Scanner(System.in);
		int dr = scan.nextInt();
		System.out.println(nr/dr);
	}
}
class Launch1 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		d.alpha();
		//System.out.println("Hello World!");
	}
}
//Exception is handled by JVM here
/* 
OutPut:
* arithmatic exceptiion : / by zero
*				      at Demo.alpha
*				    at Launch.main()
*/