package com.example.testweb.controller;

import com.example.testweb.DAO.DanhmucDAO;
import com.example.testweb.DAO.GiohangDAO;
import com.example.testweb.DAO.KhachHangDAO;
import com.example.testweb.beans.Danhmuc;
import com.example.testweb.beans.KhachHang;
import com.example.testweb.beans.giohang;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DonHangDaDatController", value = "/DonHang")
public class OrderController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = (String) request.getSession(true).getAttribute("username");

        List<Danhmuc> danhmuc = DanhmucDAO.getInstance().getAll();
        List<giohang> g = GiohangDAO.getInstance().getAll();
        List<KhachHang> k = KhachHangDAO.getInstance().getByUser(user);


//

        request.setAttribute("k",k);

        request.setAttribute("danhmuc",danhmuc);
        request.getRequestDispatcher("donhang.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);
    }
}
