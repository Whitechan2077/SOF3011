package com.example.lab3;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

@WebServlet(name = "Upload", value = "/upload")
@MultipartConfig()
public class Upload extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Part photo = request.getPart("filePhoto");
        String fileName = photo.getSubmittedFileName();
        String realPath = request.getServletContext().getRealPath("/image");

        if (!Files.exists(Path.of(realPath))){
            Files.createDirectories(Path.of(realPath));
        }
        photo.write(realPath+"/"+fileName);
        request.setAttribute("path",realPath);
        request.setAttribute("img",fileName);
        request.setAttribute("name",name);
        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request,response);
    }
}
