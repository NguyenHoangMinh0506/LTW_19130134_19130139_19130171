<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ include file = "../db/connect.jsp" %>


<!DOCTYPE html>
<html>
<head>
    <title>Đăng nhập</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="../cssMyAdmin/bootstrap.min.css" rel="stylesheet" type="text/css" media="all" />
    <link href="../cssMyAdmin/beyond.min.css" rel="stylesheet" type="text/css" media="all" />
    <link href="../cssMyAdmin/animate.min.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>



<form action="../LoginControler" method="post">
    <div class="login-container animated fadeInDown">
        <div class="loginbox bg-white">
            <div class="loginbox-title" style="font-family:sans-serif; "></div>
            <div class="loginbox-social">
                <div class="logo">
                    <img id="logo" src="../images/logo_2.png" width="150px" />
                </div>
                <div class="social-title " style="padding-top:10px;color:black;">PHP My Admin</div>
            </div>
            <div class="loginbox-or">
                <div class="or-line"></div>
                <div class="or">-*-</div>
            </div>

            <div class="loginbox-textbox">
                <input type="text" class="form-control" required placeholder="Tên đăng nhập" name="username" id="username" />
            </div>
            <div class="loginbox-textbox">
                <input type="password" class="form-control" required placeholder="Mật khẩu" name="password" id="password" onkeypress="searchKeyPress(event);" />
            </div>


            <div class="loginbox-forgot">
                    <span style="color:red">
                    </span>
            </div>
            <div class="loginbox-submit">
                <input type="submit" class="btn btn-primary btn-block" value="Đăng nhập" onclick="ValidateUser()" />
            </div>
            <div class="loginbox-textbox" align="center" >
                    <span style="color:red" >
                        abc123123123
                    </span>
            </div>
        </div>
    </div>
</form>
</body>
</html>