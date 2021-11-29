<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../templates/navbar.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Respuesta Usuario</title>
</head>
<body>
<h1>Usuario guardado</h1>
	<div class="container">
		<p>Nombre: <c:out value="${usuario.nombre}"/></p>
		<p>Apellido: <c:out value="${usuario.apellido}"/></p>
		
		<form action="/">
    	<input type="submit" value="HOME">
    </form>
	</div>
</body>
</html>