// Unchecked Exception
// handling the unchecked Exception in the method where the Exception Occured
class Demo
{
    public void div_op()
    {
		System.out.println("connection2 Established");
        try
        {
			System.out.println(10/0);	
        }
        catch (Exception e)
        {
	        System.out.println("enter Denominator other than zero");
        }
        System.out.println("connection2 Terminated"); // control will come here after handling Exception in catch
    }
}
public class Launch3
{
	public static void main(String[] args) 
	{
		System.out.println("connection1 Established");
        new Demo().div_op();
    	System.out.println("connection1 Terminated");
	}
}
/* 
OutPut:
connection1 Established
connection2 Established
enter Denominator other than zero
connection2 Terminated
connection1 Terminated

*/