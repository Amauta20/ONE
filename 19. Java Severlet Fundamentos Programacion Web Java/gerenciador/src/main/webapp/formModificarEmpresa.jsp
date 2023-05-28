<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/modificarEmpresa" var="lsModificarEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario Registro Empresa</title>
</head>
<body>
	<form action="${ lsModificarEmpresa}" method="post">
		<label> Nombre de la empresa</label>
		<input type="hidden" name="id" value="${ empresa.id}"/>
		<input type="text" name="nombre" value="${ empresa.nombre}"/>
		<br><br>
		<label> Fecha de Abertura</label>
		<input type="text" name="fecha" value="<fmt:formatDate value="${ empresa.fechaAbertura}" pattern="dd/MM/yyyy" />" />
		<br><br>
		<input type="submit"/>
	</form>

</body>
</html>