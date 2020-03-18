<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../checkToken.jsp"%>
<%@ include file="../menu.jsp"%>
<%@ include file="../logout.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online users</title>
</head>
<body>



	<c:set value="${pageContext.request.contextPath}" var="contextPath"></c:set>

	<table>
		<thead>
			<tr>
				<th>Username</th>
			</tr>
		</thead>
		<c:forEach items="${requestScope.onlineUsers}" var="user">
			<tbody>

				<tr>
					<td>${user}</td>

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