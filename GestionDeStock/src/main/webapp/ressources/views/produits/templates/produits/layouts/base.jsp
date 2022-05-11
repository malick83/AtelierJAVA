<!DOCTYPE html>
<html lang="fr">
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>my Market</title>
</head>
<body>

	<%@ include file="../../../../../public/partials/_navbar.jsp"%>
	
	<c:forEach items="${ produits.next() }" var="produit">
		<p>
			<c:out value="${ produit }" />
		</p>
	</c:forEach>
	<table class="table table-dark table-striped">
		<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Nom</th>
				<th scope=col>Designation</th>
				<th scope="col">Quantité</th>
				<th scope="col">Prix</th>
			</tr>
		</thead>
	</table>

	<%@ include file="../../../../../public/partials/_footer.jsp"%>
</body>
</html>




