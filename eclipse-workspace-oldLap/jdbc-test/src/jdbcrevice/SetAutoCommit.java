package jdbcrevice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;

// To perform DML statements we need to use the executeUpdate()
// if u set auto commit to false. any DML statmetns will not reflect actual table until u commit
// if u add same primary key values then  program doesnt execute further
public class SetAutoCommit {

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
			con.setAutoCommit(false); 
			
			System.out.println("connection successfull");
			Statement stmt = con.createStatement();
			
			
			//int rows = stmt.executeUpdate("insert into address values (7,'tracher colon','adoni')");
			ResultSet result = stmt.executeQuery("select * from address");
			con.commit(); 
			while(result.next())
			{
				System.out.println(result.getInt(1) + "--" + result.getString(2) + "--" +result.getString(3));
				
			}
			
			System.out.println("first row");
			result.first();
			result.next();
			result.absolute(2);
			System.out.println(result.getInt(1));
			
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			con.close();
		}
	}

}
