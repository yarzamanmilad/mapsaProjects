<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> USERS </title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<h2><center><u> users </u></center></h2>
<hr>
<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th>id</th>
            <th>first name</th>
            <th>last name</th>

            <th></th>
        </tr>
        </thead>
<%--        <c:forEach items="${users}" var="user" varStatus="counter">--%>
            <tr>

                <td>${users.id}</td>
                <td>${users.firstName}</td>
                <td>${users.lastName}</td>
            </tr>
<%--        </c:forEach>--%>
    </table>
</div>
</body>
</html>
