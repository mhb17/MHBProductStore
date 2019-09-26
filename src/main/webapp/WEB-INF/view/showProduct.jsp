<%--
  Created by IntelliJ IDEA.
  User: MHB
  Date: 8/29/2019
  Time: 11:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${productList}" var="item">
    ${productList.toString()}<br>
</c:forEach>

</body>
</html>
