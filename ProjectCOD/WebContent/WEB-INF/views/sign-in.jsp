<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- Tag Library -->
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Page</title>

<spring:url value="/resources/css/sign-in.css" var="mainCss"/>
	<link href="${mainCss}" rel="stylesheet" />
</head>
<body>
	
	<form action="./sign-in" method="post">
		<div class="imgcontainer">
			<img src ="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQsqlLXvQzap9hX2xdgmBKa-kxmoKP4G2ppPg&usqp=CAU" alt="Avatar" class "avatar">
		</div>
		
		<div class ="container">
			<label>Email</label>
			<input type="text" name="email" />
			
			<label>Password</label>
			<input type="text" type="password" name="password" />
			
			<button type="submit"> Login</button> 
			
			<div class="button"> <a href= "/projectcod/register">Customer Registration</a></div>
		</div>
		
		</form>

</body>
</html>