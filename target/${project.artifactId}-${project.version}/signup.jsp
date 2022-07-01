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
              <div class="card-header"><strong>Đăng kí tài khoản</strong></div>
              <div class="card-body">

                <form method="post" action="SignUp">
                  ${error }
                  <div class="form-group"><label class="text-muted">Tên của bạn</label><input type="text" class="form-control" name="fullname"> </div>

                  <div class="form-group"><label class="text-muted">Tên đăng nhập</label><input type="text" class="form-control" name="username"> </div>
                  <div class="form-group"><label class="text-muted">Mật khẩu</label><input type="text" class="form-control" name="password"> </div>
                  <div class="form-group"><label class="text-muted">Nhập lại mật khẩu</label><input type="text" class="form-control" name="rePass"> </div>
                  <div class="form-group"><label class="text-muted">Email</label><input type="text" class="form-control" name="email"> </div>

                  <div class="form-group">Đã có tài khoản<a href="?quanly=login">Đăng nhập ngay</a>ngay!
                  </div> <button type="submit" class="btn btn-primary">Đăng kí</button>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>