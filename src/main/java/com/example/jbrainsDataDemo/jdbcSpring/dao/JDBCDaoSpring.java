package com.example.jbrainsDataDemo.jdbcSpring.dao;

import com.example.jbrainsDataDemo.jdbcSpring.model.Circle;
import com.example.jbrainsDataDemo.jdbcSpring.model.Triangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class JDBCDaoSpring {


    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() { return jdbcTemplate; }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }

    public DataSource getDataSource() {
        return dataSource;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) { this.jdbcTemplate = new JdbcTemplate(dataSource); }

    // Returns a Circle object with the specified id
    public Circle getCircle(int circleId) {
        String sqlGetCircle = "SELECT * FROM circle WHERE id=?";
        return jdbcTemplate.queryForObject(sqlGetCircle,new Object[] {circleId},new CircleMapper());
    }

    // Returns the Circle's name as a String with the specified id
    public String getCircleName(int circleId) {
        String sqlGetCircleName = "SELECT name FROM circle WHERE id=?";
        return jdbcTemplate.queryForObject(sqlGetCircleName,new Object[] {circleId},String.class);
    }

    // Returns the total number of Circle objects as an integer
    public int getCircleCount() {
        String sqlCount = "SELECT COUNT(*) FROM CIRCLE";
        return jdbcTemplate.queryForObject(sqlCount,Integer.class);
    }

    // Returns a list with all the Circle objects
    public List<Circle> getAllCircles() {
        String sqlSelectAllCircles = "SELECT * FROM circle";
        return jdbcTemplate.query(sqlSelectAllCircles,new CircleMapper());
    }

    // Inserts the specified Circle object to the database
    public void insertCircle(Circle circle) {
        String sqlInsertCircle = "INSERT INTO circle(ID, NAME) VALUES(?,?)";
        jdbcTemplate.update(sqlInsertCircle,circle.getId(),circle.getName());
    }

    // Deletes the specified Circle object to the database
    public void deleteCircle(Circle circle) {
        String sqlDeleteCircle = "DELETE FROM circle WHERE id = ?";
        jdbcTemplate.update(sqlDeleteCircle,circle.getId());
    }


    // Creates a table for Triangle objects
    public void createTriangleTable() {
        String sqlCreate = "CREATE TABLE TRIANGLE (ID INTEGER, NAME VARCHAR(50))";
        jdbcTemplate.execute(sqlCreate);
    }

    // Inserts the specified Triangle object to the database
    public void insertTriangle(Triangle triangle) {
        String sqlInsert = "INSERT INTO triangle(ID, NAME) VALUES (?,?)";
        jdbcTemplate.update(sqlInsert,triangle.getId(),triangle.getName());
    }

    // Deletes the specified Triangle object to the database
    public boolean deleteTriangle(Triangle triangle) {
        try {
            String sqlDelete = "DELETE FROM triangle WHERE ID=?";
            jdbcTemplate.update(sqlDelete,triangle.getId());
            return true;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Returns a list with all the Triangle objects
    public List<Triangle> getAllTriangles() {
        String sqlAllTriangles = "SELECT * FROM triangle";
        return jdbcTemplate.query(sqlAllTriangles,new TriangleMapper());
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

    // Implementation of RowMapper class in order to fetch Triangle objects by specifying an attribute
    private static final class TriangleMapper implements RowMapper<Triangle> {

        @Override
        public Triangle mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
            Triangle triangle = new Triangle();
            triangle.setId(resultSet.getInt("ID"));
            triangle.setName(resultSet.getString("NAME"));
            return triangle;
        }
    }
}
