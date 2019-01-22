<html>
    <head>
        <title>Spring 4 Security Example</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" id="bootstrap-css" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.3.1.min.js"  crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"  crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/core-js/2.6.2/core.min.js"></script>
    	<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.13.1/bootstrap-table.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"  crossorigin="anonymous"></script>
    	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/login.css" type="text/css">
    </head>
    <body>


<!------ Include the above in your HEAD tag ---------->

<section class="login-block">
    <div class="container">
	<div class="row">
		<div class="col-md-4 login-sec">
		    <h2 class="text-center">Login Now</h2>
		     <font color="red">
 		   ${SPRING_SECURITY_LAST_EXCEPTION.message} 
         </font> 
  <form class="login-form" action="<%=request.getContextPath()%>/appLogin" method="POST">
	  <div class="form-group">
	    <label for="exampleInputEmail1" class="text-uppercase">Usuario</label>
	    <input type="text" class="form-control" placeholder="" name="app_username" >
	    
	  </div>
	  <div class="form-group">
	    <label for="exampleInputPassword1" class="text-uppercase">Password</label>
	    <input type="password" class="form-control" placeholder="" name="app_password">
	  </div>
	  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>	
	  
	    <div class="form-check">
	    <label class="form-check-label">
	      <input type="checkbox" class="form-check-input">
	      <small>Remember Me</small>
	    </label>
	    <button type="submit" class="btn btn-login float-right">Submit</button>
	  </div>
  
</form>
<div class="copy-text">Creado por Fabian piceno <i class="fa fa-heart"></i> by <a href="http://grafreez.com">fpiceno.com</a></div>
		</div>
		<div class="col-md-8 banner-sec">
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                 <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                  </ol>
            <div class="carousel-inner" role="listbox">
    <div class="carousel-item active">
<!--       <img class="d-block img-fluid"  src="resources/static/imagenes/puntoverde.jpg" alt="First slide"> -->
      <img class="d-block img-fluid"  src="<%=request.getContextPath()%>/resources/imagenes/puntoverde.jpg" alt="First slide">
      <div class="carousel-caption d-none d-md-block">
        <div class="banner-text">
<!--             <h2>This is Heaven</h2> -->
<!--             <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation</p> -->
        </div>	
  </div>
    </div>
    <div class="carousel-item">
      <img class="d-block img-fluid" src="https://images.pexels.com/photos/7097/people-coffee-tea-meeting.jpg" alt="First slide">
      <div class="carousel-caption d-none d-md-block">
        <div class="banner-text">
<!--             <h2>This is Heaven</h2> -->
<!--             <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation</p> -->
        </div>	
    </div>
    </div>

            </div>	   
		    
		</div>
	</div>
</div>
</section>


<!-- <html> -->
<!--     <head> -->
<!--         <title>Spring 4 Security Example</title> -->
<!--     </head> -->
<!--     <body> -->
<!--        <h3>Spring 4 Security Example</h3> -->
<!--         <font color="red"> -->
<!-- 		   ${SPRING_SECURITY_LAST_EXCEPTION.message} -->
<!--         </font> -->
<!-- 		<form action="<%//=request.getContextPath()%>/appLogin" method="POST"> -->
<!-- 			Enter UserName:	<input type="text" name="app_username"/><br/><br/> -->
<!-- 			Enter Password: <input type="password" name="app_password"/> <br/><br/>			 -->
<!-- 			<input type="submit" value="Login"/> -->
<!-- 			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>			 -->
<!-- 		</form> -->
<!--     <body> -->
<!-- </html>   -->
</body>
</html>