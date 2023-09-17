<%--
  Created by IntelliJ IDEA.
  User: Skritex
  Date: 14.09.2023
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>Authorisation</title>
</head>
<body>
<form action="/auth" method="post">

  <div class="input-group flex-nowrap">
    <span class="input-group-text" id="addon-wrapping"></span>
    <input type="text" class="form-control" placeholder="username" name="username" aria-label="Username" aria-describedby="addon-wrapping">
  </div>

  <div class="input-group flex-nowrap">
    <span class="input-group-text" id="addon-wrapping2"></span>
    <input type="text" class="form-control" placeholder="password" name="password" aria-label="Password" aria-describedby="addon-wrapping">
  </div>

  <button>Submit</button>
</form>

<p>${message}</p>

<form action="/" method="post">
  <button>Home</button>

</form>

</body>
</html>
