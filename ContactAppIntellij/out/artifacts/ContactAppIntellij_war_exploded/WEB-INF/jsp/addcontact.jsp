<%--
  Created by IntelliJ IDEA.
  User: personal
  Date: 8/3/2018
  Time: 7:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sp"%>
<html>
<head>
    <title>Addcontact</title>
</head>
<body>
<sp:form action="addcontact" method="post" modelAttribute="add">
    Enter the phone name:<sp:input path="name"/><sp:errors path="name"/><br/>
    Enter the phone number:<sp:input path="phoneno"/><sp:errors path="phoneno"/><br/>
    Enter the phone emailid:<sp:input path="emailid"/><sp:errors path="emailid"/><br/>
    Enter the phone dateofbirth:<sp:input path="dob"/><sp:errors path="dob"/><br/>
<input type="submit" value="submit"/>
</sp:form>
</body>
</html>
