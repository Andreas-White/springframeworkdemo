package com.example.jbrainsDataDemo.jdbcSpring.dao;

import com.example.jbrainsDataDemo.jdbcSpring.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;

@Component
public class JDBCDaoSpring {

    @Autowired
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Circle getCircle(int circleId) {

        Connection conn = null;

        try {


            conn = dataSource.getConnection();
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
        } catch (SQLException e) {
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
