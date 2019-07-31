<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${error}
<form action="login" method="post">
	Email : <input type="email" name="email" required>
	<br/>
	<br/>
	Password: <input type="password" name="pwd" required>
	<br/>
	<br/>
	<input type="submit" value="Login">
</form>
</body>
</html>