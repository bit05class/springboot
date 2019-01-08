<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1></h1>
	<c:forEach var="bean" items="${alist }">
	<div>
		<span>${bean.empno }</span>
		<span>${bean.ename }</span>
		<span>${bean.sal }</span>
		<span>${bean.deptno }</span>
	</div>
	</c:forEach>
</body>
</html>