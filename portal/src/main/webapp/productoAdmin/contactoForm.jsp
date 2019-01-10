<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.12.1/bootstrap-table.min.css">
	
</head>
<body>

	<!-- formulario de contacto -->
	<div class="col-md-6 mt-md-0 mt-3">
		<div align="left" class="form-group col-xs-4">
			<h3>Mandanos un correo:</h3>
							
			<form th:action="@{Enviar}" method="POST">
				<input type="hidden" name="remitente" value="fruteria.verde@outlook.com">
				
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<div class="input-group-text">
							<span class="fa fa-phone"></span>
						</div>		
					</div>
					<input type="text" name="telefono" placeholder="Tel:" class="form-control" size="30" id="tel-ghc"> <br>
				</div>
									
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<div class="input-group-text">
							<span class="fa fa-users"></span>
						</div>		
					</div>
					<input type="email" name="destinatario" placeholder="Correo" class="form-control" size="30" id="user-sdfg"> <br>
				</div>
									
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<div class="input-group-text">
							<span class="fa fa-pencil"></span>
						</div>	
					</div>
					<input type="text" name="asunto" placeholder="Asunto" class="form-control" size="30" id="asunto-asd"> <br>
				</div>
								
				<div class="input-group mb-3">
					<div class="input-group-prepend">
						<div class="input-group-text">
							<span class=" fa fa-envelope" role="presentation" data-input="mail-wer"></span>
						</div>
					</div>
					<textarea name="mensaje" rows="10" cols="100" placeholder="Mensaje" class="form-control" id="mail-wer"></textarea>
				</div>
				
				<button type="submit" class="btn-danger"><span class="fa fa-paper-plane"> Enviar</span> </button>

				
			</form>
		</div>
	</div>	
	<!-- formulario de contacto -->
				
	<!-- JavaScript -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Latest compiled and minified JavaScript -->
	 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
 </body>
</body>
</html>