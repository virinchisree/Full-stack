<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="s1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s2"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><s2:message code="label.register.header"/></h1>

	<s1:form modelAttribute="reg" action="register">
		<s2:message code="label.firstname"/><s1:input path="uname"/><s1:errors path="uname"/><br/>
		<s2:message code="label.email"/><s1:input path="email"/><s1:errors path="email"/><br/>
		<s2:message code="label.dob"/><s1:input path="dob"/><s1:errors path="dob"/><br/>
		<s2:message code="label.pass"/><s1:password path="pass"/><s1:errors path="pass"/><br/>
		
		<br/>
		<input type="submit"/>
		
	</s1:form>
	<b>${errorMsg}</b>
</body>
</html>










