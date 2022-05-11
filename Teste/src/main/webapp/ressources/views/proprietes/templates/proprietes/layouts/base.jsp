<!DOCTYPE html>
<html lang="fr">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ts-immo</title>
</head>
<body>

<%@ include file="../../../../../public/partials/_navbar.jsp"  %>
<h1>Entreprise immobilière</h1>

<c:if test="${ !empty fichier}">
	<p>
		<c:out value="Le fichier ${ fichier } (${ description }) a été uploadé !"></c:out>
	</p>
</c:if>
<form method="POST" action="" enctype="multipart/form-data">
	<div>
		<p><label for="description">Description</label></p>
		<input type="text" name="description" id="description" placeholder="votre description">
	</div>
	<div>
		<p><label for="fichier">Fichier</label></p>
		<input type="file" name="fichier" id="fichier">
	</div>
	<p><button type="submit">Envoyer</button></p>
</form>
	<%@ include file="../../../../../public/partials/_footer.jsp"  %>

</body>
</html>

