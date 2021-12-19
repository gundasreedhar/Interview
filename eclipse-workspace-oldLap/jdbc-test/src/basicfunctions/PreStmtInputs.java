package basicfunctions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class PreStmtInputs {
	public static void main(String... args)
	{
		Connection con = null;
		PreparedStatement prest = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // load and register the driver
			String url = "jdbc:mysql://localhost:3306/test";
			con = DriverManager.getConnection(url,"root","shreedhar");
			System.out.println("connection established");
			
			
			String query = "insert into emp3 values(?,?,?)";
			PreparedStatement prepst  = con.prepareStatement(query);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			do {
				
				System.out.println("enter first name ");
				String fname = br.readLine();	
				
				System.out.println("enter last name");
				String lname = br.readLine();
				
				System.out.println("enter usn");
				int usn = Integer.parseInt(br.readLine());
				
				prepst.setString(1,fname);
				prepst.setString(2,lname);
				prepst.setInt(3,usn);
				
				System.out.println("Do u want to continue adding records:y/n");
				String r = br.readLine();
				if(r.startsWith("y"))
				{
					continue;
				}
				else
					break;
			}while(true);
			
			 prepst.executeUpdate();
			
			//while()
			 
			
			
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			try {
				//prepst.close();
				
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

}
