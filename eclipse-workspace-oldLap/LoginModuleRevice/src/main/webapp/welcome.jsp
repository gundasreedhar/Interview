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
		if(session.getAttribute("username")==null)
				response.sendRedirect("login.jsp");
	
	%>


	welcome ${username}
	
	<form action="add" method = "get">
		enter number 1 : <input type="number" name = "num1" value = "enter first number" ><br>
		enter number 2 : <input type="number" name = "num2" value = "enter second number"><br>
		<input type="submit" value = "submit">
	</form>
	<br><br>
	
	<br><br>
	<form action="Logout">
		<input type = "submit" value = "logout">
	</form>	
</body>
</html>