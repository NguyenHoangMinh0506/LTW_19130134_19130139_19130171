<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file = "db/connect.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>



<!DOCTYPE html>
<html lang="zxx">

<head>
    <title>Mouse Shop</title>
    <!-- Meta tag Keywords -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8" />
    <meta name="keywords" content="Electro Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design"
    />
    <script>
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
    <!-- //Meta tag Keywords -->

    <!-- Custom-Files -->
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <!-- Bootstrap css -->
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
    <!-- Main css -->
    <link rel="stylesheet" href="css/fontawesome-all.css">
    <!-- Font-Awesome-Icons-CSS -->
    <link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
    <!-- pop-up-box -->
    <link href="css/menu.css" rel="stylesheet" type="text/css" media="all" />
    <!-- menu style -->
    <!-- //Custom-Files -->

    <!-- web fonts -->
    <link href="//fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700,700i,900,900i&amp;subset=latin-ext" rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese"
          rel="stylesheet">
    <!-- //web fonts -->

</head>

<c:if test="${sessionScope.username == null}">
    <script type="text/javascript">
        alert("Vui lòng đăng nhập để tiếp tục!")

        window.location = "Login";

    </SCRIPT>
</c:if>

<body>


<%--stat top bar--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<div class="agile-main-top">
    <div class="container-fluid">
        <div class="row main-top-w3l py-2">
            <div class="col-lg-4 header-most-top">
                <p class="text-white text-lg-left text-center">Cửa hàng chuột uy tín số 1 thế giới
                    <i class="fas fa-shopping-cart ml-1"></i>
                </p>
            </div>
            <div class="col-lg-8 header-right mt-lg-0 mt-2">
                <!-- header lists -->
                <ul>

                    <li class="text-center  text-white">

                        <i class="fas fa-truck mr-2"></i>Kiểm tra vận chuyển</a>
                    </li>
                    <li class="text-center  text-white">
                        <i class="fas fa-phone mr-2"></i> 083 8883 388
                    </li>
                    <c:if test="${sessionScope.username == null}" >
                        <li class="text-center b text-white">
                            <a class="nav-link" href="Login">Đăng nhập</a>
                        </li>
                        <li class="text-center text-white">
                            <a class="nav-link" href="SignUp">Đăng kí</a>
                        </li>

                    </c:if>
                    <c:if test="${sessionScope.username != null}" >
                        <li class="text-center b text-white">
                            <a>Chào: ${sessionScope.username}</a>
                        </li>
                        <c:if test="${sessionScope.username == 'admin'}">
                            <li class="text-center b text-white">
                                <a class="nav-link" href="">Quản lý</a>
                            </li>
                        </c:if>
                        <li class="text-center text-white">
                            <a href="${pageContext.request.contextPath}/Login?action=logout">Đăng xuất</a>

                        </li>

                    </c:if>

                </ul>
                <!-- //header lists -->
            </div>
        </div>
    </div>
</div>

<!-- Button trigger modal(select-location) -->


<!-- modals -->
<!-- log in -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">

                <a class="nav-link" href="?quanly=login">Đăng nhập</a>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form action="#" method="post">
                    <div class="form-group">
                        <label class="col-form-label">Username</label>
                        <input type="text" class="form-control" placeholder=" " name="Name" required="">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Password</label>
                        <input type="password" class="form-control" placeholder=" " name="Password" required="">
                    </div>
                    <div class="right-w3l">
                        <input type="submit" class="form-control" value="Log in">
                    </div>
                    <div class="sub-w3l">
                        <div class="custom-control custom-checkbox mr-sm-2">
                            <input type="checkbox" class="custom-control-input" id="customControlAutosizing">
                            <label class="custom-control-label" for="customControlAutosizing">Remember me?</label>
                        </div>
                    </div>
                    <p class="text-center dont-do mt-3">Don't have an account?
                        <a href="#" data-toggle="modal" data-target="#exampleModal2">
                            Register Now</a>
                    </p>
                </form>
            </div>
        </div>
    </div>
</div>
<!-- register -->
<div class="modal fade" id="exampleModal2" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Register</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form action="#" method="post">
                    <div class="form-group">
                        <label class="col-form-label">Your Name</label>
                        <input type="text" class="form-control" placeholder=" " name="Name" required="">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Email</label>
                        <input type="email" class="form-control" placeholder=" " name="Email" required="">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Password</label>
                        <input type="password" class="form-control" placeholder=" " name="Password" id="password1" required="">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Confirm Password</label>
                        <input type="password" class="form-control" placeholder=" " name="Confirm Password" id="password2" required="">
                    </div>
                    <div class="right-w3l">
                        <input type="submit" class="form-control" value="Register">
                    </div>
                    <div class="sub-w3l">
                        <div class="custom-control custom-checkbox mr-sm-2">
                            <input type="checkbox" class="custom-control-input" id="customControlAutosizing2">
                            <label class="custom-control-label" for="customControlAutosizing2">I Accept to the Terms & Conditions</label>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<!-- //modal -->
