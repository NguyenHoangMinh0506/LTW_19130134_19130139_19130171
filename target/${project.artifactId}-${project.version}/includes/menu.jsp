<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>



<div class="navbar-inner">
    <div class="container">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="agileits-navi_search">
                <form action="#" method="post">
                    <select id="agileinfo-nav_search" name="agileinfo_search" class="border" required="">
                        <option value="">Danh mục sản phẩm</option>


                        <c:forEach var = "row" items = "${danhmuc}">
                            <option value="${row.stt_nha_san_xuat}">${row.nha_san_xuat}</option>

                        </c:forEach>


                    </select>
                </form>
            </div>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto text-center mr-xl-5">
                    <li class="nav-item active mr-lg-2 mb-lg-0 mb-2">
                        <a class="nav-link" href="index.jsp">Trang chủ
                            <span class="sr-only">(current)</span>
                        </a>
                    </li>

                    <c:forEach var = "row" items = "${chon_nha_san_xuat.rows}">

                        <a class="nav-link" href="?quanly=danhmuc&id=${row.stt_nha_san_xuat}">${row.nha_san_xuat}</a>

                    </c:forEach>






                    <li class="nav-item mr-lg-2 mb-lg-0 mb-2">
                        <a class="nav-link" href="about.html">Về chúng tôi</a>
                    </li>

                    <li class="nav-item dropdown mr-lg-2 mb-lg-0 mb-2">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Khách hàng
                        </a>
                        <div class="dropdown-menu">

                            <a class="dropdown-item" href="?quanly=giohang">Kiểm tra giỏ hàng</a>
                            <a class="dropdown-item" href="payment.html">Sản phẩm đã mua</a>
                        </div>
                    </li>
                    <li class="nav-item">



                    </li>
                </ul>
            </div>
        </nav>
    </div>
</div>
<!-- //navigation -->
