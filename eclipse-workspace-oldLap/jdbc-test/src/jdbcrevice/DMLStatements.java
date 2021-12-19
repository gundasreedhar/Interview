package jdbcrevice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;

// To perform DML statements we need to use the executeUpdate()
public class DMLStatements {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties prop = new Properties();
			ResourceBundle rb = ResourceBundle.getBundle("databasecredentials");
			String url = rb.getString("url");
			String username = rb.getString("username");
			String password = rb.getString("password");
			
			con = DriverManager.getConnection(url,username,password);
			
			System.out.println("connection successfull");
			Statement stmt = con.createStatement();
			
			
			int rows = stmt.executeUpdate("insert into address values (5,'TGL','adoni')");
			ResultSet result = stmt.executeQuery("select * from address");
			while(result.next())
			{
				System.out.println(result.getInt(1) + "--" + result.getString(2) + "--" +result.getString(3));
				
			}
			
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			con.close();
		}
	}

}
