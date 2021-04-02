<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<h1>Customer Registration</h1>
	<form:form action="./register" method="post" modelAttribute="customer">
		<div>
			<label>Email: </label>
			<form:input path="email" /><br>
			<p><form:errors path="email"/></p>
		</div>
		<div>
			<label>First Name: </label>
			<form:input path="firstName" /><br>
			<p><form:errors path="firstName" /></p>
		</div>
		<div>
			<label>Last Name: </label>
			<form:input path="lastName" /><br>
			<p><form:errors path="lastName" /></p>
		</div>
		<div>
			<label>Password: </label>
			<form:input path="password" /><br>
			<p><form:errors path="password" /></p>
		</div>
		<div>
			<label>PhoneNumber </label>
			<form:input path="phoneNumber" /><br>
			<p><form:errors path="phoneNumber" /></p>
		</div>
		<div>
			<input type="submit" value="Register" />
		</div>
	
	
	</form:form>
</body>
</html>