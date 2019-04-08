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
<title>Display Profile</title>
</head>
<body>
<div class="container">
	<h1>Submitted Doctor Information</h1>
	<div class="form-group col-md-8">
	<table class="table table-bordered table-hover">
		<tr>
			<td>ID</td>
			<td>${iddoc}</td>
		</tr>
		<tr>
			<td>Name</td>
			<td>${oncologist.name}</td>
		</tr>
		<tr>
			<td>Address</td>
			<td>${oncologist.address}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${oncologist.email}</td>
		</tr>
		<tr>
			<td>Status</td>
			<td>${oncologist.status}</td>
		</tr>
		<tr>
			<td>Spesialisasi</td>
			<td>${oncologist.spesialisasi}</td>
		</tr>
		<tr>
			<td>Jadwal Praktek</td>
			<td>
				<c:forEach var="temp" items="${oncologist.jawalPraktek}">
				<li>${temp}</li>
				</c:forEach>
			</td>
		</tr>
	</table>
	</div>
</div>
</body>
</html>