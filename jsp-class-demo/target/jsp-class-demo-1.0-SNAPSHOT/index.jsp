<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        body, html {
            height: 100%;
        }

        body {
            background-image: url("https://images.pexels.com/photos/6191857/pexels-photo-6191857.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
            background-repeat: no-repeat;
            background-size: cover;
            background-position: center;
            height: 100%;
        }

        .container{
            margin-top: 15px;
        }

        a:hover {
            cursor: pointer;
            text-decoration-color: aqua;
        }

    </style>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
<h1>|Manage your employees
</h1>
<br/>
<ul>
    <li><a href="list" class="link-info">Employees list</a></li>
    <li><a href="add" class="link-info">Add Employee</a></li>
    <li><a href="contact" class="link-info">Contact info</a></li>
</ul>
</div>
</body>
</html>