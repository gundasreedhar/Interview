package servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String username = req.getParameter("username");
		String password =  req.getParameter("password");
		LoginDAO loginDAO = new LoginDAO();
		if(loginDAO.check(username,password))
		{
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			res.getWriter().println("credentials are fine");
			res.sendRedirect("welcome.jsp");
		}
		else {
			res.sendRedirect("login.jsp");
		}
		
	}
	
}
