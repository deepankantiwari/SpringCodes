<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
</head>
<body>


	<h3>Add New Employee</h3>
	<%-- <form:form method="post" action="save">
		<table>
			<tr>
				<td>Employee Name :</td>
				<td><form:input path="empName" /></td>
			</tr>
			<tr>
				<td>Employee Email :</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form> --%>

	<form action="save" method="post">
		<table>
			<tr>
				<td>Employee Name</td>
				<td><input name="name"></td>
			</tr>
			<tr>
				<td>Employee salary</td>
				<td><input name="salary"></td>
			</tr>
			<tr>
				<td>Employee designation</td>
				<td><input name="designation"></td>
			</tr>
			
			<tr>
				<td></td>
				<td><input type="submit" value="save" /></td>
			</tr>
		</table>

	</form>

</body>
</html>