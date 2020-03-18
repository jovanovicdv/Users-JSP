<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<div>
		<c:url value="/application/login" var="loginURL"></c:url>
		<a href="<c:out value="${loginURL}"/>">Login</a>
	</div>
</body>
</html>