package Practice1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class First {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // load and register the driver
			String url = "jdbc:mysql://localhost:3306/test";
			con = DriverManager.getConnection(url,"root","shreedhar");
			System.out.println("cconnection established");
			Statement stmt =  con.createStatement();
		    ResultSet rs = stmt.executeQuery("select * from Emp");
		    rs.next();
		    System.out.println(rs.getString(1) + "  " + rs.getInt(2));
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
			e.printStackTrace();
		}
		finally
		{
			if(con!=null)
			{
				con.close();
				System.out.println("connection closed");
				
			}
			
		}
		
	}

}

