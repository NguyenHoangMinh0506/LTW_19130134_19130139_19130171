<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!-- top Products -->
<!DOCTYPE html>
<html lang="zxx">

<head>
  <title>Mouse Shop</title>
  <!-- Meta tag Keywords -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta charset="UTF-8" />
  <meta name="keywords" content="Mouse Store"
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

  <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
  <!-- Bootstrap css -->
  <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
  <!-- Main css -->
  <link rel="stylesheet" href="css/fontawesome-all.css">
  <!-- Font-Awesome-Icons-CSS -->
  <link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
  <!-- pop-up-box -->
  <link href="css/menu.css" rel="stylesheet" type="text/css" media="all" />
  <link href="css/centerShop.css" rel="stylesheet" type="text/css" media="all" />
  <!-- menu style -->
  <!-- //Custom-Files -->

  <!-- web fonts -->
  <link href="//fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700,700i,900,900i&amp;subset=latin-ext" rel="stylesheet">
  <link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese"
        rel="stylesheet">
  <!-- //web fonts -->
</head>

<body>
<%--cssShop--%>
<link href="css/centerShop.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- Bootstrap css -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- Main css -->
<link rel="stylesheet" href="css/fontawesome-all.css">
<!-- Font-Awesome-Icons-CSS -->
<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
<!-- pop-up-box -->
<link href="css/menu.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/centerShop.css" rel="stylesheet" type="text/css" media="all" />
<!-- menu style -->
<!-- //Custom-Files -->

<!-- web fonts -->
<link href="//fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700,700i,900,900i&amp;subset=latin-ext" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese"
      rel="stylesheet">
<!-- //web fonts -->

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
              <a href="${pageContext.request.contextPath}/account?action=logout">Đăng xuất</a>

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
            <form class="form-inline" action="Sanpham?fill=4&page=1" method="post">
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
            <a class="nav-link" href="About">Về chúng tôi</a>
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


<div class="banner-bootom-w3-agileits py-0">
  <div class="container py-xl-0 py-lg-2">



<div id="content" class="flex">
  <div class="">
    <div class="page-content page-container" id="page-content">
      <div class="padding">
        <div class="row">
          <div class="col-md-3">
          </div>
          <div class="col-md-6">
            <div class="card">
              <div class="card-header"><strong>Đăng nhập tài khoản của bạn</strong></div>
              <div class="card-body">
                ${error }
                <form method="post" action="${pageContext.request.contextPath}/Login">
                  <div class="form-group"><label class="text-muted">Tên đăng nhập</label><input type="text" class="form-control" name="username"> </div>
                  <div class="form-group"><label class="text-muted">Mật khẩu</label><input type="password" class="form-control" name="password"> </div>
                  <div class="form-group">
                    Chưa có tài khoản? <a href="SignUp">Đăng kí </a>ngay!
                  </div> <button type="submit" class="btn btn-primary">Đăng nhập</button>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>