<!-- //top-header -->

<!-- header-bottom-->
<div class="header-bot">
    <div class="container">
        <div class="row header-bot_inner_wthreeinfo_header_mid">
            <!-- logo -->
            <div class="col-md-3 logo_agile">
                <h1 class="text-center">
                    <a href="Trangchu" class="font-weight-bold font-italic">
                        <img src="images/logo_Mouse_Shop.png" alt=" " class="img-fluid">Mouse Store
                    </a>
                </h1>
            </div>
            <!-- //logo -->
            <!-- header-bot -->
            <div class="col-md-9 header mt-4 mb-md-0 mb-4">
                <div class="row">
                    <!-- search -->
                    <div class="col-10 agileits_search">
                        <form class="form-inline" action="Sanpham?fill=4" method="post">
                            <input class="form-control mr-sm-2" name="timkiem" type="search" placeholder="Tìm kiếm" aria-label="Search" required>
                            <button class="btn my-2 my-sm-0" type="submit">Tìm kiếm</button>
                        </form>
                    </div>
                    <!-- //search -->

                </div>
            </div>
        </div>
    </div>
</div>

<%--end top bar--%>

<%--start menu--%>

<div class="navbar-inner">
    <div class="container">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto text-center mr-xl-5">
                    <li class="nav-item active mr-lg-2 mb-lg-0 mb-2">
                        <a class="nav-link" href="Trangchu">Trang chủ
                            <span class="sr-only">(current)</span>
                        </a>
                    </li>


                    <c:forEach var="danhmuc" items="${danhmuc}">
                        <a class="nav-link" href="Danhmuc-${danhmuc.stt_nha_san_xuat}?page=1">${danhmuc.nha_san_xuat}</a>
                    </c:forEach>


                    <li class="nav-item mr-lg-2 mb-lg-0 mb-2">
                        <a class="nav-link" href="about.html">Về chúng tôi</a>
                    </li>

                    <li class="nav-item dropdown mr-lg-2 mb-lg-0 mb-2">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Khách hàng
                        </a>
                        <div class="dropdown-menu">

                            <a class="dropdown-item" href="Giohang">Kiểm tra giỏ hàng</a>
                            <a class="dropdown-item" href="Damua">Sản phẩm đã mua</a>
                            <a class="dropdown-item" href="DonHang">Đơn hàng đã đặt</a>
                            <a class="dropdown-item" href="ChangePass">Đổi mật khẩu</a>
                        </div>
                    </li>
                    <li class="nav-item">



                    </li>
                </ul>
            </div>
        </nav>
    </div>
</div>

<%--end menu--%>



<!-- checkout page -->
<div class="privacy py-sm-5 py-4">
    <div class="container py-xl-4 py-lg-2">
        <!-- tittle heading -->
        <h3 class="tittle-w3l text-center mb-lg-5 mb-sm-4 mb-3">
            <span>Giỏ hàng</span>
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


                   
                        <c:set var = "salary" scope = "session" value ="${giohangSum}"/>



                    <c:forEach var = "row_giohang" items = "${g}">


                        <tr class="rem1">

                        <td class="invert-image">
                            <a href="single.html">
                                <img src="images/${row_giohang.hinhanh}" alt=" " class="img-responsive">
                            </a>
                        </td>
                            <td class="invert">
                                <div class="rem">


                                    <form action="Capnhat" method="post" class="delete" accept-charset="utf-8">
                                        <input type="number" min="1" name="soluong" class="text-center" value="${row_giohang.soluong}">
                                        <input type="hidden" name="user" value="${sessionScope.username}" />
                                        <input type="hidden" name="id" value="${row_giohang.sanpham_id}" />
                                        <button class="delete" name="capnhat" value="${row_giohang.sanpham_id}">Cập nhật</button>


                                    </form>
                                </div>
                            </td>
                            <c:set var = "salary1" scope = "session" value ="${row_giohang.sanpham_id}"/>


                        <td class="invert">${row_giohang.tensp}</td>
                        <td class="invert"><fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${row_giohang.thanhtien}"  /> đ</td>

                        <td class="invert">
                            <div class="rem">


                                <form name="form_logon" method="POST" action ="XoaSP" accept-charset="utf-8">
                                    <input type="hidden" name="user" value="${sessionScope.username}" />
                                    <input type="hidden" name="id" value="${row_giohang.sanpham_id}" />

                                    <input type="submit" value="Xóa" name="xoa" class="button">


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
                <form action="ThanhToan" method="post" class="creditly-card-form agileinfo_form" accept-charset="utf-8">

                    <c:forEach var="i" items="${g}">

                        <c:set var = "sanpham" scope = "request" value ="${sanpham}| ${i.tensp} SL:${i.soluong} |"/>
                    </c:forEach>


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

