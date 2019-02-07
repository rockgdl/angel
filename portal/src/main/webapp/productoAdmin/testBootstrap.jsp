<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org" xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity4" >
<head>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" media="screen"/>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" th:fragment="header">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Punto Verde</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li th:classappend="${module == 'home' ? 'active' : ''}">
                    <a href="#" th:href="@{/}">Home</a>
                </li>
                <li th:classappend="${module == 'tasks' ? 'active' : ''}">
                    <a href="#" th:href="@{/productos/principal/1}">Pedidos</a>
                </li>
                <li th:classappend="${module == 'tasks-ld' ? 'active' : ''}">
                    <a href="#" th:href="@{/task-ld}">Tasks (Layout Dialect)</a>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
<!--                 <li th:if="${#authorization.expression('!isAuthenticated()')}"> -->
                <li sec:authorize="isAuthenticated()==false">

                    <a href="/signin" th:href="@{/customLogin.jsp}">
                        <span class="glyphicon glyphicon-log-in" aria-hidden="true"></span>&nbsp;Sign in
                    </a>
                </li>
<!--                 <li th:if="${#authorization.expression('isAuthenticated()')}"> -->
                <li sec:authorize="isAuthenticated()">
                
                    <form  id="form" method="post" action="#" th:action="@{/logout}">
                        <a href="/logout" th:href="@{/logout}" onclick="$('#form').submit();">
                        <span class="glyphicon glyphicon-log-out" aria-hidden="true"></span>&nbsp;Logout
                    </a>
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>		
                    </form>
                </li>
            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
</nav>


  <h3>detalles del usuario</h3>
      <table>
        <tr><td >Name</td><td th:text="${session.user.fullName }"></td></tr>
        <tr><td>Role</td><td th:text="${session.user.role }"></td></tr>
        <tr><td>Country</td><td th:text="${session.user.country }"></td></tr>
      </table>      
</body>
</html>