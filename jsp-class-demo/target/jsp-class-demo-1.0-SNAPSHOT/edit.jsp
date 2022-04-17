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

        input {
            width: 250px;
            border: 2px solid whitesmoke;
            padding: 0;
            margin: 0;
            height: 22px;
            -moz-box-sizing: border-box;
            -webkit-box-sizing: border-box;
            box-sizing: border-box;
            text-indent: 3px;
        }

        label {
            color: black;
        }

        a:hover {
            cursor: pointer;
            border: 2px solid white;
            border-radius: 5px;
            text-decoration-color: aqua;
        }


    </style>
    <title>Edit employee</title>
    <h1 style="color: aliceblue">|Edit employee</h1>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">

<form method="post" style="color: black; font-weight: bold" >
    <input type="hidden" name="hiddenId" value="${requestScope.id}"/>
    <label for="firstName"> Firstname &nbsp&nbsp</label>
    <input id="firstName" type="text" name="firstName" value="${requestScope.employee.firstName}"/>
    <br>
    <br>
    <label for="lastName"> Lastname &nbsp&nbsp&nbsp</label>
    <input id="lastName" type="text" name="lastName" value="${requestScope.employee.lastName}"/>
    <br>
    <br>
    <label for="birthdate"> Birthdate &nbsp&nbsp&nbsp&nbsp</label>
    <input id="birthdate" type="date" name="birthdate" value="${requestScope.employee.birthdate}"/>
    <br>
    <br>
    <label for="idnp"> IDNP &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label>
    <input id="idnp" type="text" name="idnp" value="${requestScope.employee.idnp}"/>
    <br>
    <br>
    <label for="salary"> Salary &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label>
    <input id="salary" type="text" name="salary" value="${requestScope.employee.salary}"/>
    <br>
    <br>
    <label for="department"> Department </label>
    <input id="department" type="text" name="department" value="${requestScope.employee.department.name}"/>
    <br>
    <br>
    <label for="profession"> Profession &nbsp&nbsp</label>
    <input id="profession" type="text" name="profession" value="${requestScope.employee.profession.professionName}"/>
    <br>
    <br>
    <label for="email"> Email &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label>
    <input id="email" type="email" name="email" value="${requestScope.employee.email}"/>
    <br>
    <br>
    <label for="phoneNumber"> Phone &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label>
    <input id="phoneNumber" type="text" name="phoneNumber" value="${requestScope.employee.phoneNumber}"/>
    <br>
    <br>
    <label for="hireDate"> Hire date &nbsp&nbsp&nbsp&nbsp&nbsp</label>
    <input id="hireDate" type="date" name="hireDate" value="${requestScope.employee.hireDate}"/>
    <br>
    <br>
    <label for="dismissDate"> Dismiss date </label>
    <input id="dismissDate" type="date" name="dismissDate" value="${requestScope.employee.dismissDate}"/>
    <br>
    <br>
    <label for="streetName"> Street name </label>
    <input id="streetName" type="text" name="streetName" value="${requestScope.employee.address.streetName}"/>
    <br>
    <br>
    <label for="streetNumber"> Street nr. &nbsp&nbsp&nbsp&nbsp&nbsp</label>
    <input id="streetNumber" type="text" name="streetNumber" value="${requestScope.employee.address.streetNumber}"/>
    <br>
    <br>
    <label for="apartmentNumber"> Apartment &nbsp&nbsp</label>
    <input id="apartmentNumber" type="text" name="apartmentNumber" value="${requestScope.employee.address.apartmentNumber}"/>
    <br>
    <br>
    <label for="houseNumber"> House nr. &nbsp&nbsp&nbsp&nbsp</label>
    <input id="houseNumber" type="text" name="houseNumber" value="${requestScope.employee.address.houseNumber}"/>
    <br>
    <br>

    <a style="color:black; font-weight: bold; text-decoration: none" href="${pageContext.request.contextPath}/">Back to Employee List</a>
        <button class="btn btn-info" type="submit" style="margin-left: 10%">Save</button>


</form>
</div>
</body>
</html>
<%--  /list --- <a href="/edit?id=0" ---- EditServlet.doGet() ---- req.getParameter('id') ---- manager.find(id) ---- request.setAttribute('employee')) --%>