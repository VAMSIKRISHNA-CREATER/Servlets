
<%@page import="com.jsp.dto.Person"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<th>ID</th>
<th>NAME</th>
<th>AGE</th>
<th>EMAIL</th>
<th>PASSWORD</th>
</tr>
<% List<Person> list = (List<Person>)request.getAttribute("list"); %>
<% for(Person p:list) {%>
<tr>
<td><%=p.getId() %></td>
<td><%=p.getName() %></td>
<td><%=p.getAge() %></td>
<td><%=p.getEmail() %></td>
<td><%=p.getPassword() %></td>
</tr>
<%} %>

</table>
</body>
</html>