package com.example.testweb.controller;

import com.example.testweb.DAO.MuaSPDAO;
import com.example.testweb.beans.giohang;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CapnhatSP", value = "/Capnhat")
public class UpdateCartController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String user = request.getParameter("user");
        String soluong = request.getParameter("soluong");
        int id = Integer.parseInt(request.getParameter("id"));

        giohang g = MuaSPDAO.getInstance().updateItem(user,soluong,id);
        request.getRequestDispatcher("CapNhat.jsp").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);
    }
}
