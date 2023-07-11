<%--
  Created by IntelliJ IDEA.
  User: seoulit
  Date: 2023-07-05
  Time: 오후 5:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Page</h1>
<ul>
    <c:forEach var="num" begin="1" end="10">
        <c:if test="${num==target}"
              num is target </c:forEach>
    </c:forEach>
</ul>

</body>
</html>
</jsp:root>