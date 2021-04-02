<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- Tag Library -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Page</title>
</head>
<body>
	
	<h1>Log-In Page</h1>
	<h3>${LoginFailedMessage}</h3>
	<form action="./sign-in" method="post">
		<div>
			<label>Email</label>
			<input type="text" name="email" />
		</div>
		<div>
			<label>Password</label>
			<input type="text" type="password" name="password" />
		</div>
		<div>
			<input type="submit" value="Login" />
		</div>
	</form>
	
	<div> <a href= "/projectcod/register">Customer Registration</a></div>
</body>
</html>