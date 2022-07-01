<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<link rel="icon" href="images/logo_Mouse_Shop.png" type="image/png" >

<html>
<head>
  <title>Mouse Store</title>
</head>

<body>
<sql:setDataSource var = "snapshot" driver = "com.mysql.cj.jdbc.Driver"
                   url = "jdbc:mysql://localhost/ltw"
                   user = "root"  password = ""/>



</body>
</html>