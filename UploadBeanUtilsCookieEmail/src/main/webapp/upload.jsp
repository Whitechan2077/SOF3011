<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Upload File" %></h1>
<br/>
<form action="Upload" method="post" enctype="multipart/form-data">
    <input type="file" name="browerFile" id="">Choosen file
    <button type="submit">Send</button>
</form>
</body>
</html>