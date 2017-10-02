<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  User: zyzz    Date: 17-9-29    Time: 下午8:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Your profile</h1>
    <c:out value="${spitter.username}" /><br />
    <c:out value="${spitter.firstName}" /><br />
    <c:out value="${spitter.lastName}" />
</body>
</html>
