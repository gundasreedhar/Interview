// Unchecked Exception
// handling the unchecked Exception in the main method 
class Demo
{
    public void div_op()
    {
		System.out.println("connection2 Established");
		System.out.println(10/0);	
        System.out.println("connection2 Terminated"); // control will not come here after Exception occured
    }
}
public class Launch2
{
	public static void main(String[] args) 
	{
		System.out.println("connection1 Established");
        try
        {
			new Demo().div_op();	
        }
        catch (Exception e)
        {
			System.out.println("Exception handled in main()");
        }
    	System.out.println("connection1 Terminated");
	}
}
/* 

OutPut:
connection1 Established
connection2 Established
Exception handled in main()
connection1 Terminated

*/