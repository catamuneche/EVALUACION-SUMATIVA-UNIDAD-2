<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../templates/navbar.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Respuesta Producto</title>
</head>
<body>
<h1>Producto guardado</h1>
	<div class="container">
		<p>Nombre Producto: <c:out value="${producto.nombreProducto}"/></p>
		<p>Descripcion Producto: <c:out value="${producto.descripcionProducto}"/></p>
		<p>Precio Producto: <c:out value="${producto.precioProducto}"/></p>
		
		<form action="/">
    	<input type="submit" value="HOME">
    </form>
	</div>
</body>
</html>