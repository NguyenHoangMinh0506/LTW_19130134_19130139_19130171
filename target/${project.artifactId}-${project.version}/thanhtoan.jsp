<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@page pageEncoding="UTF-8"%>

<%--SQL select giohang--%>
<sql:query dataSource = "${snapshot}" var = "giohang">
    SELECT * from giohang;
</sql:query>

<sql:update dataSource = "${snapshot}" var = "test">
    INSERT INTO daban (giohang_id,sanpham_id,tensp,giasp,hinhanh,soluong,thanhtien) SELECT giohang_id,sanpham_id,tensp,giasp,hinhanh,soluong,thanhtien FROM giohang WHERE giohang_id ='${sessionScope.username}';
</sql:update>

<sql:update dataSource = "${snapshot}" var = "capnhat">
<%--    UPDATE sanpham SET sanpham_soluong = sanpham_soluong - 1 WHERE sanpham_id = danhmuc_id;--%>
    UPDATE sanpham INNER JOIN giohang SET sanpham.sanpham_soluong = sanpham.sanpham_soluong - giohang.soluong WHERE sanpham.sanpham_id = giohang.sanpham_id;
</sql:update>

<%--<c:set var = "name_KH" scope = "session" value = "${param.name}"  />--%>
<%--<c:set var = "sdt_KH" scope = "session" value = "${param.number}"  />--%>
<%--<c:set var = "diachi_KH" scope = "session" value = "${param.city}"  />--%>
<sql:update dataSource = "${snapshot}" var = "test">
    INSERT INTO khachhang (ten, sdt, diachi) VALUES ('${param.name}','${param.number}','${param.city}');
</sql:update>

<sql:update dataSource = "${snapshot}" var = "chon_nha_san_xuat">
    delete from giohang WHERE giohang_id ='${sessionScope.username}';
</sql:update>
<h1 class="text-center" style="color: blue">Thanh toán thành công</h1>



