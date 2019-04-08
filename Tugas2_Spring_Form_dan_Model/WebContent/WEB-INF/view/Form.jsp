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
<title>Form Oncologist</title>
</head>
<body>
	<div class="container">
		<h1>Welcome, Enter The Oncologist's Doctor Details</h1>
		<form:form action="processForm" method="POST" modelAttribute="oncologist">
			<table>
		    	<tr>
		        	<td><form:label path="iddoc">ID</form:label></td>
		            <td><form:input path="iddoc" class="form-control"/></td>
		            <td><form:errors path="iddoc" cssClass="error"></form:errors>
		        </tr>
		        <tr>
		        	<td><form:label path="name">Name</form:label></td>
		            <td><form:input path="name" class="form-control"/></td>
		            <td><form:errors path="name" cssClass="error"></form:errors>
		        </tr>
		        <tr>
		        	<td><form:label path="address">Address</form:label></td>
					<td><form:input path="address" class="form-control"/></td>
					<td><form:errors path="address" cssClass="error"></form:errors>
				</tr>
				<tr>
					<td><form:label path="email">E-mail</form:label></td>
					<td><form:input path="email" class="form-control"/></td>
					<td><form:errors path="email" cssClass="error"></form:errors>
				</tr>
				<tr>
					<td><form:label path="status">Status</form:label></td>
					<td>
						<form:select path="status">
							<form:options items="${oncologist.status}" class="form-control"/>
						</form:select>
					</td>
				</tr>
				<tr>
					<td><form:label path="spesialisasi">Spesialisasi</form:label></td>
					<td></td>
					<td><form:radiobutton path="spesialisasi" value="otak" class="form-control"/>Otak</td>
					<td><form:radiobutton path="spesialisasi" value="rahim" class="form-control"/>Rahim</td>
					<td><form:radiobutton path="spesialisasi" value="tulang" class="form-control"/>Tulang</td>
					<td><form:radiobutton path="spesialisasi" value="kulit" class="form-control"/>Kulit</td>
					<td><form:radiobutton path="spesialisasi" value="mata" class="form-control"/>Matak</td>
					<td><form:radiobutton path="spesialisasi" value="napas" class="form-control"/>Saluran pernapasank</td>
				</tr>
				<tr>
					<td><form:label path="jadwalPraktek">Jadwal Praktek</form:label></td>
					<td></td>
					<td><form:checkbox path="jadwalPraktek" value="senin" class="form-control"/>Senin</td>
					<td><form:checkbox path="jadwalPraktek" value="selasa" class="form-control"/>Selasa</td>
					<td><form:checkbox path="jadwalPraktek" value="rabu" class="form-control"/>Rabu</td>
					<td><form:checkbox path="jadwalPraktek" value="kamis" class="form-control"/>Kamis</td>
					<td><form:checkbox path="jadwalPraktek" value="jumat" class="form-control"/>Jumat</td>
					<td><form:checkbox path="jadwalPraktek" value="sabtu" class="form-control"/>Sabtu</td>
					<td><form:checkbox path="jadwalPraktek" value="minggu" class="form-control"/>Minggu</td>
				</tr>
				<tr>
					<td><input type="submit" class="btn btn-default" class="form-control" value="Submit"/></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>