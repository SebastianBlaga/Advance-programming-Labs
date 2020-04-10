package com.company;

import java.sql.*;

public class Database {
    Connection conn;

    public void setConn() {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        conn = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Aici am scris dba1 pentru ca dba exista deja(nu stiu exact de unde si nici nu ma puteam conecta cu el)
            conn = DriverManager.getConnection(url, "dba1", "sql");
        } catch(SQLException | ClassNotFoundException e) {
            System.err.println("Cannot connect to DB: " + e);
        }
    }
}
