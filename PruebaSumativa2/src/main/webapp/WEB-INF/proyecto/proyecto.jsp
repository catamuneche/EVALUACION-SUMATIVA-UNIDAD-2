<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="../templates/navbar.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<form:form class="form-group" method="POST" action="/proyecto/crear" modelAttribute="proyecto">
			<div class="row">
				<form:label class="col-2 col-form-label" path="name">Nombre:</form:label>
				<div class="col-10">
					<form:input class="form-control" type="text" path="name"/> 
				</div>

				<form:label class="col-2 col-form-label" path="description">Descripci�n:</form:label>
				<div class="col-10">
					<form:input class="form-control" type="text" path="description"/> 
				</div>
			</div>
			<div class="d-flex justify-content-center">
				<input class="btn btn-danger m-2" type="reset" value="Limpiar">
				<input class="btn btn-primary m-2" type="submit" value="Insertar"> 
			</div>
		</form:form>
		
		<br>
		<hr>
		
		<table class="table">
			<thead>
		    	<tr>
		      	<th scope="col">#</th>
		      	<th scope="col">Nombre</th>
		      	<th scope="col">Descripcion</th>
		      	<th scope="col">Fecha Inicio</th>
		      	<th scope="col">Fecha Modificaci�n</th>
		      	<th scope="col">Acciones</th>
		    	</tr>
		  	</thead>
		  	<tbody>
		  		<c:forEach items="${listaProyectos}" var="proyecto">
		    		<tr>
			      		<th scope="row">${proyecto.getId()}</th>
			      		<td>${proyecto.getName()}</td>
			      		<td>${proyecto.getDescription()}</td>
			      		<td>${proyecto.getCreateAt()}</td>
			      		<td>${proyecto.getUpdateAt()}</td>
	      		  		<td class="d-flex justify-content-center">
	      		  		<form method="post" action="/proyecto/eliminar">
	      		  			<input type="hidden" name="id" value="${proyecto.getId()}">
							<input class="btn btn-danger btn-sm" type="submit" value="Eliminar">
	      		  		</form>
	      		  		<form method="post" action="/proyecto/editar">
	      		  			<input type="hidden" name="id" value="${proyecto.getId()}">
							<input class="btn btn-primary btn-sm" type="submit" value="Editar">
						</form>
				  		</td>
		    		</tr>
		  		</c:forEach>
		  	</tbody>
		</table>
		
	</div>
	
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</html>