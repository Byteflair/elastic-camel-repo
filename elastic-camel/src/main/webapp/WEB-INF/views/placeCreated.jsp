<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
	<head>
		<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet">
		<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
		<%@ page isELIgnored="false" %>
	</head>
	<body>
		<div class="container-fluid">
			<h1>Lugar <strong>${createdPlace.name}</strong> creado satisfactoriamente</h1>
			
			<div class="row-fluid">
				<a href="create-place" class="btn">Crear otro lugar</a>
			</div>
		</div>
	</body>
</html>