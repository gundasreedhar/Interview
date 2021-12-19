<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="myError.jsp"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
	String name  = request.getParameter("user");
		if(name.equals("shreedhar")){
			out.print("You are authorised person");
			
		}
		else 
		{
			int x = 2/0;
 			//throw new Exception();
		}
	%>
</body>
</html>