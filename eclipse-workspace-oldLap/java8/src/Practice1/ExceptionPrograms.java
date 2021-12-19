package Practice1;

public class ExceptionPrograms {
	void divide() throws Exception 
 	{
		try {
			int a = 10/0;
			System.out.println("afer exception occured");
		}
		catch (Exception e) {
			System.out.println("handled in ExceptionPrograms() method");
			// TODO: handle exception
			throw e;
		}
		finally {
			System.out.println("inside final block");
		} 
		System.out.println("aftr final block");
		
	}
}
 