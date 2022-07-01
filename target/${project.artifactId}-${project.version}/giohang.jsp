<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
%>





<!-- checkout page -->
<div class="privacy py-sm-5 py-4">
    <div class="container py-xl-4 py-lg-2">
        <!-- tittle heading -->
        <h3 class="tittle-w3l text-center mb-lg-5 mb-sm-4 mb-3">
            <span>C</span>heckout
        </h3>
        <!-- //tittle heading -->
        <div class="checkout-right">

            <sql:query dataSource = "${snapshot}" var = "gio_hang">
                SELECT * from giohang WHERE giohang_id='${sessionScope.username}';
            </sql:query>

            <div class="table-responsive">
                <table class="timetable_sub">
                    <thead>
                    <tr>

                        <th>Sản phẩm</th>
                        <th>Số lượng</th>
                        <th>Tên sản phẩm</th>

                        <th>Giá</th>

                        <th>Xóa</th>
                    </tr>
                    </thead>
                    <tbody>

                    <sql:query dataSource = "${snapshot}" var = "gio_hang111">
                        SELECT SUM(thanhtien) total FROM giohang WHERE giohang_id='${sessionScope.username}';

                    </sql:query>
                    <c:forEach var = "row_sp123" items = "${gio_hang111.rows}">


                        <c:set var = "salary" scope = "session" value ="${row_sp123.total}"/>

                    </c:forEach>

                    <c:forEach var = "row_giohang" items = "${gio_hang.rows}">


                        <tr class="rem1">

                        <td class="invert-image">
                            <a href="single.html">
                                <img src="images/${row_giohang.hinhanh}" alt=" " class="img-responsive">
                            </a>
                        </td>
                            <td class="invert">
                                <div class="rem">


                                    <form action="?quanly=capnhatgiohang" method="post" class="delete" accept-charset="utf-8">
                                        <input type="number" min="1" name="soluong" class="text-center" value="${row_giohang.soluong}">
                                        <button class="delete" name="capnhat" value="${row_giohang.sanpham_id}">Cập nhật</button>


                                    </form>
                                </div>
                            </td>
                            <c:set var = "salary1" scope = "session" value ="${row_giohang.sanpham_id}"/>


                        <td class="invert">${row_giohang.tensp}</td>
                        <td class="invert"><fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${row_giohang.thanhtien}"  /> đ</td>

                        <td class="invert">
                            <div class="rem">


                                <form action="?quanly=giohangUpdate" method="post" class="delete" accept-charset="utf-8">
                                    <button class="delete" name="xoa" value="${row_giohang.sanpham_id}">Xóa</button>


                                </form>
                            </div>
                        </td>
                    </tr>
                        </c:forEach>
                    <tr >
                        <td colspan="7"><h2>
                            Tổng tiền:  <fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${salary}"  /> đ </h2></td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>


        <div class="checkout-left">
            <div class="address_form_agile mt-sm-5 mt-4">
                <h4 class="mb-sm-4 mb-3">Thêm thông tin giao hàng</h4>
                <form action="?quanly=thanhtoan" method="post" class="creditly-card-form agileinfo_form" accept-charset="utf-8">

                    <div class="creditly-wrapper wthree, w3_agileits_wrapper">
                        <div class="information-wrapper">
                            <div class="first-row">
                                <div class="controls form-group">
                                    <input class="billing-address-name form-control" type="text" name="name" placeholder="Họ tên" required="">
                                </div>
                                <div class="w3_agileits_card_number_grids">
                                    <div class="w3_agileits_card_number_grid_left form-group">
                                        <div class="controls">
                                            <input type="text" class="form-control" placeholder="Số điện thoại" name="number" required="">
                                        </div>
                                    </div>
                                </div>
                                <div class="controls form-group">
                                    <input type="text" class="form-control" placeholder="Địa chỉ" name="city" required="">
                                </div>
                            </div>

                            <button class="submit check_out btn" onclick="myFunction()">Thanh toán</button>

<%--                            <script>--%>
<%--                                function myFunction() {--%>
<%--                                alert("Thanh toán thành công:  <fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${salary}"  /> đ ");--%>


<%--                                }--%>
<%--                            </script>--%>

                        </div>
                    </div>
                </form>

            </div>
        </div>
    </div>
</div>
<!-- //checkout page -->