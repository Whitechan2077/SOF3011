<%--
  Created by IntelliJ IDEA.
  User: buidu
  Date: 10/08/2023
  Time: 12:06 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach var="x" items="${a}">
        <h1>${x}</h1>
        <c:if test="${x >1}">
            <h1>Thằng này bú cặc chó</h1>
        </c:if>
    </c:forEach>
    <button formaction="Test"></button>>
</body>
</html>
