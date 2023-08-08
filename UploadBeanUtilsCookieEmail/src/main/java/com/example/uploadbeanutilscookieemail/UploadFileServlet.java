package com.example.uploadbeanutilscookieemail;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UploadFileServlet", urlPatterns = "/Upload")
@MultipartConfig()
public class UploadFileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Part part = request.getPart("browerFile");
            PrintWriter print = response.getWriter();
            print.println(part.getSubmittedFileName());
    }
}
