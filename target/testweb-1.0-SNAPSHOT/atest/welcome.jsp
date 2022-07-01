<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ include file = "../db/connect.jsp" %>
<html>
<head>
  <title>Welcome Page</title>
</head>
<body>

<h3>Welcome Page</h3>
Welcome ${sessionScope.username }

<%--<sql:update dataSource = "${snapshot}" var = "create">--%>
<%--  CREATE TABLE ${sessionScope.username} ( PersonID int, LastName varchar(255), FirstName varchar(255), Address varchar(255), City varchar(255) );--%>
<%--</sql:update>--%>



<br>
<a href="${pageContext.request.contextPath }/account?action=logout">Logout</a>

</body>
</html>