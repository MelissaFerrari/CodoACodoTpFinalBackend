<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Clientes</title>
</head>
<body>
	<h1>Listar Clientes</h1>

	<table border="1">
		<tr>
			<td>Id</td>
			<td>Nombre</td>
			<td>Apellido</td>
			<td>Email</td>
			
		</tr>
		<c:forEach var="cliente" items="${lista}">
			<tr>
				<td> <a href="productos?opcion=meditar&id=<c:out value="${ cliente.id}"></c:out>"> <c:out value="${ cliente.id}"></c:out>  </a> </td>
				<td> <c:out value="${cliente.nombre}"></c:out> </td>
				<td> <c:out value="${cliente.apellido}"></c:out></td>
				<td> <c:out value="${cliente.email}"></c:out> </td>
			
			</tr>
		</c:forEach>
	</table>
</body>
</html>