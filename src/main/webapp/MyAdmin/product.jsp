<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<table border="1">
    <tr>
        <th colspan="9">DANH SÁCH SẢN PHẨM</th>
    </tr>
    <th>ID sản phẩm</th>
    <th>Loại sản phẩm</th>
    <th>Tên sản phẩm</th>
    <th>Giá gốc</th>
    <th>Giá khuyến mãi</th>
    <th>Số lượng</th>
    <th>Hình ảnh</th>
    <th>Xóa</th>
    <th>Chỉnh sửa</th>


    <c:forEach var = "sanpham_row" items = "${sanpham.rows}">
        <tr>
            <td>${sanpham_row.sanpham_id}</td>
            <td>${sanpham_row.danhmuc_id}</td>
            <td>${sanpham_row.sanpham_name}</td>
            <td>${sanpham_row.sanpham_gia}</td>
            <td>${sanpham_row.sanpham_giakm}</td>
            <td>${sanpham_row.sanpham_soluong}</td>
            <td><img src="../images/${sanpham_row.sanpham_image}" width="60" height="60" alt=" " class="img-responsive"></td>
            <td>

                <form action="">
                    <button type="submit" class="fas fa-trash text-danger">Xóa</button>
                </form>
            </td>
            <td>

                <form action="">
                    <button type="submit" class="fas fa-trash text-danger">Chỉnh sửa</button>
                </form>
            </td>

        </tr>
    </c:forEach>



</table>