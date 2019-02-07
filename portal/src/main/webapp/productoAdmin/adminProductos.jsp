
<!doctype html>
<html lang="es">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
	<title>Administracion de Productos</title>
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.13.1/bootstrap-table.min.css">
    
    
		<!-- Latest compiled and minified JavaScript -->
<!-- 	<link  type="text/css" rel="stylesheet" th:href="@{/resources/css/Layaout.css}"> -->
</head>
<body>

<!-- 			ventana modal para agregar -->
     <div class="modal fade" id="addventanaModal" tabindex="-1" role="dialog" aria-labelledby="etiquetaVentanaModal" aria-hidden="true">
            <form th:action="@{addProducto}" method="POST">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="etiquetaVentanaModal">Agregar Productos</h5>       
                        <button class="close" data-dismiss="modal" aria-label="Cerrar">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
            <div class="form-group">
                <label for="idItemEdit">Agregar productos: </label>
                <input type="text" id="idItemAdd" name="nombre" placeholder="Nombre del Producto" class="form-control" required="required"><br>
<!--                 <small class="form-text text-muted">Nombre de usuario del usuario</small> -->
                <label for="tipoCalidadAdd">Tipo Calidad: </label>

				<select name="tipoCalidad" id="tipoCalidadAdd">
					<option th:each="calidad: ${calidades}" th:value="${calidad}" th:text="${calidad.toString()}"></option>	
				</select> <br>
				     <label for="tipoProductoAdd">Tipo Producto: </label>
				<select name="tipoProducto" id="tipoProductoAdd">
					<option th:each="tipo: ${tipos}" th:value="${tipo}" th:text="${tipo.toString()}"></option>	
				</select> <br>
				   <label for="unidadAdd">Unidad: </label>
				<select name="unidad" id="unidadAdd" >
								<option th:each="medida: ${medidas}" th:value="${medida}" th:text="${medida.toString()}"></option>
				</select><br>
					   <label for="observacionesAdd">Observaciones: </label>
				<textarea name="observacion" rows="4" cols="20"  id="observacionesAdd"></textarea> <br>
				<label >Precio </label>
				<input type="text" name="precio"><br>
            </div>
                    </div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button"  data-dismiss="modal"  >
                            Cerrar
                        </button>
                         <button type="submit" class="btn btn-primary">Crear</button>
                    </div>
                </div>
            </div>
             </form>
        </div>
        
        

<!--    					Ventana modal para eliminar -->
          <div class="modal fade" id="deleteventanaModal" tabindex="-1" role="dialog" aria-labelledby="etiquetaVentanaModal" aria-hidden="true">
            <form th:action="@{deleteProducto}"  method="post">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="etiquetaVentanaModal">Eliminar Producto</h5>       
                        <button class="close" data-dismiss="modal" aria-label="Cerrar">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    
                    <div class="modal-body">
            <div class="form-group">
                <label for="idItemEdit">id: </label>
                <input type="text" id="idItemdelete" name="id" placeholder="Id Producto" class="form-control" required="required" readonly="readonly">
<!--                 <small class="form-text text-muted">Nombre de usuario del usuario</small> -->
                <label for="txtNombre">Item: </label>
                <input type="text" id="txtItemDelete" name="nombre" placeholder="Nombre del Producto" class="form-control"  readonly="readonly">
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
            <form th:action="@{editProducto}" method="POST">
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
                <input type="hidden" id="fechaAltaEdit" name="fechaAltaEdit">
                <label for="idItemEdit">id: </label>
                <input type="text" id="idItemEdit" name="id" placeholder="Id articulo" class="form-control" required="required">
<!--                 <small class="form-text text-muted">Nombre de usuario del usuario</small> -->
                <label for="txtNombre">Nombre Producto: </label>
                <input type="text" id="txtItemEdit" name="nombreEdit" placeholder="Nombre del Articulo" class="form-control" required="required">
