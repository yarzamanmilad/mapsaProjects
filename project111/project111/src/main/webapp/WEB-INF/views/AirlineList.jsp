<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 8/18/2020
  Time: 1:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    </head>
<body>
<h2><center><u>Airlinelist</u></center></h2>
<hr>
<table class="container">
    <tr class="table">
        <tr>

            <th>ID</th>
            <th>Origin</th>
            <th>Destination</th>
            <th>Seatnumber</th>
            <th>Dateofdeparture</th>
            <th>Returndate</th>



        </tr>
    </thead>
        <tr>
            <td>${airlineLists.id}</td>
            <td>${airlineLists.origin}</td>
            <td>${airlineLists.destination}</td>
            <td>${airlineLists.seatnumber}</td>
            <td>${airlineLists.dateofdeparture}</td>
            <td>${airlineLists.returndate}</td>

    </tr>


    </table>
</table>

</body>
</html>
