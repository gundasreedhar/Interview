// Unchecked Exception HAndling
/*
 * handling the unchecked Exception in the method where the Exception Occured upon throwing the excepion to calling funtion
 * using throw Exception_Name; as shown below
 * throw keyword is going to throw the Exception to the calling function
 */

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
	        throw e; 
			/*
			 * upon throwing the Exception to the calling fun, control wont come back and continue execution
			 * from the end of catch block. so check the output at the bottom
			 */
        }
        System.out.println("connection2 Terminated"); // control will come here after throw Exception in catch
    }
}
public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("connection1 Established");
        try{new Demo().div_op();}catch(Exception e){System.out.println("Exception handled in main()");}
    	System.out.println("connection1 Terminated");
	}
}
/* 
OutPut:
--------------------------
connection1 Established
connection2 Established
enter Denominator other than zero
Exception handled in main()
connection1 Terminated
-------------------------
*/