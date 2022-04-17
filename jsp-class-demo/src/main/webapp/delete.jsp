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
        body {
            background-image: url("https://images.pexels.com/photos/3184360/pexels-photo-3184360.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
            background-repeat: no-repeat;
            background-size: cover;
            background-position: center;
        }

        .container{
            margin-top: 11%;
        }

        h2{
            color: darkgoldenrod;
        }

        a:hover {
            /*cursor: pointer;*/
            /*border: 2px solid white;*/
            /*border-radius: 5px;*/
            text-decoration-color: darkgoldenrod;
        }


    </style>
    <title>Please confirm</title>
    <h1 style="color: aliceblue">|Delete employee</h1>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<div class="container">

    <h3> Are you sure you want to </h3> <h2> Delete </h2> <h3>${requestScope.employee.firstName} ?</h3>
<form method="post">


    <button button class="btn btn-info" type="submit">Confirm</button>
    <a style="color:black; font-weight: bold" href="${pageContext.request.contextPath}/">Back to Employee List</a>
</form>
</div>
</body>
</html>
