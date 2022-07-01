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

@WebServlet(name = "ProductController", value = "/Sanpham")
public class ProductController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        List<Danhmuc> danhmuc = DanhmucDAO.getInstance().getAll();
        request.setAttribute("danhmuc",danhmuc);

        String timkiem = request.getParameter("timkiem");
        int page = Integer.parseInt(request.getParameter("page"));
        List<Product> Pfill1 = ProductDAO.getInstance().PageFill1(page);
        List<Product> Pfill2 = ProductDAO.getInstance().PageFill2(page);
        List<Product> Pfill3 = ProductDAO.getInstance().PageFill3(page);
        List<Product> Pfill4 = ProductDAO.getInstance().PageFill4(timkiem,page);

        System.out.println(timkiem);

        List<Product> fill1 = ProductDAO.getInstance().getFill1();
        List<Product> fill2 = ProductDAO.getInstance().getFill2();
        List<Product> fill3 = ProductDAO.getInstance().getFill3();
        List<Product> fill4 = ProductDAO.getInstance().Search(timkiem);

        List<Product> search = ProductDAO.getInstance().Search(timkiem);
        int searchP = search.size();
        //fill1
        int fill1P = fill1.size();
        int endFill1P = fill1P/6;
        if (fill1P %6 !=0) {
            endFill1P++;
        }
        //fill2
        int fill2P = fill2.size();
        int endFill2P = fill2P/6;
        if (fill2P %6 !=0) {
            endFill2P++;
        }
        //fill3
        int fill3P = fill3.size();
        int endFill3P = fill3P/6;
        if (fill3P %6 !=0) {
            endFill3P++;
        }
        // fill4
        int fill4P = fill4.size();
        int endFill4P = fill4P/6;
        if (fill4P %6 !=0) {
            endFill4P++;
        }
        System.out.println(endFill4P);





        request.setAttribute("endFill1",endFill1P);
        request.setAttribute("endFill2",endFill2P);
        request.setAttribute("endFill3",endFill3P);
        request.setAttribute("endFill4",endFill4P);


        request.setAttribute("fill1",fill1);
        request.setAttribute("Pfill1",Pfill1);
        request.setAttribute("fill2",fill2);
        request.setAttribute("Pfill2",Pfill2);
        request.setAttribute("fill3",fill3);
        request.setAttribute("Pfill3",Pfill3);
        request.setAttribute("fill4",fill4);
        request.setAttribute("fill4P",fill4P);
        request.setAttribute("Pfill4",Pfill4);
        request.setAttribute("search",search);
        request.setAttribute("timkiem",timkiem);


        request.getRequestDispatcher("Sanpham.jsp").forward(request,response);




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);
    }


}
