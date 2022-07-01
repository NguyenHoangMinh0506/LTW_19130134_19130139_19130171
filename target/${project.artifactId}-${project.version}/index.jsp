<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file = "db/connect.jsp" %>
<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");

%>

<%@ page language="java" contentType="text/html; charset=UTF-8" %>



<!DOCTYPE html>
<html lang="zxx">

<head>
    <title>Mouse Shop</title>
    <!-- Meta tag Keywords -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8" />


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



<body>
<c:set var = "name_Login" scope = "session" value ="${sessionScope.username }"/>



<!-- chon nha san xuat -->
<sql:query dataSource = "${snapshot}" var = "chon_nha_san_xuat">
    SELECT * from nha_san_xuat;
</sql:query>
<c:choose>
<c:when test="${sessionScope.username == null}">
    <%@ include file = "includes/topbar.jsp" %>

</c:when>
    <c:when test="${sessionScope.username != null}">
        <%@ include file = "includes/topbarLogin.jsp" %>

    </c:when>
</c:choose>


<%--<%@ include file = "includes/topbar.jsp" %>--%>
<%@ include file = "includes/menu.jsp" %>
<%--<%@ include file = "includes/slider.jsp" %>--%>


<c:choose>
    <c:when test="${param.quanly == 'login'}">
        <%@ include file = "login.jsp" %>

    </c:when>
    <c:when test="${param.quanly == 'signup'}">
        <%@ include file = "signup.jsp" %>

    </c:when>
    <c:when test="${param.quanly == 'danhmuc'}">
        <%@ include file = "danhmuc.jsp" %>

    </c:when>
    <c:when test="${param.quanly == 'giohangUpdate'}">
        <%@ include file = "controller/xoa_san_pham.jsp" %>

    </c:when>
    <c:when test="${param.quanly == 'capnhatgiohang'}">
        <%@ include file = "controller/cap_nhat_gio_hang.jsp" %>

    </c:when>
    <c:when test="${param.quanly == 'themsanpham'}">
        <%@ include file = "controller/them_san_pham.jsp" %>

    </c:when>
    <c:when test="${param.quanly == 'giohang'}">
        <c:if test = "${sessionScope.username == null}">
            <script type="text/javascript">
                alert("Vui lòng đăng nhập để tiếp tục!")
                window.location.href = "login.jsp"
            </script>
        </c:if>
        <c:if test = "${sessionScope.username != null}">
            <%@ include file = "giohang.jsp" %>
        </c:if>


    </c:when>
    <c:when test="${param.quanly == 'chitietsp'}">
    <%@ include file = "chitietsp.jsp" %>

    </c:when>

    <c:when test="${param.quanly == 'giohang'}">
        <%@ include file = "giohang.jsp" %>

    </c:when>

    <c:when test="${param.quanly == 'thanhtoan'}">
        <%@ include file = "thanhtoan.jsp" %>

    </c:when>




    <c:otherwise>
        <%@ include file = "includes/home.jsp" %>
        <br />
    </c:otherwise>
</c:choose>




<%@ include file = "includes/footer.jsp" %>



<!-- jquery -->
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
<%--<script src="js/minicart.js"></script>--%>
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
<script src="js/imagezoom.js"></script>
<!-- //imagezoom -->

<!-- flexslider -->
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />

<script src="js/jquery.flexslider.js"></script>
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