<%--                                tao id ngau nhien--%>
                                
                                <%
                                    Random rand = new Random();
                                    int n = rand.nextInt(90000000) + 10000000;

                                %>
                                <input type="hidden" name="sanpham" value="${sanpham}">
                                <input type="hidden" name="ID" value="<%=n%>">
                                <input type="hidden" name="tongtien" value="${salary}">
                                <input type="hidden" name="trangthai" value="danggiao">

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
<%@ include file = "includes/footer.jsp" %>
<script src="js/jquery-2.2.3.min.js"></script>
<!-- //jquery -->

<!-- nav smooth scroll -->
<script>
    $(document).ready(function () {
        $(".dropdown").hover(
            function () {
                $('.dropdown-menu', this).stop(true, true).slideDown("fast");
                $(this).toggleClass('open');
            },
            function () {
                $('.dropdown-menu', this).stop(true, true).slideUp("fast");
                $(this).toggleClass('open');
            }
        );
    });
</script>
<!-- //nav smooth scroll -->

<!-- popup modal (for location)-->
<script src="js/jquery.magnific-popup.js"></script>
<script>
    $(document).ready(function () {
        $('.popup-with-zoom-anim').magnificPopup({
            type: 'inline',
            fixedContentPos: false,
            fixedBgPos: true,
            overflowY: 'auto',
            closeBtnInside: true,
            preloader: false,
            midClick: true,
            removalDelay: 300,
            mainClass: 'my-mfp-zoom-in'
        });

    });
</script>
<!-- //popup modal (for location)-->

<!-- cart-js -->
<script src="js/minicart.js"></script>
<script>
    paypals.minicarts.render(); //use only unique class names other than paypals.minicarts.Also Replace same class name in css and minicart.min.js

    paypals.minicarts.cart.on('checkout', function (evt) {
        var items = this.items(),
            len = items.length,
            total = 0,
            i;

        // Count the number of each item in the cart
        for (i = 0; i < len; i++) {
            total += items[i].get('quantity');
        }

        if (total < 3) {
            alert('The minimum order quantity is 3. Please add more to your shopping cart before checking out');
            evt.preventDefault();
        }
    });
</script>
<!-- //cart-js -->

<!-- password-script -->
<script>
    window.onload = function () {
        document.getElementById("password1").onchange = validatePassword;
        document.getElementById("password2").onchange = validatePassword;
    }

    function validatePassword() {
        var pass2 = document.getElementById("password2").value;
        var pass1 = document.getElementById("password1").value;
        if (pass1 != pass2)
            document.getElementById("password2").setCustomValidity("Passwords Don't Match");
        else
            document.getElementById("password2").setCustomValidity('');
        //empty string means no validation error
    }
</script>
<!-- imagezoom -->
<script src="js/imageoom.js"></script>
<!-- //imagezoom -->

<!-- flexslider -->
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />

<script src="js/jquery.flexslider.js"></script>
<!-- scroll seller -->
<script src="js/scroll.js"></script>
<!-- //scroll seller -->
<script>
    // Can also be used with $(document).ready()
    $(window).load(function () {
        $('.flexslider').flexslider({
            animation: "slide",
            controlNav: "thumbnails"
        });
    });
</script>
<!-- //FlexSlider-->
<!-- //password-script -->


<script>
    jQuery(document).ready(function ($) {
        $(".scroll").click(function (event) {
            event.preventDefault();

            $('html,body').animate({
                scrollTop: $(this.hash).offset().top
            }, 1000);
        });
    });
</script>
<!-- //end-smooth-scrolling -->

<!-- smooth-scrolling-of-move-up -->
<script>
    $(document).ready(function () {
        /*
        var defaults = {
            containerID: 'toTop', // fading element id
            containerHoverID: 'toTopHover', // fading element hover id
            scrollSpeed: 1200,
            easingType: 'linear'
        };
        */
        $().UItoTop({
            easingType: 'easeOutQuart'
        });

    });
</script>
<!-- //smooth-scrolling-of-move-up -->

<!-- for bootstrap working -->
<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->
<!-- //js-files -->
</body>

</html>