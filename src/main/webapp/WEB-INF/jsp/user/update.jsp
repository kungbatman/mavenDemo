<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>update-${user.name}</title>
</head>
<body>
<c:if test="${errors != null}">
<div style="color:red">
	<c:forEach items="${errors}" var="error">
		<p>${error.defaultMessage}</p>
	</c:forEach>
	</div>
</c:if>
	<form action="doUpdate.do" method="post">
		<input type="hidden" name="id" value="${user.id}">
		<p>
			<label>name: </label> <input type="text" name="name" value="${user.name}">
		</p>
		<p>
			<label>age: </label> <input type="number" name="age" value="${user.name}">
		</p>
		<p>
			<input type="submit" name="" value="提交">
		</p>
	</form>
</body>
</html>