<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
	Hello

	<table>
		<c:forEach var="user" items="${myForm.users}" varStatus="status">
			<tr>
				<td style="padding: 3px;">${status.count}</td>
				<td>${user.loginName}</td>
				<td>${user.balance}</td>
			</tr>
		</c:forEach>
	</table>
	<table>
	<form:form commandName="myForm">
		<c:forEach var="user" items="${myForm.users}" varStatus="status">
			<tr>
				<td><spring:bind path="users[${status.index}].loginName">
						<c:out value="${status.value}" />
					</spring:bind></td>
				<td><spring:bind path="users[${status.index}].balance">
						<c:out value="${status.value}" />
					</spring:bind></td>
			</tr>
		</c:forEach>
	</form:form>
	</table>
	-->
</body>
</html>