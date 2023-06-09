<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario Registro Empresa</title>
</head>
<body>
<c:import url="logout-parcial.jsp"></c:import>

	<form action="${ linkEntradaServlet}" method="post">
		<label> Nombre de la empresa</label>
		<input type="text" name="nombre" />
		<input type="hidden" name="accion" value="NuevaEmpresa"/>
		<br><br>
		<label> Fecha de Abertura</label>
		<input type="text" name="fecha"  />
		<br><br>
		<input type="submit"/>
	</form>

</body>
</html>