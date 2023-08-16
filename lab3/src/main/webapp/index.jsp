<%--
  Created by IntelliJ IDEA.
  User: buidu
  Date: 08/08/2023
  Time: 12:57 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="upload" method="post" enctype="multipart/form-data">
    Input name: <input type="text" name="name">
    <br>
    Choosen File:<input type="file" name="filePhoto">
    <br>
    <button type="submit">Submit</button>
</form>

</body>
</html>
