<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
<spring:url value="/resources/css/nav.css" var="mainCss"/>
	<link href="${mainCss}" rel="stylesheet" />
</head>
<body>
<%@ include file="navigation_bar.html" %>
		<h1>Welcome ${currentCustomer.firstName} Please place an Order</h1>
		
		
	<h1>Customer Registration</h1>
 	<%-- <form:form action="./welcome" method="post" modelAttribute="customer">
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
	
	
	</form:form>  --%>
		
</body>
</html>