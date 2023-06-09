<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pagina JSP</title>
</head>
<body>
<c:import url="logout-parcial.jsp"></c:import>

	<c:if test="${ not empty empresa}">
		Se ha registrado la empresa : ${ empresa }
	</c:if>
	<c:if test="${ empty empresa}">
		No se ha registrado ninguna empresa
	</c:if>
	
</body>
</html>