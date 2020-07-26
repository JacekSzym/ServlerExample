<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <title>Pierwszy projekt</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

<h1 class="title">Test dla JSP</h1>


<div class="formula12">
    <form   method="post"  action="mvc14">
       TEKST: <input type="text" name = "title"> <br/>
       AUTOR: <input type="text" name = "author"> <br/>
       ISBN: <input type="text" name = "isbn"> <br/>
        <button type="submit" name="enter">enter</button>
    </form>
</div>

<div>
    Ostatio wprowadzona ksiązka <br/>
Tytuł:    ${book.title} <br/>
autor:    ${book.author} <br/>
isbn:    ${book.isbn} <br/>


</div>


</body>
</html>