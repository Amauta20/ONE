<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.alura.gerenciador.model.Empresas"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:import url="logout-parcial.jsp"></c:import>

Usuario Logeado: ${ loginUsuario.login} <br><br>

<ul>
	<li><a href="/gerenciador/entrada?accion=NuevaEmpresaForm">Agregar nueva empresa</a></li>
</ul>
	
	
<h3>Lista de Empresas</h3>
	<ul>
		<c:forEach items="${ empresas}" var="empresa">
			<li>
				${ empresa.nombre } - <fmt:formatDate value="${ empresa.fechaAbertura}" pattern="dd/MM/yyyy" />
				<a href="/gerenciador/entrada?accion=MostrarEmpresa&id=${ empresa.id}" >Modificar</a>
				   |   
				<a href="/gerenciador/entrada?accion=EliminarEmpresa&id=${ empresa.id}" >Eliminar</a>
			</li>
		</c:forEach>
	</ul>
		
</body>
</html>