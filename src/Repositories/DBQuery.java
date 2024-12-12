/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Model.User;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Hyun
 */
public class DBQuery {

    private final DBConnection bConnection;

    public DBQuery(DBConnection bConnection) {
        this.bConnection = bConnection;
    }

    private User mapResult(ResultSet rs) throws SQLException {
        return new User(
                rs.getString("FullName"),
                rs.getString("UserName"),
                rs.getString("Password"),
                rs.getString("Email"),
                rs.getDate("BirthDate"),
                rs.getBoolean("IsActive")
        );
    }

    private ArrayList<User> executeQuery(String query, Object... params) {
        ArrayList<User> al = new ArrayList<>();
        try (Connection conn = bConnection.getConnect(); PreparedStatement ps = conn.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                al.add(mapResult(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return al;
    }

    private int executeUpdate(String query, Object... params) {
        try (Connection conn = bConnection.getConnect(); PreparedStatement ps = conn.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public ArrayList<User> getList() {
        String query = "SELECT * FROM Users";
        return executeQuery(query);
    }

    public int insertUser(User u) {
        String query = "INSERT INTO Users VALUES (?,?,?,?,?,?)";
        return executeUpdate(query,
                u.getFullName(),
                u.getUsername(),
                u.getPassword(),
                u.getEmail(),
                u.getBirthDate(),
                u.getIsActive()
        );
    }

    public int changePassword(String userName) {
        String query = "UPDATE Users SET Password = 'admin' WHERE UserName = ?";
        return executeUpdate(query, userName);
    }

}
