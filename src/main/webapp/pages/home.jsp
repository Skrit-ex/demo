<%@ page import="by.tms.servlet.User" %><%--
  Created by IntelliJ IDEA.
  User: Skritex
  Date: 14.09.2023
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<%
    User user = (User) session.getAttribute("user");

    if (user == null) {
        out.print("<h1>Hello Guest!</h1>");
    }

    if (user != null) {
        out.print("<h1>Hello " + user.getName() + "!</h1>");
    }
%>

<%
            if(user == null){
                out.print("<a href=\"/logout\"> Logout </a>\n" +
                        "<a href=\"/calc\"> Calculator </a>");
            }
            if(user!= null){
                out.print("<a href=\"/logout\"> Logout </a>\n" +
                        "<a href=\"/calc\"> Calculator </a>");
            }


%>

</body>
</html>
