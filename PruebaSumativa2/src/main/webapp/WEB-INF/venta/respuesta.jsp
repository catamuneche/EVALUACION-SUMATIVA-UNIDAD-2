<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../templates/navbar.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Respuesta Venta</title>
</head>
<body>
<h1>Venta guardado</h1>
	<div class="container">
		<p>Detalle: <c:out value="${venta.detalle}"/></p>
		
		<form action="/">
    	<input type="submit" value="HOME">
    </form>
	</div>
</body>
</html>