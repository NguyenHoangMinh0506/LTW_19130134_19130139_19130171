package com.example.testweb.controller;

import com.example.testweb.DAO.GiohangDAO;
import com.example.testweb.beans.giohang;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ThanhToanController", value = "/ThanhToan")
public class PaymentController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        String ten = request.getParameter("name");
        String sdt = request.getParameter("number");
        String diachi = request.getParameter("city");
        String ID = request.getParameter("ID");
        String sanpham = request.getParameter("sanpham");
        String tong_tien = request.getParameter("tongtien");
        String trangthai = request.getParameter("trangthai");
        Integer soluong = GiohangDAO.getInstance().getSoLuongSP(ID);
        System.out.println(soluong);
        System.out.println(ID);

        String user = (String) request.getSession(true).getAttribute("username");
        System.out.println(user);

        List<giohang> giohangUser = GiohangDAO.getInstance().getByUser(user);

        int dem = giohangUser.size();


            if (dem >= 1) {

                request.setAttribute("ID",ID);
                giohang addUser = GiohangDAO.getInstance().addInfoKhachHang(user,ten,sdt,diachi,ID,sanpham,tong_tien,trangthai);
                giohang thanhtoan = GiohangDAO.getInstance().addFromGiohangToDaban(user);
                List<giohang> updateLaiGioHang = GiohangDAO.getInstance().UpdateLaiSanPham(user);
                request.getRequestDispatcher("thanhtoan.jsp").forward(request,response);
                List<giohang> del = GiohangDAO.getInstance().DelByUser(user);
            }else {

                response.sendRedirect("Giohang");

            }





    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);
    }
}
