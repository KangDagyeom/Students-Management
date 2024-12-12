/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import java.sql.*;

/**
 *
 * @author Hyun
 */
public class DBConnection {

    public static Connection getConnect() {
        try {
            return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Users;encrypt=true;trustServerCertificate=true", "sa", "123");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Connection conn = getConnect();
        if (conn != null) {
            System.out.println("Ket noi thanh cong!");
        } else {
            System.out.println("Ket noi that bai!");
        }
    }
}
