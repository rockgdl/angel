
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
	<title>Insert title here</title>
	
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
</head>

<body>

<div>

	<h1 th:text="'la fecha actual es:' + ${fecha}"></h1>

	
	<form th:action="@{addProducto}" method="get">
		<table align="center" class="table table-striped">
			<thead class="black white-text ">
				<tr>
					<th> ID </th>
					<th> Producto </th>
					<th> Alta </th>
					<th> Ultima modificiación </th>
					<th> Tipo Calidad</th>
					<th> Unidad </th>
					<th> Observación </th>
					<th> Precio</th>
					
				</tr>
			</thead>
			
			<tbody>		
				<tr>
					
					<td> </td>
					<td> <input type="text" name="nombre"> </td>
					<td> <input type="text" name="alta"> </td>
					<td> <input type="text" name="modificacion"> </td>
					<td>	 
						<select name="tipoCalidad">
							<option th:each="calidad: ${calidades}" th:value="${calidad}" th:text="${calidad.toString()}"></option>	
						</select> 
					</td>
					<td>
					 	<select name="unidad">
							<option th:each="medida: ${medidas}" th:value="${medida}" th:text="${medida.toString()}"></option>
						</select>
					</td>
					<td> <textarea name="observacion" rows="4" cols="20"></textarea> </td>
					<td> <input type="text" name="precio"></td>
					
					<td> <input type="submit" class="btn btn-success btn-xs" name="accion" value="Agregar"></td>
					
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
						<button class="btn btn-primary btn-xs" name="accion" value="Eliminar">
							<span class="glyphicon glyphicon-pencil"></span> <br><br>
						</button>
						<button class="btn btn-danger btn-xs" name="accion" value="Modificar">
							<span class="glyphicon glyphicon-trash"></span>
						</button>
					</td> 
				</tr>
			</tbody>
		</table>
	</form>
</div>	

	<!-- JavaScript -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
</body>
</html>