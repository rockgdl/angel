<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	
	<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.13.1/bootstrap-table.min.css">


</head>
<body>

<!-- 			ventana modal para agregar Usuarios -->
     <div class="modal fade" id="agregarUsuario" tabindex="-1" role="dialog" aria-labelledby="etiquetaVentanaModal" aria-hidden="true">
            <form th:action="@{createUser}" method="POST">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="etiquetaVentanaModal">Agregar Usuarios</h5>       
                        <button class="close" data-dismiss="modal" aria-label="Cerrar">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
            <div class="form-group">
   				
				<input type="text" name="nombreUser" class="form-control" placeholder="Nombre de usuario">
				<br>
				<input type="password" name="contrasena" class="form-control" placeholder="Contraseña">
				<br>
				<input type="text" name="nombre" class="form-control" placeholder="Nombre(s)">
				<br>
				<input type="text" name="apellido" class="form-control" placeholder="Apellidos">
				<br>
				<input type="text" name="pais" class="form-control" placeholder="País">
				<br>
				<label>¿Activo?</label>
				<select name="activo" class="form-control">
					<option value="1">Si
					<option value="0">NO
				</select>
				<br>
				<label>Role:</label>
				<select name="role" class="form-control">
					<option value="ROLE_USER">Usuario
					<option value="ROLE_ADMIN">Administrador
				</select>
            </div>
                    </div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button"  data-dismiss="modal"  >
                            Cerrar
                        </button>
                         <button type="submit" class="btn btn-primary">Agregar</button>
                    </div>
                </div>
            </div>
             </form>
        </div>
        

<!-- 			ventana modal para Actualizar Usuarios -->
     <div class="modal fade" id="actualizarUsuario" tabindex="-1" role="dialog" aria-labelledby="etiquetaVentanaModal" aria-hidden="true">
            <form th:action="@{update}" method="POST">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="etiquetaVentanaModal">Actualiza Usuarios</h5>       
                        <button class="close" data-dismiss="modal" aria-label="Cerrar">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
            <div class="form-group">
   				
				<input type="text" name="nombreUser" class="form-control" placeholder="Nombre de usuario a modificar">
				<br>
				<input type="password" name="contrasena" class="form-control" placeholder="Contraseña">
				<br>
				<input type="text" name="nombre" class="form-control" placeholder="Nombre(s)">
				<br>
				<input type="text" name="apellido" class="form-control" placeholder="Apellidos">
				<br>
				<input type="text" name="pais" class="form-control" placeholder="País">
				<br>
				<label>¿Activo?</label>
				<select name="activo" class="form-control">
					<option value="1">Si
					<option value="0">NO
				</select>
				<br>
				<label>Role:</label>
				<select name="role" class="form-control">
					<option value="ROLE_USER">Usuario
					<option value="ROLE_ADMIN">Administrador
				</select>
            </div>
                    </div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button"  data-dismiss="modal"  >
                            Cerrar
                        </button>
                         <button type="submit" class="btn btn-primary">Actualizar</button>
                    </div>
                </div>
            </div>
             </form>
        </div>
        
        
        <!-- Botones para los popups -->
    	<button class="btn btn-info text-white" type="button" data-toggle="modal" data-target="#agregarUsuario" th:id="addButton" > 
				<i class="fas fa-save"> Agregar</i>
     	</button>
     	
     	<button class="btn btn-info text-white" type="button" data-toggle="modal" data-target="#actualizarUsuario" th:id="updateButton" > 
				<i class="fas fa-edit"> Actualizar</i>
     	</button>
        
    	<!-- Tabla de usuarios -->    
		<table class="table table-light" style="width:auto;" id="tableUsers">
			<thead class="thead-dark">
				<tr>
					<th>Usuario </th>
					<th>Nombre </th>
					<th>Contraseña </th>
					<th>Role </th>
					<th>Pais </th>
					<th></th>
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
							<button type="button" class="btn btn-danger" value="Eliminar">
								<i class="fa fa-trash"></i>
							</button>				
						</form>
					</td>
				</tr>
			</tbody>
		</table>

<!-- jQuery first, then Popper.js, then Bootstrap JS, and then Bootstrap Table JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/core-js/2.6.2/core.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.13.1/bootstrap-table.min.js"></script>
	<script type="text/javascript" th:src="@{/resources/js/adminProductos.js}"></script>
</body>
</html>