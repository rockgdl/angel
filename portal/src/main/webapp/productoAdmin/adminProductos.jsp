
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
	<title>Insert title here</title>

	
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script defer src="https://use.fontawesome.com/releases/v5.0.9/js/all.js" integrity="sha384-8iPTk2s/jMVj81dnzb/iFR2sdA7u06vHJyyLlAd4snFpCl/SnyUjRrbdJsw1pGIl" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.12.1/bootstrap-table.min.css">
    
      <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
    crossorigin="anonymous">
      </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
    crossorigin="anonymous">
    </script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
    crossorigin="anonymous"></script>
	
	<link  type="text/css" rel="stylesheet" th:href="@{/resources/css/Layaout.css}">
	<script type="text/javascript" th:src="@{/resources/js/adminProductos.js}"></script>
	
	

	
</head>

<body>

<!--    					Ventana modal para eliminar -->
          <div class="modal fade" id="deleteventanaModal" tabindex="-1" role="dialog" aria-labelledby="etiquetaVentanaModal" aria-hidden="true">
            <form th:action="@{productos/deleteProducto}" >
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="etiquetaVentanaModal">Eliminar Tipo Prestamo</h5>       
                        <button class="close" data-dismiss="modal" aria-label="Cerrar">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
            <div class="form-group">
                <label for="idItemEdit">id: </label>
                <input type="text" id="idItemdelete" name="id" placeholder="Id articulo" class="form-control" required="required" readonly="readonly">
<!--                 <small class="form-text text-muted">Nombre de usuario del usuario</small> -->
                <label for="txtNombre">Item: </label>
                <input type="text" id="txtItemDelete" name="txtItem" placeholder="Nombre del Item" class="form-control"  readonly="readonly">
<!--                 <small class="form-text text-muted">Nombre de usuario del usuario</small> -->
            </div>
                    </div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button"  data-dismiss="modal"  >
                            Cerrar
                        </button>
                         <button type="submit" class="btn btn-primary">Delete</button>
                    </div>
                </div>
            </div>
             </form>
        </div>

<!-- 			ventana modal para editar -->
     <div class="modal fade" id="editventanaModal" tabindex="-1" role="dialog" aria-labelledby="etiquetaVentanaModal" aria-hidden="true">
            <form th:action="@{productos/editProducto}" method="POST">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="etiquetaVentanaModal">Actualizar Tipo Prestamo</h5>       
                        <button class="close" data-dismiss="modal" aria-label="Cerrar">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
            <div class="form-group">
                <label for="idItemEdit">id: </label>
                <input type="text" id="idItemEdit" name="idItemEdit" placeholder="Id articulo" class="form-control" required="required">
<!--                 <small class="form-text text-muted">Nombre de usuario del usuario</small> -->
                <label for="txtNombre">Item: </label>
                <input type="text" id="txtItemEdit" name="txtItem" placeholder="Nombre del Articulo" class="form-control" required="required">
<!--                 <small class="form-text text-muted">Nombre de usuario del usuario</small> -->
            </div>
                    </div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button"  data-dismiss="modal"  >
                            Cerrar
                        </button>
                         <button type="submit" class="btn btn-primary">Update</button>
                    </div>
                </div>
            </div>
             </form>
        </div>

