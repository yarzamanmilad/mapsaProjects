<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 8/18/2020
  Time: 2:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@page import="bean.LoginDao"%>
<jsp:useBean id="obj" class="bean.LoginBean"/>

<jsp:setProperty property="*" name="obj"/>

<%
    boolean status=LoginDao.validate(obj);
    if(status){
        out.println("You r successfully logged in");
        session.setAttribute("session","TRUE");
    }
    else
    {
        out.print("Sorry, email or password error");
%>
<jsp:include page="index.jsp"></jsp:include>
<%
    }
%>
</body>
</html>
