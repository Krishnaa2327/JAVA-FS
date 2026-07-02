package com.mmcoe.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.mmcoe.pojo.Book;

import jdbc.pro.JdbcFactory;

public class BookDaoJdbcImpl implements BookDao {
	

    @Override
    public boolean save(Book b) {
        String sql = "INSERT INTO book VALUES (?, ?, ?, ?)";

        try (Connection conn = JdbcFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, b.getIsbn());
            stmt.setString(2, b.getTitle());
            stmt.setString(3, b.getAuthor());
            stmt.setDouble(4, b.getPrice());
            return stmt.executeUpdate() > 0;

        } catch (SQLException | IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    

    @Override
    public Optional<Book> find(int isbn) {
        String sql = "SELECT * FROM book WHERE isbn = ?";
        try (Connection conn = JdbcFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, isbn);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {

                Book b = new Book();
                b.setIsbn(rs.getInt("isbn"));
                b.setTitle(rs.getString("title"));
                b.setAuthor(rs.getString("author"));
                b.setPrice(rs.getDouble("price"));
                return Optional.of(b);
            }
            return Optional.empty();

        } catch (SQLException | IOException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
    

    @Override
    public List<Book> list() {
        List<Book> books = new ArrayList<>();
        String sql = "SELECT * FROM book";
        try (Connection conn = JdbcFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Book b = new Book();
                b.setIsbn(rs.getInt("isbn"));
                b.setTitle(rs.getString("title"));
                b.setAuthor(rs.getString("author"));
                b.setPrice(rs.getDouble("price"));
                books.add(b);
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return books;
    }

    
    @Override
    public boolean delete(int isbn) {
        String sql = "DELETE FROM book WHERE isbn = ?";
        try (Connection conn = JdbcFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, isbn);
            return stmt.executeUpdate() > 0;

        } catch (SQLException | IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    
    @Override
    public List<Book> findByPrice(double min, double max) {
        List<Book> books = new ArrayList<>();
        String sql = "SELECT * FROM book WHERE price BETWEEN ? AND ?";

        try (Connection conn = JdbcFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, min);
            stmt.setDouble(2, max);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Book b = new Book();
                b.setIsbn(rs.getInt("isbn"));
                b.setTitle(rs.getString("title"));
                b.setAuthor(rs.getString("author"));
                b.setPrice(rs.getDouble("price"));
                books.add(b);
            }

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return books;
    }
}