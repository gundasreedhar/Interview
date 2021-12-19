package test1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*
		 * int i = (int)Integer.parseInt(request.getParameter("num1"));
		 * 
		 * request.setAttribute("i",i+13); //int u =
		 * (int)Integer.parseInt(request.getParameter("i"));
		 * 
		 * 
		 * RequestDispatcher rd = request.getRequestDispatcher("sub");
		 * rd.forward(request,response);
		 */
		
		 
		//response.getWriter().println("result is : " + 23);
		
		
		
		
		  int a = Integer.parseInt(request.getParameter("num1")); 
		  int b = Integer.parseInt(request.getParameter("num2")); 
		  
		 
		
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request,response);
		//HttpSession s = request.getSession();
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * Integer a = Integer.parseInt(request.getParameter("num1")); Integer b =
		 * Integer.parseInt(request.getParameter("num2"));
		 * response.getWriter().println("result is : " + (a+b));
		 */	doGet(request, response);
	}

}
