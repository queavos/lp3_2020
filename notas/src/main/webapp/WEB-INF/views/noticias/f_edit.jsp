<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nueva Nota</title>
<link href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" />
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<form action="../actualizar" method="post" >
<h3>Crear Nota  </h3>
	<input type="hidden" name="id" value="${ noticia.getId()}" class="form-control">
	<label>Titulo</label>
	<input type="text" name="titulo" placeholder="Ingrese el titulo de la nota" class="form-control" value="${ noticia.getTitulo()}">  
	<br>
	<label>Fecha</label>
	<input type="date" name="fecha" placeholder="Ingrese el titulo de la nota" class="form-control" value="${ noticia.getFecha()}" > 
	<br>
	<label>Categoria</label>
	<select name="categoria" id="categoria" class="form-control"> 
	<core:forEach  items="${categorias}" var="cate"  >
		 <option value="${ cate.getId()}" 
		${cate.getId()==noticia.getCategoria().getId()? "selected": ""} 

		 >${ cate.getNombre()}</option>
	<!-- 		${cate.getId()==noticia.getCategoria().getId()? "selected": ""} 	 -->
	</core:forEach>
	</select>
	<br>
	<label>Contenido</label>
	<textarea rows="5" cols="80" name="contenido" placeholder="Ingrese el contenido de su nota"  class="form-control">${ noticia.getContenido()}</textarea>
	<br>
	<button type="submit" class="btn btn-secondary">Enviar </button> 

</form>

</div>
</body>
</html>