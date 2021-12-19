package jdbcrevice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Scanner;

public class PreParendStatemts {
	public static void insertRecords(PreparedStatement stmt,Scanner obj)
	{
		System.out.println("enter id , address , city one after the another to inser the record"
				+ "\n Note: instead of spaces please mention underscore(_) between words");
		String check = "";
		do
		{
			try {
					System.out.println("enter id");
					stmt.setInt(1,obj.nextInt());
					System.out.println("enter address");
					stmt.setString(2,obj.next().replaceAll("_", " "));
					System.out.println("enter city");
					stmt.setString(3,obj.next().replaceAll("_", " "));
					stmt.executeUpdate();
					System.out.println("enter 'y' if u have records to entre if not enter 'n' to stop ");
					check = obj.next();
			}
			catch (Exception e) {}
		}while(check.equals("y"));
		
	}

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
			//PreparedStatement stmt = con.prepareStatement("select * from address where id = ?");
			Scanner obj = new Scanner(System.in);
			PreparedStatement stmt = con.prepareStatement("insert into address values (?,?,?)");
			insertRecords(stmt,obj);
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			con.close();
		}
	}

}
