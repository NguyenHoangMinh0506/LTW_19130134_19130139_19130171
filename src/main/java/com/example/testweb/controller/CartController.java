package com.example.testweb.controller;

import com.example.testweb.DAO.DanhmucDAO;
import com.example.testweb.DAO.GiohangDAO;
import com.example.testweb.beans.Danhmuc;
import com.example.testweb.beans.giohang;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "GiohangController", value = "/Giohang")
public class CartController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = (String) request.getSession(true).getAttribute("username");

        List<Danhmuc> danhmuc = DanhmucDAO.getInstance().getAll();
        List<giohang> g = GiohangDAO.getInstance().getAll();
        List<giohang> giohangUser = GiohangDAO.getInstance().getByUser(user);
        Integer giohangSum = GiohangDAO.getInstance().Sum(user);


//
        request.setAttribute("giohangSum",giohangSum);
        request.setAttribute("g",giohangUser);
        request.setAttribute("gAll",g);
        request.setAttribute("danhmuc",danhmuc);
        request.getRequestDispatcher("giohang.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request,response);
    }
}
