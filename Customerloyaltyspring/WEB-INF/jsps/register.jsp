<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "sp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Register Page</h1>
	
	<sp:form action = "register" method = "post" modelAttribute="reg">
	Enter your first name:<sp:input path="firstname"/><sp:errors path = "firstname"/> <br/>
	Enter your last name:<sp:input path = "lastname"/><sp:errors path= "lastname"/> <br/>
	Enter your date of birth(dd/mm/yyyy):<sp:input path = "dob"/><sp:errors path = "dob"/> <br/>
	Gender<input type = "radio" name = "gender" value = "male"/>male
	<input type = "radio" name = "gender" value ="female"/>female <br/>
	Enter your address:<sp:textarea path = "address"/><sp:errors path = "address"/><br/>
	Enter your EmailID:<sp:input path = "emailid"/><sp:errors path = "emailid"/><br/>
	Enter your password:<sp:password path = "password" /><sp:errors path = "password"/><br/>
	Repeat password:<sp:password path = "rpassword" /><sp:errors path = "rpassword"/><br/>
	<input type = "submit" value = "submit" />
	</sp:form>
</body>
</html>