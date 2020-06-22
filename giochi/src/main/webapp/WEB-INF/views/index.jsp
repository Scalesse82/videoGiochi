<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home</title>
</head>
<body>

	<div align="center">
		<a href="new">Aggiungi Gioco</a> &nbsp; <br> <br> <br>
		
		
		<form action="filtra">
			 
			 seleziona la categoria:<br><br>
			<input type="radio" name="categoria" value="0" > 
			<label	for="horror">HORROR</label><br> 
			<input type="radio" name="categoria" value="1"> 
			<label for="sport">SPORT</label><br>
			<input type="radio" name="categoria" value="2"> 
			<label for="fps">FPS</label><br>
			<input type="radio" name="categoria" value="3"> 
			<label for="action">ACTION</label><br>
			<input type="radio" name="categoria" value="4"> 
			<label for="rps">RPG</label><br>
			<input type="radio" name="categoria" value="5" checked="checked"> 
			<label for="rps">Tutte le categorie</label><br><br>
			
			seleziona il filtro:<br><br>
			
			<input type="radio" name="field" value="0" checked="checked"> 
			<label	for="titolo">titolo</label><br> 
			<input type="radio" name="field" value="1"> 
			<label for="pegi">pegi</label><br>
			<input type="radio" name="field" value="2"> 
			<label for="prezzo">prezzo</label><br><br>
			 <input type="submit"value="ordina"><br> <br>
		</form>


		<table border="1">
			<tr>

				<th>ID</th>
				<th>Nome</th>
				<th>Pegi</th>
				<th>Categoria</th>
				<th>Prezzo</th>
				<th>Modifica</th>
				<th>Elimina</th>

			</tr>
			<c:forEach items="${lista}" var="gioco">
				<tr>
					<td>${gioco.id}</td>
					<td>${gioco.titolo}</td>
					<td>${gioco.pegi}</td>
					<td>${gioco.categoria}</td>
					<td>${gioco.prezzo}</td>
					<td><a href="modifica?id=${gioco.id}">Modifica </a></td>
					<td><a href="elimina?id=${gioco.id}">Elimina</a></td>

				</tr>
			</c:forEach>
		</table>
		<br>

		

	</div>






</body>
</html>