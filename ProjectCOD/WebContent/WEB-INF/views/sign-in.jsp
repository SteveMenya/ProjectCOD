<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- Tag Library -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1>Login Page</h1>
	<h3>${LoginFailedMessage}</h3>
	<form action="./sign-in" method="post">
		<div>
			<label>Username</label>
			<input type="text" name="username" />
		</div>
		<div>
			<label>Password</label>
			<input type="text" type="password" name="password" />
		</div>
		<div>
			<input type="submit" value="Login" />
		</div>
	</form>
</body>
</html>