<html>
    <head>
        <title>Spring 4 Security Example</title>
    </head>
    <body>
      <h3>No tienes permiso de entrar aqui</h3>
      <form th:action="@{/appLogout}" method="POST">
        <input type="submit" value="Cerrar Session"/>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>		
      </form> 
    </body>
</html> 