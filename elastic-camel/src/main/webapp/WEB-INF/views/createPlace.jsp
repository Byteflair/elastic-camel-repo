<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
	<head>
		<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet">
		<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container-fluid">
			<h1>Crear Lugar</h1>
			
			<form:form method="post" commandName="newPlace" action="create-place" cssClass="form-horizontal">
				<div class="control-group">
					<label class="control-label" for="name">Nombre del lugar</label>
					<div class="controls">
						<form:input path="name" placeholder="Nombre del lugar" cssClass="span8" />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="type">Tipo de lugar</label>
					<div class="controls">
						<form:input path="type" placeholder="Restaurante, Monumento, Hospital" cssClass="span8" />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="lat">Latitud</label>
					<div class="controls">
						<form:input path="lat" placeholder="Latitud del lugar" cssClass="span3" />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="lng">Longitud</label>
					<div class="controls">
						<form:input path="lng" placeholder="Longitud del lugar" cssClass="span3" />
					</div>
				</div>
				
				<div class="control-group">
					<div class="controls">
						<button type="submit" class="btn">Crear lugar</button>
					</div>
				</div>
			</form:form>
		</div>
	</body>
</html>