package com.book.dto;

import com.book.model.Book;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BookDao dao = new BookDao();
        ArrayList<Book> list = dao.getAllBook();
        for (Book x:dao.getAllBook()
        ) {
            System.out.println(x.getName());
        }
    }
}
