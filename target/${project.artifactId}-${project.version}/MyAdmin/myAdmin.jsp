<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ include file = "../db/connect.jsp" %>


    <c:if test = "${sessionScope.username != 'admin'}">
        <script type="text/javascript">
            alert("Bạn không có quyền truy cập trang web này!!")
            window.location.href = "../index.jsp"
        </script>
    </c:if>



<%--SQL chon danh sach member--%>
<sql:query dataSource = "${snapshot}" var = "member">
    SELECT * from member;
</sql:query>
<%--SQL chon danh sach san pham--%>
<sql:query dataSource = "${snapshot}" var = "sanpham">
    SELECT * from sanpham;
</sql:query>
<h1>Welcome!</h1>
<a href="?dashboard=user" >Danh sách người dùng</a>
<a href="?dashboard=product" >Danh sách sản phẩm</a>
<c:choose>
    <c:when test="${param.dashboard =='user'}">
        <%@ include file = "user.jsp" %>

    </c:when>
    <c:when test="${param.dashboard =='product'}">
        <%@ include file = "product.jsp" %>

    </c:when>
</c:choose>


