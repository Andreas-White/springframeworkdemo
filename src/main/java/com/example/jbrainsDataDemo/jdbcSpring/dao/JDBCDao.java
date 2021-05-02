package com.example.jbrainsDataDemo.jdbcSpring.dao;

import com.example.jbrainsDataDemo.jdbcSpring.model.Circle;

import java.sql.*;

public class JDBCDao {

    public Circle getCircle(int circleId) {
        Connection conn = null;

        String driver = "org.apache.derby.jdbc.ClientDriver";
        try {

            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/db");
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM circle WHERE id=?");
            statement.setInt(1,circleId);

            Circle circle = null;
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                circle = new Circle(circleId, result.getString("name"));
            }

            statement.close();
            result.close();

            return circle;
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
}
