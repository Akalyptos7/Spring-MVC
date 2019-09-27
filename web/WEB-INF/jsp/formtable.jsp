<%--
  Created by IntelliJ IDEA.
  User: Akalyptos Laptop
  Date: 9/26/2019
  Time: 7:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Trainer Project</title>
</head>
<body bgcolor="aqua">
<h1 style="text-align: center;">List of Trainers:</h1>
<form action="getalltrainers" method="post" enctype="multipart/form-data" style="text-align: center;">
    <table border="1" style="margin: auto;" bgcolor="white">
        <thead>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Subject</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        </thead>
        <c:forEach items="${Trainers}" var="t">
            <tbody>
            <tr>
                <td>${t.trainerId}</td>
                <td>${t.trainerFirstname}</td>
                <td>${t.trainerLastname}</td>
                <td>${t.trainerSubject}</td>
                <td><a href="${pageContext.request.contextPath}/update/${t.trainerId}">Update</a></td>
                <td><a href="${pageContext.request.contextPath}/delete/${t.trainerId}">Delete</a></td>
            </tr>
            </tbody>
        </c:forEach>
    </table>
    <a href="${pageContext.request.contextPath}/">Return to Home Page</a>
</form>
</body>
</html>
