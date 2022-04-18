<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        <%@ include file="style/add.css" %>

    </style>

    <title>Add employee</title>
    <%@ include file="lib/navbar.html" %>
    <h1>|Add new employee</h1>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<div class="container mt-2">
    <div class="form-container">
        <form method="post" style="width:70%; color: white; font-weight: bold;">
            <div class="form-group row">
                <label for="firstName" class="col-sm-2 col-form-label">Firstname</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="firstName" placeholder="Firstname">
                </div>
            </div>
            <div class="form-group row">
                <label for="lastName" class="col-sm-2 col-form-label">Lastname</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="lastName" placeholder="LastName">
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
                            <input class="form-check-input" type="radio" name="notDefined" id="notDefined" value="NOT_DEFINED" >
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
                    <input type="date" class="form-control" id="birthdate" placeholder="Birthdate">
                </div>
            </div>
            <div class="form-group row">
                <label for="idnp" class="col-sm-2 col-form-label">Idnp</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="idnp" placeholder="Idnp">
                </div>
            </div>
            <div class="form-group row">
                <label for="salary" class="col-sm-2 col-form-label">Salary</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="salary" placeholder="Salary">
                </div>
            </div>
            <div class="form-group row">
                <label for="department" class="col-sm-2 col-form-label">Department</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="department" placeholder="Department">
                </div>
            </div>
            <div class="form-group row">
                <label for="profession" class="col-sm-2 col-form-label">Profession</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="profession" placeholder="Profession">
                </div>
            </div>
            <div class="form-group row">
                <label for="email" class="col-sm-2 col-form-label">Email</label>
                <div class="col-sm-10">
                    <input type="email" class="form-control" id="email" placeholder="Email">
                </div>
            </div>
            <div class="form-group row">
                <label for="phoneNumber" class="col-sm-2 col-form-label">Phone number</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="phoneNumber" placeholder="Phone number">
                </div>
            </div>
            <div class="form-group row">
                <label for="hireDate" class="col-sm-2 col-form-label">Hire date</label>
                <div class="col-sm-10">
                    <input type="date" class="form-control" id="hireDate" placeholder="Hire date">
                </div>
            </div>
            <div class="form-group row">
                <label for="dismissDate" class="col-sm-2 col-form-label">Dismiss date</label>
                <div class="col-sm-10">
                    <input type="date" class="form-control" id="dismissDate" placeholder="Dismiss date">
                </div>
            </div>
            <div class="form-group row">
                <label for="streetName" class="col-sm-2 col-form-label">Street Name</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="streetName" placeholder="Street name">
                </div>
            </div>
            <div class="form-group row">
                <label for="streetNumber" class="col-sm-2 col-form-label">Street number</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="streetNumber" placeholder="Street number">
                </div>
            </div>
            <div class="form-group row">
                <label for="apartmentNumber" class="col-sm-2 col-form-label">Apartment nr.</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="apartmentNumber" placeholder="Apartment number">
                </div>
            </div>
            <div class="form-group row">
                <label for="houseNumber" class="col-sm-2 col-form-label">House number</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="houseNumber" placeholder="House number">
                </div>
            </div>

        <a style="margin-left: 78.8%; border: 1px solid black" class="btn btn-dark" href="list">Employee List</a>
        <button class="btn btn-info" type="submit" >Save</button>

    </form>
    </div>
</div>
</body>
</html>
