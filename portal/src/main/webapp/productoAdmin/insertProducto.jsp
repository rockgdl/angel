<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="adminProductos.jsp" method="POST">
		<label>Nombre:</label>
		<input type="text" name="nombre"> <br><br>
		
		<label>Alta:</label>
		<input type="text" name="alta"> <br><br>
		
		<label>Modificacion:</label>
		<input type="text" name="modificacion"> <br><br>
		
		<label>Nombre:</label>
		<input type="text" name="nombre"> <br><br>
		
		<label>Calidad:</label>
		<input type="text" name="Calidad"> <br><br>
		
		<label>Unidad:</label>
		<input type="text" name="unidad"> <br><br>
		
		<label>Observacion :</label>
		<textarea type="text" name="observacion" rows="4" cols="50"> </textarea> <br><br>
		
		<label>Precio:</label>
		<input type="text" name="precio"> <br><br>
		
		<input type="submit" value="Agregar">
	</form>
</body>
</html>