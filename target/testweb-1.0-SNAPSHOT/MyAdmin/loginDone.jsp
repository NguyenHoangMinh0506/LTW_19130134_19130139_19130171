<%@ page language="java" contentType="text/html; charset=UTF-8" %>



Đăng nhập thành công!


<c:choose>
    <c:when test="${param.quanly == 'dashboard'}">
        <%@ include file = "dashboard.jsp" %>

    </c:when>
</c:choose>