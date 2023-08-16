package com.book.controller;

import com.book.dto.BookDao;
import com.book.model.Book;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
@WebServlet(urlPatterns = "/home")
public class Home extends HttpServlet {
    private BookDao dao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        dao = new BookDao();
        ArrayList<Book> list = new ArrayList<>();
        list = dao.getAllBook();
        req.setAttribute("list",list);
        req.getRequestDispatcher("/view/home/home.jsp").forward(req,resp);
    }
}
