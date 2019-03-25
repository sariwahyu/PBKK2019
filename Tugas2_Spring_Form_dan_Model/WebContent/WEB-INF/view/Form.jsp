<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script>
    <script src="<c:url value="/resources/js/main.js" />"></script>
<meta charset="ISO-8859-1">
<title>Hello Form</title>
</head>
<body>
	<div class="container">
		<h1>Welcome, Enter The Oncologist's Doctor Details</h3>
		<form:form action="processForm" method="POST" modelAttribute="oncologist">
			<table>
		    	<tr>
		        	<td><form:label path="iddoc">ID</form:label></td>
		            <td><form:input path="iddoc" class="form-control"/></td>
		        </tr>
		        <tr>
		        	<td><form:label path="name">Name</form:label></td>
		            <td><form:input path="name" class="form-control"/></td>
		        </tr>
		        <tr>
		        	<td><form:label path="address">Address</form:label></td>
					<td><form:input path="address" class="form-control"/></td>
				</tr>
				<tr>
					<td><form:label path="email">E-mail</form:label></td>
					<td><form:input path="email" class="form-control"/></td>
				</tr>
				<tr>
					<td><input type="submit" class="btn btn-primary" class="form-control" value="Submit"/></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>