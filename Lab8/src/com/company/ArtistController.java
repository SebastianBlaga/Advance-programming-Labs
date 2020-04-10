package com.company;

import java.sql.*;

public class ArtistController {
    Connection conn;

    public ArtistController(Connection conn) {
        this.conn = conn;
    }

    public void create(String name, String country){
        try {
            String sql = "INSERT INTO artists (name, country) values(?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, country);
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findByName(String name){
        try {
            String sql = "SELECT * FROM artists WHERE name = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            ResultSet resultSet = pstmt.executeQuery(sql);
            while(resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " "
                        + resultSet.getString("name") + " "
                        + resultSet.getString("country"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
