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
    // Disableing the back button after logout
	response.setHeader("cache-control","no-cache,no-store,must-validate");  // http 1.1
	
	response.setHeader("Pragma", "no-cache"); // http 1.0
	
	response.setHeader("Expires","0");  //Proxies
	
	//restrict the direct access to the page
	if(session.getAttribute("username")== null)
		response.sendRedirect("login.jsp");
%>
	videos page
	<br>
	1. video one<br>
	2. video two
	<iframe width="560" height="315" src="https://www.youtube.com/embed/gQLQ0t9B5yk" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
	
</body>
</html>