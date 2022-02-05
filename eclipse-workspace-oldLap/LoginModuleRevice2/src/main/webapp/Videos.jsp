<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

	response.setHeader("cache-control","no-cache,no-store,must-validate");
	response.setHeader("Pragma", "no-cache"); // http 1.0
	if(session.getAttribute("uName") == null)
	{
		response.sendRedirect("Login.jsp");	
	}
%>

	welcome to videos pages
</body>
</html>