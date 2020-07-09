<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Save contact</h2>
<P>${succesmsg}</P>
<P>${errmsg}</P>
<form:form action="/savecontact" ModelAttritubte="Contact" method="POST">
<table>
<tr>
<form:hidden path="contactId"/>
 <td>Contact Number:</td>
 <td><form:input path="contactNumber"/></td>
</tr>
<tr>
 <td>Contact Name:</td>
 <td><form:input path="contactName"/></td>
</tr>
<tr>
 <td>Contact Email:</td>
 <td><form:input path="contactEmail"/></td>
</tr>
<tr>
<td><input type="reset" value="reset"/></td>
<td><input type="submit" value="savecontact"/></td>
</tr>
</table>

</form:form>
<a href="viewcontacts">View All Contacts</a>

</body>
</html>