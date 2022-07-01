package com.example.testweb.controller;

import com.example.testweb.DAO.GiohangDAO;
import com.example.testweb.DAO.MuaSPDAO;
import com.example.testweb.beans.giohang;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ThemSPController", value = "/ThemSP")
public class AddToCartController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        String user = request.getParameter("user");
        int id = Integer.parseInt(request.getParameter("id"));
        String danhmuc = request.getParameter("danhmuc");
        System.out.println(danhmuc);
        List<giohang> checkSP = GiohangDAO.getInstance().checkSP(user,id);
        int dem = checkSP.size();

        if (dem==0) {
            String tensp = request.getParameter("tensp");
            int gia = Integer.parseInt(request.getParameter("gia"));
            String img = request.getParameter("img");
            String soluong = request.getParameter("soluong");
            String thanhtien = request.getParameter("thanhtien");
            giohang g = MuaSPDAO.getInstance().addItem(user,id,tensp,gia,img,soluong,thanhtien);
            request.getRequestDispatcher("themSP.jsp").forward(request, response);
        }else {
            String link = "chitietSP?danhmuc="+danhmuc+"&id="+id;
            response.sendRedirect(link);
        }






    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);
    }
}
