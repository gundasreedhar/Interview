package servlets;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.ResourceBundle;

public class LoginDAO {
	
	
	public boolean check(String username ,String password)
	{
		ResourceBundle rb = ResourceBundle.getBundle("App");
		String query = "select * from login where username = ? and password = ?";
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				/*
				Properties prop = new Properties();
				prop.load(new FileInputStream("C:\\Users\\Gunda Sreedhar\\ecliplse workspace in old lap\\eclipse-workspace-oldLap\\LoginModuleRevice\\resources\\App.properties"));
				String url = prop.getProperty("url").trim();
				String uname = prop.getProperty("username").trim();
				String pword = prop.getProperty("password").trim();
				System.out.println(url);
				System.out.println(uname);
				System.out.println(pword);
				Connection con = DriverManager.getConnection(url,uname,pword);
				*/
				
				Connection con = DriverManager.getConnection(rb.getString("url").trim(),rb.getString("username").trim(),rb.getString("password").trim());
				//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","shreedhar");
				
				System.out.println("successfull connection");
				PreparedStatement preparedStatement = con.prepareStatement(query);
				preparedStatement.setString(1, username);
				preparedStatement.setString(2, password);
				if(preparedStatement.executeQuery().next())
				 return true;
				
				
				
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("not connected");
		}
		return false;
	}
}
