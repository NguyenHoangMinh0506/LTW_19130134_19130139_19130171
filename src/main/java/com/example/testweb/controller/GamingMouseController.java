package com.example.testweb.controller;

import com.example.testweb.DAO.DanhmucDAO;
import com.example.testweb.DAO.ProductDAO;
import com.example.testweb.beans.Danhmuc;
import com.example.testweb.beans.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "GamingController", value = "/Danhmuc-1")
public class GamingMouseController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int page = Integer.parseInt(request.getParameter("page"));
        List<Product> productGaming = ProductDAO.getInstance().getAllGaming();
        List<Danhmuc> danhmuc = DanhmucDAO.getInstance().getAll();
        List<Product> gaming = ProductDAO.getInstance().PageGaming(page);
        request.setAttribute("productGaming",productGaming);
        request.setAttribute("danhmuc",danhmuc);


        int pageG = productGaming.size();
        int pageS = pageG / 6;
        if (pageG%6 !=0) {
            pageS++;
        }
        System.out.println(pageS);
        request.setAttribute("pageS",pageS);
        request.setAttribute("gaming",gaming);

        request.getRequestDispatcher("Gaming.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request,response);
    }
}
