<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 26.07.2020
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thrid</title>
</head>
<body>
<h1>Zadanie 3</h1>


<div>
wartosc a = ${empty param.a ? "empty" : param.a} <br>
wartosc b = ${empty param.b ? "empty" : param.b} <br>
</div>
<br>

wartosc a = ${param.get('a')} <br>
wartosc b = ${param.get('b')} <br>
<br>

wartosc a = ${param.a} <br>
wartosc b = ${param.b} <br>

</body>
</html>
