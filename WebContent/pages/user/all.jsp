<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All users</title>
</head>
<body>




	<table>
		<thead>
			<tr>
				<th>Username</th>
				<th>First name</th>
				<th>Last name</th>
			</tr>
		</thead>
		<c:forEach items="${requestScope.users}" var="user">
			<tbody>

				<tr>
					<td>${user.username}</td>
					<td>${user.firstName}</td>
					<td>${user.lastName}</td>
				</tr>
			</tbody>
		</c:forEach>
		<tr>
			<td><c:out value="${requestScope.listIsEmpty}"></c:out></td>
		</tr>
	</table>

	<c:out value="${requestScope.message}"></c:out>
</body>
</html>