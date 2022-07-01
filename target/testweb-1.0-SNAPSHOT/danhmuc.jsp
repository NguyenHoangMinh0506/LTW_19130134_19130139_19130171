<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!-- top Products -->
<link href="css/centerShop.css" rel="stylesheet" type="text/css" media="all" />

<div class="ads-grid py-sm-5 py-4">
    <div class="container py-xl-4 py-lg-2">
        <!-- tittle heading -->

        <!-- doan nay la load loai chuot -->
        <sql:query dataSource = "${snapshot}" var = "chon_nha_san_xuat">
            SELECT * from nha_san_xuat;
        </sql:query>
        <h3 class="tittle-w3l text-center mb-lg-5 mb-sm-4 mb-3">
            <span>
                <c:forEach var = "row" items = "${chon_nha_san_xuat.rows}">
                    <c:if test="${param.id == row.stt_nha_san_xuat }">

                        <c:out value="${row.nha_san_xuat}" />

                    </c:if>


                </c:forEach>

            </span>
        </h3>



        <div class="row">
            <!-- product left -->
            <div class="agileinfo-ads-display col-lg-9">
                <div class="wrapper">
                    <!-- first section -->
                    <div class="product-sec1 px-sm-4 px-3 py-sm-5  py-3 mb-4">
                        <div class="row">
<sql:query dataSource = "${snapshot}" var = "san_pham_chuot">
    SELECT * from sanpham;
</sql:query>
<c:forEach var = "row_sp" items = "${san_pham_chuot.rows}">
    <c:if test="${param.id == row_sp.danhmuc_id }">
                            <div class="col-md-4 product-men">
                                <div class="men-pro-item simpleCart_shelfItem">
                                    <div class="men-thumb-item text-center">
                                        <img src="images/${row_sp.sanpham_image}" alt="">
                                        <div class="men-cart-pro">
                                            <div class="inner-men-cart-pro">
                                                <a href="?quanly=chitietsp&id=${row_sp.sanpham_id}" class="link-product-add-cart">Xem ngay</a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="item-info-product text-center border-top mt-4">
                                        <h4 class="pt-1">
                                            <a href="?quanly=chitietsp&id=${row_sp.sanpham_id}">${row_sp.sanpham_name}</a>
                                        </h4>
                                        <div class="info-product-price my-2">

                                            <span class="item_price"><fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${row_sp.sanpham_giakm}"  /> đ</span>
                                            <del><fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${row_sp.sanpham_gia}"  /> đ</del>
                                        </div>
                                        <div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out">
                                            <form action="?quanly=themsanpham" method="post">
                                                <fieldset>
                                                    <input type="hidden" name="id" value="${row_sp.sanpham_id}" />
                                                    <input type="hidden" name="tensp" value="${row_sp.sanpham_name}" />
                                                    <input type="hidden" name="gia" value="${row_sp.sanpham_giakm}" />
                                                    <input type="hidden" name="img" value="${row_sp.sanpham_image}" />
                                                    <input type="hidden" name="soluong" value="1" />
                                                    <input type="submit" name="submit" value="Thêm vào giỏ hàng" class="button btn" />
                                                </fieldset>
                                            </form>
                                        </div>

                                    </div>
                                </div>
                            </div>
    </c:if>


</c:forEach>
                            <!-- end -->
                        </div>
                    </div>
                </div>
            </div>
        </div>

                    <!-- //first section -->

        <%@ include file = "includes/next.jsp" %>



    </div>

</div>
