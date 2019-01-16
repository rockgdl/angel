<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	
	<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.12.1/bootstrap-table.min.css">

	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
    crossorigin="anonymous"></script>

</head>
<body>
		<table class="table table-dark table-bordered">
			<thead class="thead-light">
				<tr>
					<th>Usuario </th>
					<th>Nombre </th>
					<th>Contraseña </th>
					<th>Role </th>
					<th>Pais </th>
				</tr>
			</thead>
			
			<tbody>
				<tr th:each="usuario: ${usuarios} ">
					<td th:text="${usuario.username}"> </td>
					<td th:text="${usuario.fullName}"> </td>
					<td th:text="${usuario.password}"> </td>
					<td th:text="${usuario.role}"> </td>
					<td th:text="${usuario.country}"> </td>
					<td>
						<form th:action="@{eliminar}" th:method="POST">
							<input type="hidden" th:value="${usuario.username}" th:name="user">
							<input type="submit" value="Eliminar">				
						</form>
					</td>
				</tr>
			</tbody>
		</table>

</body>
</html>