import java.util.Scanner;
class Demo1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer");
		int i = sc.nextInt();
		System.out.println("Enter the Float");
		float f = sc.nextFloat();
		System.out.println("The integer value is " + i + "\nThe float value is" + f);
	}
}