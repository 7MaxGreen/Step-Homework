<%--
  Created by IntelliJ IDEA.
  User: madsm
  Date: 07/04/2022
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        <%@ include file="style/delete.css" %>
    </style>
    <title>Please confirm</title>
    <h1>|Delete employee</h1>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<div class="container">

    <h3> Are you sure you want to </h3> <h2> Delete </h2> <h3>${requestScope.employee.firstName} ?</h3>
<form method="post">

    <a style="border: 1px solid black" class="btn btn-dark" href="list">Back</a>
    <button button class="btn btn-info" type="submit">Confirm</button>


</form>
</div>
</body>
</html>
