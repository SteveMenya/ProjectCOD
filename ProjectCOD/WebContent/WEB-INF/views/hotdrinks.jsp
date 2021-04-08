<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hot</title>
	<spring:url value="/resources/css/nav.css" var="mainCss"/>
	<link href="${mainCss}" rel="stylesheet" />	
	<spring:url value="/resources/css/items.css" var="mainCss"/>
	<link href="${mainCss}" rel="stylesheet" />
<body>
</head>
<body>
 	<%@ include file="navigation_bar.html" %>
 	<div class="container">
		<c:forEach var="item" items="${items}">
			<div class="wrapper"> 
				<div class="products">
				<div class= "item-image"> <img alt="drinks" src=${item.itemUrl} ></div>
					<ul class= "item-info">	
						<li><h3>${item.itemName}</h3></li>
						<li><strong>${item.itemCost}</strong></li>
						<li><p>${item.description}</p></li>
					</ul>				
				</div>
			</div>
		</c:forEach>	
	</div>
		
</body>
</html>