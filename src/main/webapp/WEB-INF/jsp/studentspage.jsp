<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<h1>Students</h1>

<table style="border: 1px solid; width: 500px; text-align:center">
    <thead style="background:#0FA9BF">
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th colspan="3"></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${students}" var="students">
        <tr>
            <td><c:out value="${students.firstName}"/></td>
            <td><c:out value="${students.lastName}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<h1>Students with stipend</h1>

<table style="border: 1px solid; width: 500px; text-align:center">
    <thead style="background:#0FA9BF">
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Quantitye</th>
        <th colspan="3"></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${studentsWithStipend}" var="i">
        <tr>
            <td><c:out value="${i[0]}"/></td>
            <td><c:out value="${i[1]}"/></td>
            <td><c:out value="${i[2]}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>