<!-- 	<div align="center"> -->
<!-- 			<img src="https://dm2301files.storage.live.com/y4mBeoL_Om45HT9R7LQTQCXYb3dB3EB6MK55OjLU_AZsugCVJa_rIRdbl9CFOJPJv4gDVS9hq4hqUgP8h_4asXEZyOMmWlaOyYr-BWwd5HX5bCOEC-ZhAZgjUlHJTKuhvW83FiHy45Z2SumPoam1BYA3Syh9oGTlceVop9NtEHeG4bFQO0y2w7VVY2JgVG9bAYyscdHDSi7pNax6qjedU7arw/punto%20verde%201%20-%20web-01.jpg?psid=1&width=596&height=564" -->
<!-- 				width="1000" height="300">  -->
<!-- 	</div> -->
	
	<div>
	
	
	      <table class="table table-bordered table-striped table-hovered" id="tablaItems" data-show-refresh="true"	data-show-toggle="true"	data-show-columns="true" 
      		data-toolbar="#toolbar"
            data-toggle="table">
            <thead class="bg-primary text-white">
             <tr>
			 <th data-field="id" class="text-center"> ID </th>
			 <th data-field="Producto" class="text-center"> Producto </th>
             <th data-field="Alta" class="text-center"> Alta </th>
			 <th data-field="Ultima modificacion" class="text-center"> Ultima modificiación </th>
			 <th data-field="Tipo Calidad" class="text-center"> Tipo Calidad</th>
			 <th data-field="Unidad" class="text-center"> Unidad </th>
			 <th data-field="Observacion" class="text-center"> Observación </th>
			 <th data-field="Precio " class="text-center"> Precio</th>
			 <th data-field="Acciones " class="text-center"> Acciones</th>
						
					</tr>
            </thead>
            <tbody>
		 	<tr th:each="producto: ${productos}">
	        <td class="bs-checkbox" ><input data-index="${producto.id }" name="btSelectItem" type="checkbox"></td>
	        <td class="text-center" th:text="${producto.id }"></td>
	        <td class="text-center" th:text="${producto.nombre}"></td>
	        <td class="text-center" th:text="${producto.fechaAlta}"></td>
	        <td class="text-center" th:text="${producto.fechaModificacion}"></td>
        	<td class="text-center" >	 
				<select name="tipoCalidad">
					<option th:each="calidad: ${calidades}" th:value="${calidad}" th:text="${calidad.toString()}"></option>	
				</select> 
			</td>
			<td class="text-center">
			 	<select name="unidad">
					<option th:each="medida: ${medidas}" th:value="${medida}" th:text="${medida.toString()}"></option>
				</select>
			</td>
	        <td class="text-center" th:text="${producto.observaciones}"></td>
	        <td class="text-center" th:text="${producto.precio}"></td>
	        <td class="text-center">
	        
	        <button class="btn btn-info text-white" type="button" data-toggle="modal" data-target="#editventanaModal"> 
				<i class="fas fa-pencil-alt" ></i>
        	</button>
	        <button class="btn btn-danger text-white" type="button" data-toggle="modal" data-target="#deleteventanaModal"> 
                	<i class="fas fa-trash-alt" th:id="'eliminar'+ ${producto.id}"  ></i>
        	</button>

<%--                 <a href="#deleteventanaModal" class="btn btn-danger text-white" title="Eliminar" th:id="'delete' + ${producto.id}" > --%>
<%--                 	<i class="fas fa-trash-alt" th:id="'eliminar'+ ${producto.id}"  ></i> --%>
<!--                  </a> -->
            </td>
	        </tr>
	  
 
            </tbody>
        </table>
		
		<form th:action="@{addProducto}" method="POST">
			<table align="center" class="table table-striped">
				<thead>
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
				
				<tbody align="center" class="green">		
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
							<button class="btn btn-primary btn-xs" name="accion" value="Modificar" title="Editar">
								<span class="glyphicon glyphicon-pencil"></span> 
							</button>
							<button data-toggle="modal" data-target="#exampleModal" class="btn btn-danger btn-xs" name="accion" value="Eliminar" title="Eliminar">
								<span class="glyphicon glyphicon-trash"></span>
							</button>
						</td> 
					</tr>
				</tbody>
			</table>
		</form>
	</div>
		
	<div>
		<footer>
			<p>Tel: 3646 3815</p>
			<p>Whatssap: 3332018942</p>
			<a>fruteria.verde@outlook.com</a>
		</footer>
	</div>
	
		<!-- JavaScript -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<!-- Latest compiled and minified JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
</body>
</html>