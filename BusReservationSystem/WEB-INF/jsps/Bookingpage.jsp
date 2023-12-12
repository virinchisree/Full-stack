<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "tb" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ticket booking</title>
</head>
<body>
      <h1>Ticket booking</h1>
<tb:form action = "ticketbooking" method="post" modelAttribute = "book">
Enter your First Name: <tb:input path = "fname"/><tb:errors path = "fname"/><br/>
Enter your Last Name: <tb:input path = "lname"/><tb:errors path = "lname"/><br/>
Enter your Email ID: <tb:input path = "emailid"/><tb:errors path = "emailid"/><br/>
Enter your Mobile Number: <tb:input path = "num"/><tb:errors path = "num"/><br/>
Date of Journey(dd/mm/yyyy): <tb:input path = "dob"/><tb:errors path = "dob"/><br/>
From: <tb:select path = "from"><tb:errors path = "from"/>
<tb:option value="1">visakhapatnam</tb:option>
<tb:option value="2">hyderbad</tb:option>
<tb:option value="3">vijayawada</tb:option>
</tb:select>
Destination: <tb:select path = "dest"><tb:errors path = "dest"/>
<tb:option value="1">Delhi</tb:option>
<tb:option value="2">bangalore</tb:option>
<tb:option value="3">tenali</tb:option>
</tb:select>
<input type="submit" value="Submit"/>
</tb:form>
</body>
</html>