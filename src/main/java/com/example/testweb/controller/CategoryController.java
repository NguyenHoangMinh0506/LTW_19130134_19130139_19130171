package com.example.testweb.controller;

import com.example.testweb.DAO.DanhmucDAO;
import com.example.testweb.DAO.GiohangDAO;
import com.example.testweb.DAO.ProductDAO;
import com.example.testweb.beans.Danhmuc;
import com.example.testweb.beans.Product;
import com.example.testweb.beans.giohang;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "DanhmucController", value = "/Trangchu")
public class CategoryController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Danhmuc> danhmuc = DanhmucDAO.getInstance().getAll();
        List<Product> product = ProductDAO.getInstance().getAll();
        List<Product> productHot = ProductDAO.getInstance().getAllHot();
        List<Product> productActive = ProductDAO.getInstance().getAllActive();
        List<giohang> g = GiohangDAO.getInstance().getAll();
        request.setAttribute("g",g);
        request.setAttribute("danhmuc",danhmuc);
        request.setAttribute("product",product);
        request.setAttribute("productHot",productHot);
        request.setAttribute("productActive",productActive);

//        request.getRequestDispatcher("includes/menu.jsp").forward(request,response);
        request.getRequestDispatcher("index1.jsp").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);

    }

    public static void main(String[] args) {


    }
}
