<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: madsm
  Date: 12/04/2022
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <style>
         <%@ include file="style/details.css" %>
      </style>

      <title>Employee Details</title>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  </head>
  <body>
  <div class="container-lg">
  <h1 class="display-1" style="color: aliceblue">|Employee Details</h1>
  <table class="table table-light table-striped">
      <thead>
      <tr>
          <th>Firstname</th>
          <th>Surname</th>
          <th>Birthdate</th>
          <th>Department</th>
          <th>Profession</th>
          <th>Salary</th>
          <th>Email</th>
          <th>Phone</th>
          <th>IDNP</th>
          <th>Hire date</th>
          <th>Dismiss date</th>

          <th>Actions</th>
      </tr>
      </thead>
      <tbody>
<%--<% String address = requestScope.employee.address.streetName +" " +requestScope.employee.address.streetNumber +" " + requestScope.employee.address.apartmentNumber +" " + requestScope.employee.address.houseNumber %>--%>
          <tr>
              <td><c:out value="${requestScope.employee.firstName}"/></td>
              <td><c:out value="${requestScope.employee.lastName}"/></td>
              <td><c:out value="${requestScope.employee.birthdate}"/></td>
              <td><c:out value="${requestScope.employee.department.name}"/></td>
              <td><c:out value="${requestScope.employee.address.streetName }"/></td>
              <td><c:out value="${requestScope.employee.salary}"/></td>
              <td><c:out value="${requestScope.employee.email}"/></td>
              <td><c:out value="${requestScope.employee.phoneNumber}"/></td>
              <td><c:out value="${requestScope.employee.idnp}"/></td>
              <td><c:out value="${requestScope.employee.hireDate}"/></td>
              <td><c:out value="${requestScope.employee.dismissDate}"/></td>
              <td>
                  <a class="btn btn-success" href="${pageContext.request.contextPath}/edit?id=${requestScope.employee.getId()}">Edit</a>
                  <a class="btn btn-danger" href="${pageContext.request.contextPath}/delete?id=${requestScope.employee.getId()}">Delete</a>
              </td>
          </tr>

      </tbody>
  </table>
      <div id="accordion">
          <div class="card">
              <div class="card-header" id="headingOne">
                  <h5 class="mb-0">
                      <button class="btn btn-link" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                          Address
                      </button>
                  </h5>
              </div>

              <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordion">
                  <div class="card-body">
                      <p>Street Name : <c:out value="${requestScope.employee.address.streetName }"/> </p>
                      <p>Street Number : <c:out value="${requestScope.employee.address.streetNumber }"/> </p>
                      <p>Apartment Number : <c:out value="${requestScope.employee.address.apartmentNumber }"/> </p>
                      <p>House Number : <c:out value="${requestScope.employee.address.houseNumber }"/> </p>
                  </div>
              </div>
          </div>
      </div>
      <a style="margin:10px 0 0 94.5%; background: whitesmoke; color: black;" class="btn btn-default" href="list">Back</a>

  </div>

  <script>
      $('.collapse').collapse();
      $('#myCollapsible').collapse({
          toggle: false
      })
  </script>
  </body>
</html>
