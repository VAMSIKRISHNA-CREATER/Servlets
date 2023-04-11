
<%@page import="com.jsp.dto.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateperson" method="post">
<% Person p = (Person)request.getAttribute("pers"); %>
ID       : <input type="text" name="id" readonly="readonly" value="<%=p.getId()%>">
NAME     : <input type="text" name="name" value="<%=p.getName()%>">
AGE      : <input type="number" name="age" value="<%=p.getAge()%>">
E-MAIL   : <input type="email" name="email" value="<%=p.getEmail()%>">
PASSWORD : <input type="password" name="password" value="<%=p.getPassword()%>">
<input type="submit" value="Update">
</form>
</body>
</html>