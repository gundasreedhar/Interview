package test1;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class sub
 */
@WebServlet("/sub")
public class sub extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sub() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/* int u = (int)request.getAttribute("i"); */
		//int u = (int)Integer.parseInt(request.getParameter("i"));
		/*
		 * Session s = request.getSession(); s.getAttribute()
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		HttpSession s = request.getSession();
		int k = (int) s.getAttribute("k");
		response.getWriter().println("squere of number : " + k + " is : " + (k*k));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		response.getWriter().println("<br>ssssservlet changed : " );//+ 
		
	}

	/**
	// TODO Auto-generated method stub
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
