<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario Ingreso de Usuarios</title>
</head>
<body>
	<form action="${ linkEntradaServlet}" method="post">
		<label> Login</label>
		<input type="text" name="login" />
		<input type="hidden" name="accion" value="Login"/>
		<br><br>
		<label> Contraseña</label>
		<input type="password" name="contrasena"  />
		<br><br>
		<input type="submit"/>
	</form>

</body>
</html>