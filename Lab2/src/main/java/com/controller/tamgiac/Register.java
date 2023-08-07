package com.controller.tamgiac;

import com.model.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(urlPatterns = "/Register")
public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String gender = request.getParameter("rdoGender");
        String national = request.getParameter("country");
        User user = new User(username,password,gender,national);
        request.setAttribute("user",user);
        RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
        rd.forward(request,response);
    }
}
