package com.book.dto;

import com.book.DBContecxt.DBContext;
import com.book.model.Book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDao {
    Connection conn = null;
    Statement stm = null;
    ResultSet rs= null;
    public ArrayList<Book> getAllBook(){
        ArrayList<Book> listBook = new ArrayList<>();
        try {
             conn = DBContext.getConnection();
            stm = conn.createStatement();
             rs = stm.executeQuery("SELECT * FROM Product");
            while (rs.next()){
                listBook.add(new Book(rs.getInt("productId"),
                        rs.getString("productName"),
                        rs.getInt("price"),
                        rs.getString("img")));
            }
            conn.close();
            stm.close();
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listBook;
    }

}
