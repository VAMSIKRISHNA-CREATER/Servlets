<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="save" method="post">
<input autocomplete="off" name="id" checked required type="text" placeholder="Enter User Id " style="text-align:  center;border-radius: 3px;  border-color: darkgray; font-size: 20px; text-decoration:double;height: 35px;width: 25%;"><br><br>
<input autocomplete="off" name="name" checked required type="text" placeholder="Enter User Name" style="text-align:  center;border-radius: 3px;  border-color: darkgray; font-size: 20px; text-decoration:double;height: 35px;width: 25%;"><br><br>
<input autocomplete="off" name="age" checked required type="text" placeholder="Enter User Age" style="text-align:  center;border-radius: 3px;  border-color: darkgray; font-size: 20px; text-decoration:double;height: 35px;width: 25%;"><br><br>
<input autocomplete="off" name="email"   checked required type="email" placeholder="Enter Person E-mail" style="text-align: center;border-radius: 4px;border-color: darkgray; font-size: 20px; text-decoration:double;height: 35px;width: 25%;" >&nbsp;&nbsp;<br><br>
<input autocomplete="off" name="password"   checked required type="password" placeholder="Enter User Password" style="text-align: center;border-radius: 4px;border-color: darkgray; font-size: 20px; text-decoration:double;height: 35px;width: 25%;">&nbsp;&nbsp;
<br><br> 
<input type="submit" value="SignUp">           
</form>
</body>
</html>