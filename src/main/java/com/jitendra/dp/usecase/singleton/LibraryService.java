package com.jitendra.dp.usecase.singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Class provides book services ues the singleton class
public class LibraryService {
    public void listBooks() {
        String query = "SELECT id, title, author, year_of_publish, price,  FROM books";
       // uses singleton DBConnectionManager instance
        try (Connection conn = DBConnectionManager.getInstance().getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            System.out.println("List of Books >>> ");
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                int year = rs.getInt("year_of_publish");
                double price = rs.getDouble("price");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
