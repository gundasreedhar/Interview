// Unchecked Exception HAndling
/*
 * handling the unchecked Exception in the method where the Exception Occured upon throwing the excepion to calling funtion
 * using throw Exception_Name; in catch block as shown below
 * to continue the Execution from end of the catch block we use finally{} block
 * NO MATTER WHAT the satements inside finally block is going to execute at the end of THAT block execution
 * where finaly is present
 * so, always use the finally block along with throw Exp_name;. If you want any further statements to execute aftr throw
 * usually, finally{} block is used for closing the file in the end aftr using it.
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
			 * from the end of catch block. 
			 * so to over come this we go with using finally block
			 */
        }
        finally
		{
			System.out.println("connection2 Terminated"); // control will come here after throw Exception in catch
		}
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
connection2 Terminated
Exception handled in main()
connection1 Terminated
-------------------------
*/