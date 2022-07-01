
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
    <jsp:useBean id="a" class="com.example.testweb.DAO.DanhmucDAO" scope="request"></jsp:useBean>
</head>
<body>
<c:forEach items="${a.all}" var="i">
        asd: ${i.danhmuc_id}
</c:forEach>
</body>
</html>
