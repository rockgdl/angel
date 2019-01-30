<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Punto Verde</title>
	
	<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.13.1/bootstrap-table.min.css">
	<link rel="stylesheet" th:href="@{/resources/css/sb-admin.css}">
	<link rel="stylesheet" th:href="@{/resources/css/sb-admin.min.css}">
	
	
	
</head>
<body>

	<nav class=" navbar navbar-expand-lg navbar-dark bg-dark" >
	<img alt="Logo" th:src="@{/resources/imagenes/puntoverde.jpg}" style="width:5%; light:5%;" class="img-fluid rounded-circle img-thumbnail">
		<div class="container">
			<div class="collapse navbar-collapse">
				<ul class="navbar-nav">
					<li class="nav-link"> 1 </li>
					<li class="nav-link"> 2 </li>
					<li class="nav-link"> 3 </li>
					<li class="nav-item dropdown no-arrow show pull-right">
						<a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			            <i class="fas fa-user-circle fa-fw"></i>
			              </a>
			              <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
			                <a class="dropdown-item" href="#">Login</a>
			                <a class="dropdown-item" href="#">Register</a>
			              </div>
			    	</li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- fin de navbar -->
    
    <div id="wrapper">
         <!-- Sidebar -->
	      <ul class="sidebar navbar-nav navbar-dark lg-dark">
	          <li class="nav-item">
	              <a class="nav-link" th:href="@{/userCRUD/mostrar}">
	              	<i class="fa fa-users"> </i>
	                  <span>Usuarios</span>
	              </a>
	          </li>
	
	        <li class="nav-item active">
	          <a class="nav-link" th:href="@{/productos/principal}">    
	            <i class="fas fa-fw fa-chart-area"></i>
	            <span>Producto</span>
	          </a>
	        </li>
	
	        <!--  <li class="nav-item">
	          <a class="nav-link" th:href="">    
	            <span>Esto solo esta de adorno xD</span>
	          </a>
	        </li> -->
	        
	      </ul>
	      <!-- fin de sidebar -->
	      
	      <div id="content-wrapper">
	       
	       <div class="container-fluid">
	       		<p>Informacion</p>	
	       </div>
	      		
	      </div>
      </div>
        
	
	
	<!-- jQuery first, then Popper.js, then Bootstrap JS, and then Bootstrap Table JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/core-js/2.6.2/core.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.13.1/bootstrap-table.min.js"></script>
	<script type="text/javascript" th:src="@{/resources/js/adminProductos.js}"></script>
	
		<!-- Bootstrap core JavaScript-->
    <script src="@{/resources/vendor/jquery/jquery.min.js}"></script>
    <script src="@{/resources/vendor/bootstrap/js/bootstrap.bundle.min.js}"></script>

    <!-- Core plugin JavaScript-->
    <script src="@{/resources/vendor/jquery-easing/jquery.easing.min.js}"></script>

    <!-- Page level plugin JavaScript-->
    <script src="@{/resources/vendor/chart.js/Chart.min.js}"></script>
    <script src="@{/resources/vendor/datatables/jquery.dataTables.js}"></script>
    <script src="@{/resources/vendor/datatables/dataTables.bootstrap4.js}"></script>

    <!-- Custom scripts for all pages-->
    <script src="@{/resources/js/sb-admin.min.js}"></script>

    <!-- Demo scripts for this page-->
    <script src="@{/resources/js/demo/datatables-demo.js}"></script>
    <script src="@{/resources/js/demo/chart-area-demo.js}"></script>
</body>
</html>