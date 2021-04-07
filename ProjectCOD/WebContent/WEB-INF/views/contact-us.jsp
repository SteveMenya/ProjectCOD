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
	
<spring:url value="/resources/css/contactus.css" var="mainCss"/>
	<link href="${mainCss}" rel="stylesheet" />
</head>
<body>
	<!-- This tag includes the navigation bar on contact-us page -->
<%@ include file="navigation_bar.html" %>

	<div class= "container">
		<div style= "text-align:center">
		<h2>Contact Us</h2>
 	<p>Swing by for a cup of coffee or leave us a message:</p>
 	</div>
	
		<!-- Beginning of form -->
 	<div class= "row"> 
 		<div class= "column">
 			<img src="resources/images/cafefront.jpg" style="width:100%">
 		</div>
 		
 		<div class="column">
 		<form:form action="./contact-us" method="post" modelAttribute="feedback">
		<div>
			<label>First Name: </label>
			<form:input path="firstName" /><br>
			<p><form:errors path="firstName" /></p>
		</div>
		<div>
		<div>
			<label>Last Name: </label>
			<form:input path="lastName" /><br>
			<p><form:errors path="lastName" /></p>
		</div>
			<label>Email: </label>
			<form:input path="email" /><br>
			<p><form:errors path="email"/></p>
		</div>
		
		<div>
			<label>Message </label>
			<form:input path="Message" /><br>
			<p><form:errors path="Message" /></p>
		</div>
		<div>
			<input type="submit" value="Submit" />
		</div>
	
	</form:form>
 		
 		</div>
	</div>
 	
 
 	</div>
<%-- <form:form action="./contact-us" method="post" modelAttribute="feedback">
		<div>
			<label>First Name: </label>
			<form:input path="firstName" /><br>
			<p><form:errors path="firstName" /></p>
		</div>
		<div>
		<div>
			<label>Last Name: </label>
			<form:input path="lastName" /><br>
			<p><form:errors path="lastName" /></p>
		</div>
			<label>Email: </label>
			<form:input path="email" /><br>
			<p><form:errors path="email"/></p>
		</div>
		
		<div>
			<label>Message </label>
			<form:input path="Message" /><br>
			<p><form:errors path="Message" /></p>
		</div>
		<div>
			<input type="submit" value="Submit" />
		</div>
	
	
	</form:form> --%>

</body>
</html>