package basicfunctions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparesStatementExample {
	public static void main(String...  args)
	{
		Connection con = null;
		PreparedStatement prest = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // load and register the driver
			String url = "jdbc:mysql://localhost:3306/test";
			con = DriverManager.getConnection(url,"root","shreedhar");
			System.out.println("connection established");
			
			
			String query = "select lname from employee where hiredate = ?";
			 prest = con.prepareStatement(query);
			prest.setString(1,"1981-02-22");
			
			
			ResultSet res = prest.executeQuery();
			res.next();
			System.out.println(res.getString(1));
			
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			try {
				prest.close();
				
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}
