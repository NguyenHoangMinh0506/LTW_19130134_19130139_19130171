<sql:update dataSource = "${snapshot}" var = "capnhat">
  UPDATE giohang SET soluong = '${param.soluong}', thanhtien = '${param.soluong}' *giasp WHERE sanpham_id = '${param.capnhat}' AND giohang_id = '${sessionScope.username}';
</sql:update>
<script type="text/javascript">
  window.location.href = "?quanly=giohang"
</script>