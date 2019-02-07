<!DOCTYPE html SYSTEM "http://www.thymeleaf.org/dtd/xhtml1-strict-thymeleaf-4.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
    <head>
        <title>Pantalla principal del usuario </title>
    </head>
    <body>
      <h3>detalles del usuario</h3>
      <table>
        <tr><td >Name</td><td th:text="${session.user.fullName }"></td></tr>
        <tr><td>Role</td><td th:text="${session.user.role }"></td></tr>
        <tr><td>Country</td><td th:text="${session.user.country }"></td></tr>
      </table>      
      <form action="@{appLogout}" method="POST">
        <input type="submit" value="Logout"/>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>		
      </form>      
    </body>
</html> 