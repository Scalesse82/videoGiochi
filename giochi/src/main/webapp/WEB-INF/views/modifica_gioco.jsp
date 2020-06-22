<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modifica Gioco</title>
</head>
<body>
	<div align="center">
		<form:form action="save" method="post" modelAttribute="gioco">
			<table border="0" cellpadding="5">

				<tr>
					<td>ID:</td>
					<td>${gioco.id}<form:hidden path="id" />
					</td>
				</tr>
				<tr>
					<td>Nome:</td>
					<td><form:input path="titolo" /></td>
				</tr>
				<tr>
					<td>Pegi:</td>
					<td><form:radiobuttons path="pegi" /></td>
				</tr>
				<tr>
					<td>Categoria:</td>
					<td><form:radiobuttons path="categoria" /></td>
				</tr>
				<tr>
					<td>Prezzo:</td>
					<td><form:input path="prezzo" /></td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="Salva"></td>
				</tr>
			</table>
		</form:form>
		<br> <br>

		<form action="indietro" method="post">
			<input type="submit" value="Torna Indietro">
		</form>
	</div>

</body>
</html>