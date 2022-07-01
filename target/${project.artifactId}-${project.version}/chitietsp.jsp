<%@ page import="com.example.testweb.DBConnect" %>




<%@ page language="java" contentType="text/html; charset=UTF-8" %>





<!-- page -->
<div class="services-breadcrumb">
  <div class="agile_inner_breadcrumb">
    <div class="container">
      <ul class="w3_short">
        <li>
          <a href="index.jsp">Trang chủ</a>
          <i>|</i>
        </li>
        <li>Chi tiết sản phẩm</li>


      </ul>
    </div>
  </div>
</div>
<!-- //page -->
<!-- Single Page -->
<div class="banner-bootom-w3-agileits py-5">
  <div class="container py-xl-4 py-lg-2">
    <!-- tittle heading -->
    <h3 class="tittle-w3l text-center mb-lg-5 mb-sm-4 mb-3">
      <span>S</span>ản
      <span>P</span>hẩm</h3>
    <!-- //tittle heading -->

    <sql:query dataSource = "${snapshot}" var = "san_pham_chuot">
      SELECT * from sanpham;
    </sql:query>








  <c:forEach var = "row_sp" items = "${san_pham_chuot.rows}">

  <c:if test="${param.id == row_sp.sanpham_id }">
    <sql:query dataSource = "${snapshot}" var = "thongtinsp">
    SELECT * from thongtinsp;
    </sql:query>

    <sql:query dataSource = "${snapshot}" var = "thongtinsp_coday">
    SELECT * from thongtinsp ORDER BY co_day;
    </sql:query>

    <sql:query dataSource = "${snapshot}" var = "thongtinsp_khongday">
    SELECT * from thongtinsp ORDER BY khong_day;
    </sql:query>

    <sql:query dataSource = "${snapshot}" var = "thongtinsp_gaming">
    SELECT * from thongtinsp ORDER BY gaming;
    </sql:query>

    <div class="banner-bootom-w3-agileits py-5">
      <div class="container py-xl-4 py-lg-2">



    <div class="row">
      <div class="col-lg-5 col-md-8 single-right-left ">
        <div class="grid images_3_of_2">
          <div class="flexslider">
            <ul class="slides">
              <li data-thumb="inf_image/${row_sp.sanpham_inf1}">
                <div class="thumb-image">
                  <img src="inf_image/${row_sp.sanpham_inf1}" data-imagezoom="true" class="img-fluid" alt=""> </div>
              </li>

              <li data-thumb="inf_image/${row_sp.sanpham_inf2}">
                <div class="thumb-image">
                  <img src="inf_image/${row_sp.sanpham_inf2}" data-imagezoom="true" class="img-fluid" alt=""> </div>
              </li>
              <li data-thumb="inf_image/${row_sp.sanpham_inf3}">
                <div class="thumb-image">
                  <img src="inf_image/${row_sp.sanpham_inf3}" data-imagezoom="true" class="img-fluid" alt=""> </div>
              </li>
              <li data-thumb="inf_image/${row_sp.sanpham_inf4}">
                <div class="thumb-image">
                  <img src="inf_image/${row_sp.sanpham_inf4}" data-imagezoom="true" class="img-fluid" alt=""> </div>
              </li>
            </ul>
            <div class="clearfix"></div>
          </div>
        </div>
      </div>



      <div class="col-lg-7 single-right-left simpleCart_shelfItem">
        <h3 class="mb-3">${row_sp.sanpham_name}
           </h3>
        <p class="mb-3">

          <span class="item_price"> <fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${row_sp.sanpham_giakm}"  /> đ </span>
          <del class="mx-2 font-weight-light"><fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${row_sp.sanpham_gia}"  /> đ</del>
          <label>Free delivery</label>
        </p>







        <div class="single-infoagile">
          <ul>
            <c:forEach var = "row_sp1" items = "${thongtinsp.rows}">
            <li style="color:blue;" class="mb-3">
              <c:if test="${row_sp.danhmuc_id == '2'}">
                ${row_sp1.title} :
                ${row_sp1.khong_day}
              </c:if>

              <c:if test="${row_sp.danhmuc_id == '1'}">
                ${row_sp1.title} :
                ${row_sp1.gaming}
              </c:if>
              <c:if test="${row_sp.danhmuc_id == '3'}">
                ${row_sp1.title} :
                ${row_sp1.co_day}
              </c:if>

            </li>
            </c:forEach>

          </ul>
        </div>






        <div class="occasion-cart">
          <div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out">
            <form action="?quanly=giohang"  method="post" >

              <fieldset>
                <input type="hidden" name="id" value="${row_sp.sanpham_id}" />
                <input type="hidden" name="tensp" value="${row_sp.sanpham_name}" />
                <input type="hidden" name="gia" value="${row_sp.sanpham_giakm}" />
                <input type="hidden" name="img" value="${row_sp.sanpham_image}" />
                <input type="hidden" name="soluong" value="1" />
                <input type="submit" name="themgiohang" value="Kiểm tra giỏ hàng" class="button"/>



              </fieldset>
            </form>

            <form name="form_logon" method="POST" action ="?quanly=themsanpham">
              <input type="hidden" name="id" value="${row_sp.sanpham_id}" />
              <input type="hidden" name="tensp" value="${row_sp.sanpham_name}" />
              <input type="hidden" name="gia" value="${row_sp.sanpham_giakm}" />
              <input type="hidden" name="img" value="${row_sp.sanpham_image}" />
              <input type="hidden" name="soluong" value="1" />
              <c:if test = "${row_sp.sanpham_soluong > 0}">
              
              <input type="submit" value="Thêm vào giỏ hàng" name="themgiohang" class="button">
              </c:if>

              <c:if test = "${row_sp.sanpham_soluong < 1}">

                <h2 style="color: #e30d0d"> Tạm hết hàng!</h2>
              </c:if>


            </form>


<%--            <% if((request.getParameter("themgiohang1") == null)?false:true){ %>--%>


<%--            <sql:update dataSource = "${snapshot}" var = "count">--%>
<%--              INSERT INTO giohang VALUES ('quest', '${row_sp.sanpham_id}', '${row_sp.sanpham_name}', '${row_sp.sanpham_giakm}','${row_sp.sanpham_image}','1');--%>
<%--            </sql:update>--%>
<%--            <script>--%>
<%--              alert("Thêm ${row_sp.sanpham_name} vào giỏ hàng thành công!")--%>
<%--            </script>--%>

<%--            <% } else { %>--%>




<%--            <form name="form_logon" method="POST" action ="">--%>
<%--              <input type="submit" value="Thêm vào giỏ hàng" name="themgiohang1" class="button">--%>


<%--            </form>--%>
<%--            <% } %>--%>


          </div>
        </div>
      </div>
    </div>




  </div>
</div>
  </c:if>


</c:forEach>

<!-- //Single Page -->