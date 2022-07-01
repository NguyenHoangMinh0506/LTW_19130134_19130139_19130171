
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Minh
  Date: 12/27/2021
  Time: 5:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>


<c:forEach items="${product}" var="food">
    ${food.sanpham_name}

</c:forEach>

<c:forEach var="danhmuc" items="${danhmuc}">
    <a class="nav-link" href="">${danhmuc.nha_san_xuat}</a>
</c:forEach>

</body>
</html>
