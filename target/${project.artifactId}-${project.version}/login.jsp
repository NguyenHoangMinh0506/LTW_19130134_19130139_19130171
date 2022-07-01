<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ include file = "db/connect.jsp" %>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all" />
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js" rel="stylesheet" type="text/css" media="all" />
<link href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js" rel="stylesheet" type="text/css" media="all" />





<div id="content" class="flex">
  <div class="">
    <div class="page-content page-container" id="page-content">
      <div class="padding">
        <div class="row">
          <div class="col-md-6">
            <div class="card">
              <div class="card-header"><strong>Đăng nhập tài khoản của bạn</strong></div>
              <div class="card-body">
                ${error }
                <form method="post" action="${pageContext.request.contextPath }/account">
                  <div class="form-group"><label class="text-muted">Tên đăng nhập</label><input type="text" class="form-control" name="username"> </div>
                  <div class="form-group"><label class="text-muted">Mật khẩu</label><input type="password" class="form-control" name="password"> </div>
                  <div class="form-group">
                    Chưa có tài khoản? <a href="?quanly=login">Đăng kí </a>ngay!
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