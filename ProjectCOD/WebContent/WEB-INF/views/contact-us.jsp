<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Us</title>
<spring:url value="/resources/css/nav.css" var="mainCss"/>
	<link href="${mainCss}" rel="stylesheet" />
</head>
<body>
<%@ include file="navigation_bar.html" %>
 	<h1>Contact Us</h1>
 	<form:form action="./contact-us" method="post" modelAttribute="user">
		<div>
			<label>Name: </label>
			<form:input path="username" /><br>
			<p><form:errors path="username"/></p>
		</div>
		<div>
			<label>Email: </label>
			<form:input path="email" /><br>
			<p><form:errors path="email" /></p>
		</div>
		<div>
			<label>Subject </label>
			<form:input path="password" /><br>
			<p><form:errors path="password" /></p>
		</div>
		<div>
			<label>Message </label>
			<form:input path="password" /><br>
			<p><form:errors path="password" /></p>
		</div>
		<div>
			<input type="submit" value="Register" />
		</div>
	
	
	</form:form>
</body>
</html>