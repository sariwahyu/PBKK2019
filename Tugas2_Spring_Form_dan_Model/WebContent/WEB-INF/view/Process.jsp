<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script>
    <script src="<c:url value="/resources/js/main.js" />"></script>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
	<h2>Submitted Doctor Information</h2>
	<table class="table table-striped table-bordered">
		<tr>
			<td>ID</td>
			<td>${iddoc}</td>
		</tr>
		<tr>
			<td>Name</td>
			<td>${name}</td>
		</tr>
		<tr>
			<td>Address</td>
			<td>${address}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${email}</td>
		</tr>
	</table>

</body>
</html>