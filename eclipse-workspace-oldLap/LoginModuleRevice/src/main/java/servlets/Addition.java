package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Addition extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Integer a  = Integer.parseInt(req.getParameter("num1"));
		Integer b  = Integer.parseInt(req.getParameter("num2"));
		
		RequestDispatcher requestDispatcher =  req.getRequestDispatcher(null);  
		// continue from here to call anotheer servlet for square
		
		res.getWriter().println("sum of two numbers is : " + (a+b));
			
	}

}
