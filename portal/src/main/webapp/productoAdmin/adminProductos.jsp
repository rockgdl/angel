<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" charset="UTF-8">
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

	<h1 th:text="'la fecha actual es:' + ${fecha}"></h1>

	
	
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
			<form th:action="@{addProducto}" method="get">
			<td> </td>
			<td> <input type="text" name="nombre"> </td>
			<td> <input type="text" name="alta"> </td>
			<td> <input type="text" name="modificacion"> </td>
			<td>	 
				<select name="calidad">
					<option value="0">STANDAR</option>
					<option value="1">PREMIUM</option>
				</select> 
			</td>
			<td>
			 	<select name="unidad">
					<option value="0">KG</option>
					<option value="1">GRAMOS</option>
				</select>
			</td>
			<td> <textarea name="observacion" rows="4" cols="20"></textarea> </td>
			<td> <input type="text" name="precio"></td>
			<td> <input type="submit" value="Agregar"></td>
		</form>	
		</tr>
			
		<tr th:each="producto: ${productos}">
			<td th:text="${producto.id}">... </td>
			<td th:text="${producto.nombre}">... </td>
			<td th:text="${producto.fechaAlta}">... </td>
			<td th:text="${producto.fechaModificacion}">... </td>
			<td th:text="${producto.tipoCalidad}">... </td>
			<td th:text="${producto.unidad}">... </td>
			<td th:text="${producto.observaciones}">... </td>
			<td th:text="${producto.precio}">... </td>
			<td>
				<form action="productoAdmin/insertProducto" method="GET">
					<input type="submit" value="Eliminar"> <br><br>
				</form>
					
				<form action="productoAdmin/insertProducto" method="GET">
					<input type="submit" value="Modificar">
				</form>
			</td> 
		</tr>
	</tbody>
	</table>

</div>	
</body>
</html>