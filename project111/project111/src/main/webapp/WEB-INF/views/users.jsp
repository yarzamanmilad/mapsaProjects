<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 8/16/2020
  Time: 10:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<h2><center><u>  users
</u></center></h2>
<hr>
<div class="container">
    <table class="table">
        <thead>
        <tr>

            <th>Id</th>
            <th>First_Name</th>
            <th>Last_Name</th>


        </tr>
        </thead>
            <tr>

                <td>${users.id}</td>
                <td>${users.firstName}</td>
                <td>${users.lastName}</td>



            </tr>


    </table>
</div>

</body>
</html>
