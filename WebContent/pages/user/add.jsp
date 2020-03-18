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
<title>Add user</title>
</head>
<body>


	<c:set value="${pageContext.request.contextPath}" var="contextPath"></c:set>

	<form action="${contextPath}/application/user/save" method="post">
		<table>
			<tr>
				<td>Username:</td>
				<td><input type="text" id="username" name="username" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" id="password" name="password" /></td>
			</tr>
			<tr>
				<td>First name:</td>
				<td><input type="text" id="firstname" name="firstname" /></td>
			</tr>
			<tr>
				<td>Last name:</td>
				<td><input type="text" id="lastname" name="lastname" /></td>
			</tr>
			<tr>
				<td><input type="submit" id="save" name="action" value="Save" /></td>
			</tr>
			<tr>
				<td><c:out value="${requestScope.validationError}"></c:out></td>
			</tr>

		</table>
	</form>
	<c:out value="${requestScope.errorMessage}"></c:out>
</body>
</html>