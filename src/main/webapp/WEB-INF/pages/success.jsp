<%--
  Created by IntelliJ IDEA.
  User: Jesper
  Date: 2019/1/19
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
    跳转
    <c:forEach items="${accounts}" var="account" >
        ${account.name}
    </c:forEach>
</body>
</html>
