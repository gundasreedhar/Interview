package basicfunctions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class First {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // load and register the driver
			String url = "jdbc:mysql://localhost:3306/test";
			con = DriverManager.getConnection(url,"root","shreedhar");
			System.out.println("connection established");
			Statement stmt =  con.createStatement();
			con.setAutoCommit(false);
			
			  String query = "insert into emp "+
			  "values(2327,'jjjj','gunda','SALESMAN',7698,'1981-02-22',500,0,30)";
			  //stmt.executeUpdate(query);
		    stmt.executeUpdate("rename table emp to employee");
		   // System.out.println("rows inserted : "+ stmt.executeUpdate(query));
			/*
			 * while(rs.next()) { System.out.println(rs.getString(1) + "  " +
			 * rs.getString(2)); }
			 */
			//con.commit();
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

