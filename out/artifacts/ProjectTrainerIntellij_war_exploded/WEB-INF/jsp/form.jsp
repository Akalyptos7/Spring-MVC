<%--
  Created by IntelliJ IDEA.
  User: Akalyptos Laptop
  Date: 9/26/2019
  Time: 2:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Trainer Project</title>
</head>
<body bgcolor="aqua">
<h1 style="text-align: center">Insert your Trainer</h1>
<br>
<br>
<br>
<spring:form modelAttribute="emTrainer" action="${pageContext.request.contextPath}/insertTrainer" method="post">
    <table style="margin: auto" >
        <tr>
            <td><spring:label path="trainerFirstname">First Name</spring:label></td>
            <td><spring:input path="trainerFirstname"/></td>
        </tr>
        <tr>
            <td><spring:label path="trainerLastname">Last Name</spring:label></td>
            <td><spring:input path="trainerLastname"/></td>
        </tr>
        <tr>
            <td><spring:label path="trainerSubject">Last Name</spring:label></td>
            <td><spring:input path="trainerSubject"/></td>
        </tr>
    </table>
    <input type="submit" value="Submit" style="margin-left: 50%">
    <br>
    <br>
    <br>
    <a href="${pageContext.request.contextPath}/" style="margin-left: 48%">Return to Home Page</a>
</spring:form>

</body>
</html>
