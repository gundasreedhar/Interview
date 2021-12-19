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

	// desabling the back button only after logout 
	response.setHeader("cache-control","no-cache,no-store,must-validate");  // http 1.1
	
	response.setHeader("Pragma", "no-cache"); // http 1.0
	
	response.setHeader("Expires","0");  //Proxies
	
	// when anyone hits the url to this page correctley,
	// to check that person loged in or not, we use session to validate the user.
	if(session.getAttribute("username")== null)
		response.sendRedirect("login.jsp");
%>
  Welcome ${username}
  
 <a href = "videos.jsp">Videos here</a> 
 
 <form action="logout">
 	<input type = "submit" value = "logout"> 
 </form>
 
 
</body>
</html>