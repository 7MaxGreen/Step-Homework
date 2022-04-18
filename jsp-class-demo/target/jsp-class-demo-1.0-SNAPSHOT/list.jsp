<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.jspclassdemo.model.Employee" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        <%@ include file="style/list.css" %>
    </style>

    <title>View employees</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

<div class="container-sm">
<h1 class="display-1" style="color: aliceblue">|Employee list</h1>

    <%@ include file="lib/navbar.html" %>

<c:if test="${requestScope.activeFilter != null}">
    <div class="alert alert primary">
        <h5> Active filter : <c:out value="${requestScope.activeFilter}" /> </h5> <a class="btn btn-info" href="list">Clear</a>
    </div>
</c:if>

<c:if test="${requestScope.employees != null && !requestScope.employees.isEmpty()}">


<table class="table table-light table-striped">
    <thead>
    <tr>
        <th>Firstname</th>
        <th>Surname</th>
        <th>Birthdate</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${requestScope.employees}" var="emp">
        <tr>
            <td><c:out value="${emp.firstName}"/></td>
            <td><c:out value="${emp.lastName}"/></td>
            <td><c:out value="${emp.birthdate}"/></td>
            <td>
                <a class="btn btn-dark" href="${pageContext.request.contextPath}/edit?id=${emp.getId()}">Edit</a>
                <a class="btn btn-danger" href="${pageContext.request.contextPath}/delete?id=${emp.getId()}">Delete</a>
                <a class="btn btn-info" href="${pageContext.request.contextPath}/details?id=${emp.getId()}">Details</a>
            </td>
        </tr>

    </c:forEach>
    </tbody>
</table>
    <nav aria-label="Page navigation example">
        <ul class="pagination">
            <c:forEach var="i" begin="1" end="${requestScope.totalPages}">

                <c:choose>
                    <c:when test="${requestScope.currentPage == i}">
                        <li class="page-item active">
                    </c:when>
                    <c:otherwise>
                        <li class="page-item">
                    </c:otherwise>
                </c:choose>

                <a class="page-link" href="list?p=${i}"><c:out value="${i}"/></a>
                </li>
            </c:forEach>
                <%--                <li class="page-item"><a class="page-link" href="#">Previous</a></li>--%>
                <%--                <li class="page-item"><a class="page-link" href="#">1</a></li>--%>
                <%--                <li class="page-item"><a class="page-link" href="#">2</a></li>--%>
                <%--                <li class="page-item"><a class="page-link" href="#">3</a></li>--%>
                <%--                <li class="page-item"><a class="page-link" href="#">Next</a></li>--%>
        </ul>
    </nav>
</c:if>
<c:if test="${requestScope.employees == null || requestScope.employees.isEmpty()}" >
    <h5>Could not find a suitable match!</h5>
</c:if>
    </div>
</body>
</html>
