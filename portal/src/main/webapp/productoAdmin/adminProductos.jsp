
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
	<title>Administracion de Productos</title>
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script defer src="https://use.fontawesome.com/releases/v5.0.9/js/all.js" integrity="sha384-8iPTk2s/jMVj81dnzb/iFR2sdA7u06vHJyyLlAd4snFpCl/SnyUjRrbdJsw1pGIl" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.12.1/bootstrap-table.min.css">


    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.js" >
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

   <main class="container">


	
	<div>
	
      <table class="table table-bordered table-striped table-hovered" id="tablaItems" data-show-refresh="true"	data-show-toggle="true"	data-show-columns="true" 
      		data-toolbar="#toolbar"
            data-toggle="table">
            <thead class="bg-primary text-white">
             <tr>
             <th data-field="state" data-checkbox="true"></th>
			 <th data-field="id" class="text-center">#</th>
			 <th data-field="Producto" class="text-center"> Producto </th>
             <th data-field="Alta" class="text-center"> Alta </th>
			 <th data-field="Ultima modificacion" class="text-center"> Ultima modificiaci�n </th>
			 <th data-field="Tipo Calidad" class="text-center"> Tipo Calidad</th>
			 <th data-field="Unidad" class="text-center"> Unidad </th>
			 <th data-field="Observacion" class="text-center"> Observaci�n </th>
			 <th data-field="Precio " class="text-center"> Precio</th>
			 <th data-field="Acciones " class="text-center"> Acciones</th>
						
					</tr>
            </thead>
            <tbody>
            	<form th:action="@{addProducto}" method="POST">
            			<tr>
						<th data-field="state" data-checkbox="true"></th>
						<th data-field="id" class="text-center">#</th>
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
					</form>
			<th:block th:each="producto: ${productos}">
		 	<tr >
	        <td class="bs-checkbox" ><input th:attr="data-index=${producto.id }" name="btSelectItem" type="checkbox"></td>
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
            </td>
	        </tr>
	        </th:block>
	  
 
            </tbody>
        </table>
	</div>
		</main>
	<div>
			<p>Tel: 3646 3815</p>
			<p>Whatssap: 3332018942</p>
			<a>fruteria.verde@outlook.com</a>
	</div>
	
		  
</body>
</html>