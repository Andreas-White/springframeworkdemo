package com.example.jbrainsDataDemo.jdbcSpring.dao;

import com.example.jbrainsDataDemo.jdbcSpring.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;

@Component
public class JDBCDaoSpring {


    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public JdbcTemplate getJdbcTemplate() { return jdbcTemplate; }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }

    public DataSource getDataSource() {
        return dataSource;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Circle getCircle(int circleId) {

        Connection conn = null;

        try {

            conn = dataSource.getConnection();

            PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM circle WHERE id=?");
            preparedStatement.setInt(1,circleId);

            Circle circle = null;
            ResultSet result = preparedStatement.executeQuery();

            if (result.next()) {
                circle = new Circle(circleId, result.getString("name"));
            }

            preparedStatement.close();
            result.close();

            return circle;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException throwable) {
                throwable.printStackTrace();
            }
        }
        return null;
    }

    public int getCircleCount() {
        String sql = "SELECT COUNT(*) FROM CIRCLE";
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }
}
