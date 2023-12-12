<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "sp"   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Login Page</h1>
	
	<sp:form action="login" modelAttribute="log">
	
	enter your emailid:<sp:input path="emailid" /><sp:errors path="emailid" /><br/>
	Enter your password:<sp:input path = "password" /><sp:errors path="password" /><br/>
	
	<input type = "submit" value = "submit" />
	</sp:form>
</body>
</html>