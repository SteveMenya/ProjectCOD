<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
		<h1>Welcome ${currentCustomer.firstName}</h1>
		<h1>Welcome ${currentCustomer.lastName}</h1>
		<h5>${currentCustomer.firstName}'s phone number is: ${currentCustomer.phoneNumber}</h5>
		
</body>
</html>