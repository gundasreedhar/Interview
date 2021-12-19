package lockdown;

interface  Test1
{
	abstract public void disp(int a);
}
public class Lambdaplay {
	public static void main(String[] args)
	{
		Test1 obj = (a)-> System.out.println(a);
	}
}
