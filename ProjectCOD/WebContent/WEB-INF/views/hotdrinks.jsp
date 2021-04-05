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
</head>
<body>
 <%@ include file="navigation_bar.html" %>
	<h1>Hot Drinks</h1>
	
	<table>
		<c:forEach var="item" items="${items}">
			<tr>
				<td> ${item.itemName }</td>
				<td> ${item.itemCost }</td>
				 <td> ${item.description}</td>
				 <td> <img alt="drinks" src=${item.itemUrl} style="width: 400px; height: 300px;"></td>
				 <%-- <td> <a href="<img src="${pageContext.request.contextPath}${item.itemUrl}" width="100px" height="100px"/>"></a> --%>
				<%--  <td> ${item.itemUrl}</td>	 --%>
					
			</tr>
			<%-- <img src="<c:url value="${item.itemUrl}"/>"/> --%>
			<%-- <img src="${pageContext.request.contextPath}${item.itemUrl}" width="100px" height="100px"/> --%>
		</c:forEach>
		
	</table>
</body>
</html>