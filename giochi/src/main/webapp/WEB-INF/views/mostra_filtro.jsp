<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>filtro</title>
</head>
<body>

	<div align="center">

		<table border="1">
			<tr>

				<th>ID</th>
				<th>Nome</th>
				<th>Pegi</th>
				<th>Categoria</th>
				<th>Prezzo</th>
				

			</tr>
			<c:forEach items="${lista}" var="gioco">
				<tr>
					<td>${gioco.id}</td>
					<td>${gioco.titolo}</td>
					<td>${gioco.pegi}</td>
					<td>${gioco.categoria}</td>
					<td>${gioco.prezzo}</td>
					
				</tr>
			</c:forEach>
		</table>
		<br>

		<form action="indietro" method="post">
			<input type="submit" value="Torna Indietro">
		</form>

	</div>



</body>
</html>