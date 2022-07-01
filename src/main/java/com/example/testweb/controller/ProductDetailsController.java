package com.example.testweb.controller;

import com.example.testweb.DAO.DanhmucDAO;
import com.example.testweb.DAO.GiohangDAO;
import com.example.testweb.DAO.ProductDAO;
import com.example.testweb.DAO.ThongTinSPDAO;
import com.example.testweb.beans.Danhmuc;
import com.example.testweb.beans.Product;
import com.example.testweb.beans.ThongTinSP;
import com.example.testweb.beans.giohang;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "chiTietSPController", value = "/chitietSP")
public class ProductDetailsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = (String) request.getSession(true).getAttribute("username");
        int ID = Integer.parseInt(request.getParameter("id"));
        String id = request.getParameter("id");
        String dm = request.getParameter("danhmuc");
        List<Danhmuc> danhmuc = DanhmucDAO.getInstance().getAll();
        Product p = ProductDAO.getInstance().getById(id);
        ThongTinSP tt = ThongTinSPDAO.getInstance().getByDanhMuc(dm);
        List<giohang> checkSP = GiohangDAO.getInstance().checkSP(user,ID);
        int dem = checkSP.size();

        request.setAttribute("danhmuc",danhmuc);
        request.setAttribute("dem",dem);
        request.setAttribute("row_sp",p);
        request.setAttribute("tt",tt);
        request.getRequestDispatcher("chitietsp.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request,response);
    }
}
