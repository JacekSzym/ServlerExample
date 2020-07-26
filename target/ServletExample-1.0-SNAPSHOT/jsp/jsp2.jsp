<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Pierwszy projekt</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

<h1 class="title">Test dla JSP</h1>


<div>

START = ${start}
END = ${end} <br/>

<c:forEach begin="${start}" end="${end}" var="i">
${i} <br/>
</c:forEach>


</div>


</body>
</html>