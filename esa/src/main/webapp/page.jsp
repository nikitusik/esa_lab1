<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>Mobile Phone</td>
        <td>Name</td>
        <td>Surname</td>
        <td>Course</td>
        <td>Faculty</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${studentsList}" var="student">
        <tr>
            <td>${student.mobile}</td>
            <td>${student.name}</td>
            <td>${student.surname}</td>
            <td>${student.course}</td>
            <td>${student.faculty.name}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
