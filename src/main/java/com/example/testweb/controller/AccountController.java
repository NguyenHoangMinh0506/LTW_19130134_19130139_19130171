package com.example.testweb.controller;

import com.example.testweb.DAO.AccountDAO;
import com.example.testweb.beans.Account;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class AccountController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public AccountController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String action = request.getParameter("action");
        if (action == null) {
            request.getRequestDispatcher("login.jsp").forward(request, response);


        } else {
            if (action.equalsIgnoreCase("logout")) {
                session.removeAttribute("username");
                response.sendRedirect("Trangchu");
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = request.getParameter("username").trim();
        String password = request.getParameter("password").trim();

        Account a = AccountDAO.getInstance().login(username,password);



        if (a != null) {
            session.setAttribute("username", username);
//            request.getRequestDispatcher("index.jsp").forward(request, response);
            response.sendRedirect("Trangchu");
        } else {
            request.setAttribute("error", "Tài khoảng hoặc mật khẩu không chính xác");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

}
