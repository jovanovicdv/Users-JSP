<%@ page import="domain.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div>
	<c:url value="/application/home" var="homeURL"></c:url>
	<a href="<c:out value="${homeURL}"/>">Home</a>
</div>

<div>
	<c:url value="/application/user/all" var="allUserURL"></c:url>
	<a href="<c:out value="${allUserURL}"/>">All users</a>
</div>

<div>
	<c:url value="/application/user/add" var="addUserURL"></c:url>
	<a href="<c:out value="${addUserURL}"/>">New user</a>
</div>

<div>
	<c:url value="/application/user/online" var="onlineUserURL"></c:url>
	<a href="<c:out value="${onlineUserURL}"/>">Users on system</a>
</div>
