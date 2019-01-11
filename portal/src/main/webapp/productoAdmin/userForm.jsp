<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">

<title>Insert title here</title>

</head>
<body>
	<form th:action="@{createUser}" method="POST">
		<br>
		<label>Nombre de usuario:</label>
		<input type="text" name="nombreUser">
		<br>
		<label>Contraseña:</label>
		<input type="password" name="contrasena">
		<br>
		<label>Nombre:</label>
		<input type="text" name="nombre">
		<br>
		<label>Apellido:</label>
		<input type="text" name="apellido">
		<br>
		<label>País:</label>
		<input type="text" name="pais">
		<br>
		<label>¿Activo?</label>
		<select name="activo">
			<option value="1">Si
			<option value="0">NO
		</select>
		<br>
		<label>Role:</label>
		<select name="role">
			<option value="ROLE_USER">Usuario
			<option value="ROLE_ADMIN">Administrador
		</select>
		
		<input type="submit" value="Aceptar">
	</form>
	
</body>
</html>