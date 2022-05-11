<!DOCTYPE html>
<html lang="fr">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ts-immo</title>
</head>
<body>

<%@ include file="../../../../../public/partials/_navbar.jsp"  %>
<h1>Entreprise immobilière</h1>
<p>Bonjour ${ cproprietaire.prenom} ${ cproprietaire.nom}, vous êtes sur la page des proprietaires de l'entreprise Ts-immo</p>
<p>${ cproprietaire.actif ? "Vous êtes actif !!" : "Vous êtes inactif !!" }</p>

<p>
	<c:out value="Bonjour à nouveau !!" />
	<c:set var="prenom" value="Cheikh" scope="page" />
	<c:set var="nom" scope="page">Diop</c:set>
	<c:out value="${ prenom } ${ nom }" />
	
		<c:set var="nom" scope="page">FALL</c:set>
	<c:out value="${ prenom } ${ nom }" />
	
	<c:set target="${ cproprietaire }" property="prenom" value="Alioune"/>
	<c:out value="${ cproprietaire.prenom }"  />
	<c:remove var="prenom" scope="page" />
	<c:out value="${ prenom } ${ nom }" />
	
	<c:if test="${ 50 < 10 }" var="variable">
    	C'est vrai !
	</c:if>
	<c:set var = "variable1" scope = "session" value = "${3000*2}"/>
	<c:choose>
		<c:when test="${ variable1 == 4000 }">la valeur est égale à 4000</c:when>
		<c:when test="${ variable1 > 4000 }">la valeur est supérieure à 4000</c:when>
		<c:when test="${ variable3 < 4000 }">la valeur est inférieure à 4000</c:when>
		<c:otherwise>Valeur inconnue</c:otherwise>
	</c:choose>
</p>
<p>
	<c:forEach var="i" begin="0" end="10" step="2">
		<p>Un message important numéro <c:out value="${ i }" /> Malick !!</p>
	</c:forEach>
</p>

<c:forEach items="${ professions }" var="profession">
	<p><c:out value="${ profession }" />!!</p>
</c:forEach>
<hr />
<c:forEach items="${ professions }" var="profession" begin="0" end="1" varStatus="status">
	<p><c:out value="numéro ${ status.count } ${ profession }" />!!</p>
</c:forEach>

<hr />
<c:forTokens items="Les/Contrats/de/locations/Ts-immo arrivent à terme" var="morceau" delims="/ ">
	<p>${ morceau }</p>
</c:forTokens>
<p>

	<%@ include file="../../../../../public/partials/_footer.jsp"  %>
</p>
</body>
</html>

