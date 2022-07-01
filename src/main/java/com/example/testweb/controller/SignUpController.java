package com.example.testweb.controller;


import com.example.testweb.DAO.AccountDAO;
import com.example.testweb.beans.Account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SignUp", value = "/SignUp")
public class SignUpController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            String user = request.getParameter("username");
            String pass = request.getParameter("password");
            String email = request.getParameter("email");
            String fullname = request.getParameter("fullname");

            Account a = AccountDAO.getInstance().checkAccountExist(user);
            if(a == null){
                if (user == null) {
                    request.getRequestDispatcher("signup.jsp").forward(request,response);
                }else {
                    AccountDAO.getInstance().register(user, pass, email, fullname);
                    Account ac = AccountDAO.getInstance().login(user, pass);
                    HttpSession session = request.getSession();
                    session.setAttribute("acc", ac);
                    request.setAttribute("error", "Đăng kí tài khoản thành công!");
                    request.getRequestDispatcher("signup.jsp").forward(request, response);
                }


            }else{
                request.setAttribute("user", user);
                request.setAttribute("email", email);
                request.setAttribute("error", "Tài khoản đã tồn tại!");
                request.getRequestDispatcher("signup.jsp").forward(request,response);
            }
        }catch (Exception e){

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);

    }
}
