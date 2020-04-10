package com.company;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlbumController {
    Connection conn;

    public AlbumController(Connection conn) {
        this.conn = conn;
    }

    public void create(String name, int artistId, int releaseYear){
        try {
            String sql = "INSERT INTO albums(name, artistId, releaseYear) values(?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setInt(2, artistId);
            pstmt.setInt(3, releaseYear);
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findByArtist(int artistId){
        try {
            String sql = "SELECT * FROM albums WHERE artist_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, artistId);
            ResultSet resultSet = pstmt.executeQuery(sql);
            while(resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " "
                + resultSet.getString("name") + " "
                + resultSet.getInt("artist_id") + " "
                + resultSet.getInt("release_year"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
