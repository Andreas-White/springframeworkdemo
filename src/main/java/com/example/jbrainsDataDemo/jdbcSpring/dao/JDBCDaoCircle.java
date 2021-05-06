package com.example.jbrainsDataDemo.jdbcSpring.dao;

import com.example.jbrainsDataDemo.jdbcSpring.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class JDBCDaoCircle extends JdbcDaoSupport {

    @Autowired
    public JDBCDaoCircle(DataSource dataSource) {
        setDataSource(dataSource);
    }

    // Returns a Circle object with the specified id
    public Circle getCircle(int circleId) {
        String sqlGetCircle = "SELECT * FROM circle WHERE id=?";
        return this.getJdbcTemplate().queryForObject(sqlGetCircle,new Object[] {circleId},new CircleMapper());
    }

    // Returns the Circle's name as a String with the specified id
    public String getCircleName(int circleId) {
        String sqlGetCircleName = "SELECT name FROM circle WHERE id=?";
        assert this.getJdbcTemplate() != null;
        return this.getJdbcTemplate().queryForObject(sqlGetCircleName,new Object[] {circleId},String.class);
    }

    // Returns the total number of Circle objects as an integer
    public int getCircleCount() {
        String sqlCount = "SELECT COUNT(*) FROM CIRCLE";
        return this.getJdbcTemplate().queryForObject(sqlCount,Integer.class);
    }

    // Returns a list with all the Circle objects
    public List<Circle> getAllCircles() {
        String sqlSelectAllCircles = "SELECT * FROM circle";
        return this.getJdbcTemplate().query(sqlSelectAllCircles,new CircleMapper());
    }

    // Inserts the specified Circle object to the database
    public void insertCircle(Circle circle) {
        String sqlInsertCircle = "INSERT INTO circle(ID, NAME) VALUES(?,?)";
        this.getJdbcTemplate().update(sqlInsertCircle,circle.getId(),circle.getName());
    }

    // Deletes the specified Circle object to the database
    public void deleteCircle(Circle circle) {
        String sqlDeleteCircle = "DELETE FROM circle WHERE id = ?";
        this.getJdbcTemplate().update(sqlDeleteCircle,circle.getId());
    }

    // Implementation of RowMapper class in order to fetch Circle objects by specifying an attribute
    private static final class CircleMapper implements RowMapper<Circle> {

        @Override
        public Circle mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
            Circle circle = new Circle();
            circle.setId(resultSet.getInt("ID"));
            circle.setName(resultSet.getString("NAME"));
            return circle;
        }
    }
}
