<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ts-immo</title>
</head>
<body>

<%@ include file="../../../public/partials/_navbar.jsp"  %>
<h1>Entreprise immobilière</h1>
<p>Bonjour et bienvenue sur la page d'accueil de Ts-Immo</p>
	<% 
		String message = (String)request.getAttribute("formulaire"); 
		out.println(message);
	%>
<c:if test="${ !empty connectionForm.resultat }">
	<p>
		<c:out value="${ connectionForm.resultat }" />
	</p>
</c:if>

<form method="POST" action="">
	<div>
		<p><label for="prenom">Prenom</label></p>
		<input type="text" name="prenom" id="prenom" placeholder="Malick">
	</div>
	<div>
		<p><label for="nom">Nom</label></p>
		<input type="text" name="nom" id="nom" placeholder="KEBE">
	</div>
	<div>
		<p><label for="telephone">Telephone</label></p>
		<input type="text" name="telephone" id="telephone" placeholder="787777777">
	</div>
	<p><button type="submit">Envoyer</button></p>
</form>
	<%@ include file="../../../public/partials/_footer.jsp"  %>
</body>
</html>

