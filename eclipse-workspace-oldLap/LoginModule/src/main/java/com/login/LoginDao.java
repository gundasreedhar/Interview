package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao 
{
	public boolean check(String uname,String pass) throws SQLException
	{
		String query = "select * from login where username = ? and password = ?";
		Connection con = null;
		PreparedStatement prest = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			con = DriverManager.getConnection(url,"root","shreedhar");
			prest = con.prepareStatement(query);
			prest.setString(1,uname);
			prest.setString(2,pass);
			ResultSet rs = prest.executeQuery();
			if(rs.next())
			{
				return true;
				
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally
		{
			prest.close();
			
			con.close();
		}
		return false;
		
	}
}
