package com.example.testweb.controller;

import com.example.testweb.DAO.DanhmucDAO;
import com.example.testweb.DAO.ProductDAO;
import com.example.testweb.beans.Danhmuc;
import com.example.testweb.beans.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "WirelessController", value = "/Danhmuc-3")
public class WiredMouseController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int page = Integer.parseInt(request.getParameter("page"));
        List<Product> productWireLess = ProductDAO.getInstance().getAllWireless();
        List<Danhmuc> danhmuc = DanhmucDAO.getInstance().getAll();
        List<Product> coday = ProductDAO.getInstance().PageCoDay(page);
        request.setAttribute("productWireLess",productWireLess);
        request.setAttribute("danhmuc",danhmuc);

        int pageG = productWireLess.size();
        int pageS = pageG / 6;
        if (pageG%6 !=0) {
            pageS++;
        }
        request.setAttribute("pageS",pageS);
        request.setAttribute("coday",coday);
        request.getRequestDispatcher("CoDay.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request,response);
    }
}
