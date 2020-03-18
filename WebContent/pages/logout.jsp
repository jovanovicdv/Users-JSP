<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<p>
	Logged in as:<c:out value="${sessionScope.username}"></c:out>
	<a href="${contextPath}/application/logout">Logout</a>
</p>