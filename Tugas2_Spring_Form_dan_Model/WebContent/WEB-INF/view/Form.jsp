<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
	<h3>Welcome, Enter The Oncologist's Doctor Details</h3>
	<form:form action="Tugas2_Spring_Form_dan_Model/showFrom" modelAttribute="oncologist" method="POST">
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
			<tr>
				<td> <input type="submit" name="Submit"></input> </td>
			</tr>
		</table>
	</form:form>
	
</body>
</html>