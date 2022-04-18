<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        <%@ include file="style/edit.css" %>
    </style>
    <title>Edit employee</title>
    <h1>|Edit employee</h1>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container mt-2">
 <div class="form-container">
    <form method="post" style="width:70%; color: white; font-weight: bold;">
        <input type="hidden" name="hiddenId" value="${requestScope.id}"/>
        <div class="form-group row">
            <label for="firstName" class="col-sm-2 col-form-label">Firstname</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="firstName" value="${requestScope.employee.firstName}"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="lastName" class="col-sm-2 col-form-label">Lastname</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="lastName" value="${requestScope.employee.lastName}"/>
            </div>
        </div>
        <fieldset class="form-group" style="color: white">
            <div class="row">
                <legend class="col-form-label col-sm-2 pt-0">Gender</legend>
                <div class="col-sm-10">
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="male" id="male" value="MALE">
                        <label class="form-check-label" for="male">
                            MALE
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="female" id="female" value="FEMALE">
                        <label class="form-check-label" for="female">
                            FEMALE
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="notDefined" id="notDefined" value="NOT_DEFINED">
                        <label class="form-check-label" for="notDefined">
                            NOT_DEFINED
                        </label>
                    </div>
                </div>
            </div>
        </fieldset>
        <div class="form-group row">
            <label for="birthdate" class="col-sm-2 col-form-label">Birthdate</label>
            <div class="col-sm-10">
                <input type="date" class="form-control" id="birthdate" value="${requestScope.employee.birthdate}"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="idnp" class="col-sm-2 col-form-label">Idnp</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="idnp" value="${requestScope.employee.idnp}"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="salary" class="col-sm-2 col-form-label">Salary</label>
            <div class="col-sm-10">
                <input type="number" class="form-control" id="salary" value="${requestScope.employee.salary}"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="department" class="col-sm-2 col-form-label">Department</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="department" value="${requestScope.employee.department.name}"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="profession" class="col-sm-2 col-form-label">Profession</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="profession" value="${requestScope.employee.profession.professionName}"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="email" class="col-sm-2 col-form-label">Email</label>
            <div class="col-sm-10">
                <input type="email" class="form-control" id="email" value="${requestScope.employee.email}"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="phoneNumber" class="col-sm-2 col-form-label">Phone number</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="phoneNumber" value="${requestScope.employee.phoneNumber}"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="hireDate" class="col-sm-2 col-form-label">Hire date</label>
            <div class="col-sm-10">
                <input type="date" class="form-control" id="hireDate" value="${requestScope.employee.hireDate}"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="dismissDate" class="col-sm-2 col-form-label">Dismiss date</label>
            <div class="col-sm-10">
                <input type="date" class="form-control" id="dismissDate" value="${requestScope.employee.dismissDate}"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="streetName" class="col-sm-2 col-form-label">Street Name</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="streetName" value="${requestScope.employee.address.streetName}"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="streetNumber" class="col-sm-2 col-form-label">Street number</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="streetNumber" value="${requestScope.employee.address.streetNumber}"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="apartmentNumber" class="col-sm-2 col-form-label">Apartment nr.</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="apartmentNumber" value="${requestScope.employee.address.apartmentNumber}"/>
            </div>
        </div>
        <div class="form-group row">
            <label for="houseNumber" class="col-sm-2 col-form-label">House number</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="houseNumber" value="${requestScope.employee.address.houseNumber}"/>
            </div>
        </div>



        <a style="margin-left: 78.8%; border: 1px solid black" class="btn btn-dark" href="list">Employee List</a>
        <button class="btn btn-info" type="submit" >Save</button>

    </form>
 </div>
</div>
</body>
</html>
<%--  /list --- <a href="/edit?id=0" ---- EditServlet.doGet() ---- req.getParameter('id') ---- manager.find(id) ---- request.setAttribute('employee')) --%>