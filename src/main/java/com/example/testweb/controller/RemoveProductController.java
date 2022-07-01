package com.example.testweb.controller;

import com.example.testweb.DAO.MuaSPDAO;
import com.example.testweb.beans.giohang;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "XoaSPController", value = "/XoaSP")
public class RemoveProductController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String user = request.getParameter("user");
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(user);


        giohang g = MuaSPDAO.getInstance().delItem(user,id);
        request.getRequestDispatcher("XoaSP.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);
    }
}
