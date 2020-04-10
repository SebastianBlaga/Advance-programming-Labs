package com.company;

import java.sql.*;

public class Database {
    Connection conn;

    public void setConn() {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        conn = null;
        try{
            Connection conn = DriverManager.getConnection(url, "dba", "sql");
        } catch(SQLException e) {
            System.err.println("Cannot connect to DB: " + e);
        } finally {
            if ( conn !null) conn.close();
        }
    }
}
