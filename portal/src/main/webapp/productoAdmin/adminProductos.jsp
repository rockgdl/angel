<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<style type="text/css">
		table, th, td {
			border: 1px solid black;
			border-collapse: collapse;
		}
		
		th, td{
			padding: 5px;
			text-align: center;
		}
	</style>

</head>
<body>

<div>

	<table align="center">
		<tbody>
		<tr>
			<th> ID </th>
			<th> Producto </th>
			<th> Alta </th>
			<th> Ultima modificiación </th>
			<th> Tipo Calidad</th>
			<th> Unidad </th>
			<th> Observación </th>
			<th> Precio</th>
			<th>Operación </th>
		</tr>
				
		<tr>
		<form action="insertProducto.jsp" method="POST">
			<td> </td>
			<td> <input type="text" name="nombre"> </td>
			<td> <input type="text" name="alta"> </td>
			<td> <input type="text" name="modificacion"> </td>
			<td>	 
				<select>
					<option value="1">STANDAR</option>
					<option value="2">PREMIUM</option>
				</select> 
			</td>
			<td>
			 	<select>
					<option value="1">KG</option>
					<option value="2">GRAMOS</option>
				</select>
			</td>
			<td> <textarea name="observacion" rows="4" cols="20"></textarea> </td>
			<td> <input type="text" name="precio"></td>
			<td> <input type="submit" value="Agregar"> </td>
		</form>
		</tr>
			
		<tr>
			<td> 1</td>
			<td> 1</td>
			<td> 1</td>
			<td> 1</td>
			<td> 1</td>
			<td> 1</td>
			<td> 1</td> 
			<td> 1</td>
			<td>
				<form action="insertProducto.jsp" method="GET">
					<input type="submit" value="Eliminar"> <br><br>
				</form>
					
				<form action="insertProducto.jsp" method="GET">
					<input type="submit" value="Modificar">
				</form>
			</td> 
		</tr>
			
		<tr>
			<td> 2</td>
			<td> 2</td>
			<td> 2</td>
			<td> 2</td>
			<td> 2</td>
			<td> 2</td>
			<td> 2</td>
			<td> 2</td>
			<td>
				<form action="insertProducto.jsp" method="GET">
					<input type="submit" value="Eliminar"> <br><br>
				</form>
				
				<form action="insertProducto.jsp" method="GET">
					<input type="submit" value="Modificar">
				</form>
			</td> 
		</tr>
	</tbody>
	</table>

</div>	
</body>
</html>