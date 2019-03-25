<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Welcome, Enter The Oncologist's Doctor Details</h3>
	<form:form action="/enteroncologist" method="get">
		<table>
			<tr>
				<td><form:label path="iddoc">ID</form:label>
				<td><input type="text" name="Iddoc"></input>
			</tr>
			<tr>
				<td><form:label path="name">Name</form:label>
				<td><input type="text" name="Name"></input>
			</tr>
			<tr>
				<td><form:label path="address">Address</form:label>
				<td><input type="text" name="Address"></input>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label>
				<td><input type="text" name="Email"></input>
			</tr>
		</table>
		<input type="submit" name="Submit"></input> 
	</form:form>
	
</body>
</html>