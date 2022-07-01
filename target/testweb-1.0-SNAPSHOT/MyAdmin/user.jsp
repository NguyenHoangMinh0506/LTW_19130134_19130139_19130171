<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<table border="1">
    <tr>
        <th colspan="4">DANH SÁCH NGƯỜI DÙNG</th>
    </tr>
    <th>Tên đăng nhập</th>
    <th>Mật khẩu</th>
    <th>Địa chỉ email</th>
    <th>Họ và tên</th>

    <c:forEach var = "member_row" items = "${member.rows}">
        <tr>
            <td>${member_row.username}</td>
            <td>${member_row.password}</td>
            <td>${member_row.email}</td>
            <td>${member_row.fullname}</td>
        </tr>
    </c:forEach>



</table>