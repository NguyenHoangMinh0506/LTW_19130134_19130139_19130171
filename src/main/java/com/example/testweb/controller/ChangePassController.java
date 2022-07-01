package com.example.testweb.controller;

import com.example.testweb.beans.Account;
import com.example.testweb.ChangePassAccount;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ChangePassController", value = "/ChangePass")
public class ChangePassController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String user = (String) request.getSession(true).getAttribute("username");
        String pass = request.getParameter("password");
        String newPass = request.getParameter("new_pass");
        Account a = ChangePassAccount.getInstance().checkAccount(pass,user);

        if (a == null) {
            if (pass == null) {
                request.getRequestDispatcher("changePass.jsp").forward(request,response);
            }else {
                request.setAttribute("error", "Mật khẩu không chính xác!");
                request.getRequestDispatcher("changePass.jsp").forward(request, response);
            }
        }
        else {
            request.setAttribute("error", "Thay đổi mật khẩu thành công!");
            Account acc = ChangePassAccount.getInstance().changePass(newPass,user);
            request.getRequestDispatcher("changePass.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);
    }
}
