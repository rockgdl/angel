
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
   <th:block th:each="producto : ${productos}">
      <tr>
         <td th:text="${producto.nombre}">...</td>
         <td th:text="${producto.observaciones}">...</td>
      </tr>
      <tr>
         <td colspan="2" th:text="${producto.fechaAlta}">...</td>
      </tr>
   </th:block>
</table>
  <p th:text="'La fecha es: ' + ${fecha}" />
        
</body>
</html>