<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>

<!-- Tag includes navigation style on this page -->
<spring:url value="/resources/css/nav.css" var="mainCss"/>
	<link href="${mainCss}" rel="stylesheet" />
	
	<spring:url value="/resources/css/register.css" var="mainCss"/>
	<link href="${mainCss}" rel="stylesheet" />
</head>
<body>


<!-- This tag includes the navigation bar on contact-us page -->
<%@ include file="navigation_bar.html" %>
	
	<div class= "container">

	<div style= "text-align:center">
	<h2>Customer Registration</h2>
	<p>Would you  like to fast check-out? Set up an account:</p>
	</div>
	
	<!--Beginning of form -->
	<div class= "row"> 
 		<div class= "column">
 			<img src="https://www.clipartkey.com/mpngs/m/320-3201892_new-student-registration-checklist-clipart.png" style="width:100%">
 		</div>
		
		<div class="column">
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
	</div>
	</div>
	</div>
	

<%-- 	<h1>Customer Registration</h1>
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
	
	
	</form:form> --%>
</body>
</html>