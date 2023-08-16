package com.book.dto;

import com.book.dbcontext.DBContext;
import com.book.model.Book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDao {
    public ArrayList<Book> getAllBookData(){
        ArrayList<Book> listBook = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM Product");
            while (rs.next()){
                listBook.add(new Book(rs.getInt("productId"),
                        rs.getString("productName"),
                        rs.getInt("price"),
                        rs.getString("img")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listBook;
    }
}
