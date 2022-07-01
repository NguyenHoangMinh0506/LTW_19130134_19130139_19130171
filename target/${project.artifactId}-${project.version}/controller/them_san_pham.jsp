<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ include file = "../db/connect.jsp" %>
<c:if test = "${sessionScope.username == null}">
    <script type="text/javascript">
        alert("Vui lòng đăng nhập để tiếp tục!")
        window.location.href = "login.jsp"
    </script>
</c:if>

<c:if test = "${sessionScope.username != null}">
<sql:update dataSource = "${snapshot}" var = "them">
    INSERT INTO giohang VALUES ('${sessionScope.username}', '${param.id}', '${param.tensp}', '${param.gia}','${param.img}','1',${param.gia});
</sql:update>
${sessionScope.username}
<script type="text/javascript">
    window.location.href = "?quanly=giohang"
</script>
</c:if>