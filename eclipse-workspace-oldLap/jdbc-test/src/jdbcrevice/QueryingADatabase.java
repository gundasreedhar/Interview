package jdbcrevice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;

//for querying a database u need to use the executeQuery() 
public class QueryingADatabase {
	public static void main(String... args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Properties prop = new Properties();
		ResourceBundle rb = ResourceBundle.getBundle("databasecredentials");
		String url = rb.getString("url");
		String username = rb.getString("username");
		String password = rb.getString("password");
		
		try (
				Connection con = DriverManager.getConnection(url,username,password);
				Statement stmt = con.createStatement();
				ResultSet result = stmt.executeQuery("select * from address");
			)
		{
			
			while(result.next())
			{
				System.out.println(result.getInt(1) + "--" + result.getString(2) + "--" +result.getString(3));
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
