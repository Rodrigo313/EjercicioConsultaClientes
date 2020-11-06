<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Consulta las compras de nuestros clientes</h2>

<form action="" method="POST" id="formulario">

	<select name="nombres" form="formulario">
	
		<c:forEach items="${lista}" var="persona">
		
		<option value="${persona.id}" -> ${persona.nombre} </option>
		
		</c:forEach>
	
	</select>

</form>
</body>
</html>