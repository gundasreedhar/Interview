package jdbcrevice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;

// chech this batch process http://tutorials.jenkov.com/jdbc/batchupdate.html
public class BatchProceess {
	public static void main(String[] args) throws SQLException
	{
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
			
			stmt.addBatch("insert into address values (13,'ghana area',banglore)");
			stmt.addBatch("insert into address values (14,'dance area',banglore)");
			stmt.addBatch("insert into address values (15,'weedarea',banglore)");
			
			
			System.out.println(stmt.executeBatch());
			
			
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			con.close();
		}
	}
}
