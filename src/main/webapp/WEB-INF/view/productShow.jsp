<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="i" begin="1" end="${}">

         <c:out value="${user.get(i).name}"/><br>
         <c:out value="${user.get(i).id}"/><br>
         <a href="/showDesc">cilck for more info</a> <br>

</c:forEach>
</body>
</html>