<!--                 <small class="form-text text-muted">Nombre de usuario del usuario</small> -->
 				<label for="tipoCalidadEdit">Tipo Calidad: </label>

				<select name="tipoCalidadEdit" id="tipoCalidadEdit">
					<option th:each="calidad: ${calidades}" th:value="${calidad}" th:text="${calidad.toString()}"></option>	
				</select> <br>
				     <label for="tipoProductoEdit">Tipo Producto: </label>
				<select name="tipoProductoEdit" id="tipoProductoEdit">
					<option th:each="tipo: ${tipos}" th:value="${tipo}" th:text="${tipo.toString()}"></option>	
				</select> <br>
				   <label for="unidadEdit">Unidad: </label>
				<select name="unidadEdit" id="unidadEdit" >
								<option th:each="medida: ${medidas}" th:value="${medida}" th:text="${medida.toString()}"></option>
				</select><br>
					   <label for="observacionesEdit">Observaciones: </label>
				<textarea name="observacionEdit" rows="4" cols="20"  id="observacionesEdit"></textarea> <br>
				<label >Precio </label>
				<input type="text" name="precioEdit" id="precioEdit"><br>
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
	
	  <button class="btn btn-info text-white" type="button" data-toggle="modal" data-target="#addventanaModal" th:id="addProducto" > 
        	<i class="far fa-save"></i>
        	</button>
      <table class="table table-bordered table-striped table-hovered" id="tablaItems" 
        	data-show-refresh="true"
       		data-show-toggle="true"
       		data-show-columns="true" 
      		data-toolbar="#toolbar"
            data-toggle="table">
            
            <thead class="bg-primary text-white">
             <tr>
	             <th data-field="state" data-checkbox="true"></th>
				 <th data-field="id" class="text-center" >Id</th>
				 <th data-field="Producto" class="text-center" th:text="Producto"></th>
	             <th data-field="Alta" class="text-center" th:text="Alta" data-visible="false"></th>
				 <th data-field="Ultima modificacion" class="text-center" data-visible="false" >Ultima modificacion</th>
				 <th data-field="TipoCalidad" class="text-center">Tipo Calidad</th>
				 <th data-field="Unidad" class="text-center" th:text="Unidad"> </th>
				 <th data-field="TipoProducto" class="text-center" >Tipo Producto </th>
				 <th data-field="Observacion" class="text-center" th:text="Observacion"></th>
				 <th data-field="Precio" class="text-center" th:text="Precio"> </th>
				 <th data-field="Acciones " class="text-center" th:text="Acciones"> </th>
			</tr>
            </thead>
            <tbody>
                  
            
		 	<tr th:each="producto: ${productos.pageList}">
	        <td class="bs-checkbox" ><input th:attr="data-index=${producto.id-1 }" name="btSelectItem" type="checkbox"></td>
	        <td class="text-center" th:text="${producto.id }"></td>
	        <td class="text-center" th:text="${producto.nombre}"></td>
		    <td class="text-center" th:text="${producto.fechaAlta}"></td>
	        <td class="text-center" th:text="${producto.fechaModificacion}"></td>
<!-- 	        <td class="text-center" th:text="${producto.tipoCalidad}"></td> -->
        	<td class="text-center" th:text="${producto.tipoCalidad}" >	 
<!-- 				<select name="tipoCalidad"> -->
<!-- 					<option th:each="calidad: ${calidades}" th:value="${calidad}" th:text="${calidad.toString()}" th:selected="${calidad.toString() == ${producto.tipoCalidad}"  ></option>	 -->
<!-- 				</select>  -->
			</td>
			<td class="text-center" th:text="${producto.unidad}">
<!-- 			 	<select name="unidad"> -->
<!-- 					<option th:each="medida: ${medidas}" th:value="${medida}" th:text="${medida.toString()}"></option> -->
<!-- 				</select> -->
			</td>
			<td class="text-center" th:text="${producto.tipoProducto}">
<!-- 			 	<select name="tipos"> -->
<!-- 					<option th:each="tipo: ${tipos}" th:value="${tipo}" th:text="${tipo.toString()}"></option> -->
<!-- 				</select> -->
			</td>
	        <td class="text-center" th:text="${producto.observaciones}"></td>
	        <td class="text-center" th:text="${producto.precio}"></td>
	        <td class="text-center">
	        
	        <button class="btn btn-info text-white" type="button" data-toggle="modal" data-target="#editventanaModal" th:id="'edit'+ ${producto.id}" > 
				<i class="fas fa-pencil-alt"  ></i>
        	</button>
	        <button class="btn btn-danger text-white" type="button" data-toggle="modal" data-target="#deleteventanaModal" th:id="'delete'+ ${producto.id}"> 
                	<i class="fas fa-trash-alt"   ></i>
        	</button>
            </td>
	        </tr>
	  
 
            </tbody>
        </table>
        <div>
        <span th:if="${productos.firstPage}== true ">Prev</span>
        <a  th:unless="${productos.firstPage} == false" href="#" th:href="@{/productos/principal/1}"></a>
       
        
<!--         <span th:text="${productos.page +1 } "></span> -->
<!--         <span  th:each="producto: ${productos.pageList}"> -->
<!--         <span th:text="${productoStat.index }"></span> -->
<!--         <span th:if="${(productos.page + 1) == productoStat.index}" th:text="${productoStat.index }"></span> -->
<!--         <a  th:unless="${(productos.page + 1) ==  productoStat.index} == false" href="#" th:href="@{/productos/principal/productoStat.index}" th:text="${ productoStat.index }"></a> -->
<!--         </span> -->
      
        </div>
        
<!--         <div th:switch="${productos.firstPage}" th:text=${productos.firstPage }> -->
<!--         <span th:case="true">Prev</span> -->
<!--   		<p th:case="false"><a href="#" th:href="@{/principal}">Prev</a></p> -->
<!--         </div> -->
		
		
	</div>
	   <!-- jQuery first, then Popper.js, then Bootstrap JS, and then Bootstrap Table JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/core-js/2.6.2/core.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.13.1/bootstrap-table.min.js"></script>
	<script type="text/javascript" th:src="@{/resources/js/adminProductos.js}"></script>
		  
</body>
</html>