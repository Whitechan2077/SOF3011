<%--
  Created by IntelliJ IDEA.
  User: buidu
  Date: 08/08/2023
  Time: 1:53 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="Register" method="post">
    <h4>Username</h4>
    <input type="text" name="username">
    <h4>Password</h4>
    <input type="password" name="password">
    <h4>Gender</h4>
    <input type="radio" name="rdoGender" value="Male">Male
    <input type="radio" name="rdoGender" value="Female">Female
    <h4>National</h4>
    <select name="country" id="">
        <option value="VN">VietNam</option>
        <option value="US">United States</option>
    </select>
    <br>
    <button type="submit">Login</button>
</form>
</body>
</html>
