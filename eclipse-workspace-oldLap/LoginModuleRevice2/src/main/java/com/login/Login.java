package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		
		if("shreedhar".equalsIgnoreCase(userName) &&
				"welcome".equalsIgnoreCase(password))
		{
			HttpSession session =  req.getSession();
			session.setAttribute( "uName" , userName);
			//return "welcome.jsp"; // cant do
			resp.sendRedirect("Home.jsp");
		}
		else 
		{
			resp.sendRedirect("Login.jsp");
		}
	}
}
