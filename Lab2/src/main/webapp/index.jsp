<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="tamgiac" method="get">
    <input type="number" placeholder="a" name="a">
    <br>
    <input type="number" placeholder="b" name="b">
    <br>
    <input type="number" placeholder="c" name="c">
    <br>
    <button formaction="chuvi" >Chuvi</button>
    <button formaction="dientich" >dientic</button>
</form>
<h4>${s}</h4>
<h4>${p}</h4>

</body>
</html>