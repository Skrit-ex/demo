<%--
  Created by IntelliJ IDEA.
  User: Iakamenyuk
  Date: 15.09.2023
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/calc" method="post">

  <input type="text" placeholder="Num1" name="num1">
  <input type="text" placeholder="Num2" name="num2">
  <input type="text" placeholder="Type" name="type">
    <button>Submit</button>
</form>

<p1> Your result = ${result} </p1>

<form action="/", method="post">
    <button type="button" class="btn btn-secondary">Home</button>
</form>

</body>
</html>
