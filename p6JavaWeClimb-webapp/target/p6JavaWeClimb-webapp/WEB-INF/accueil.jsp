<%@ page pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>WeClimb</title>
	</head>
	<body>
		<p> Bienvenue sur WeClimb </p>
		<p>L'utilisateur est :
			<% request.getAttribute("nom"); %>
		</p>
		
	</body>
</html>