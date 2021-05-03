package com.example.jbrainsDataDemo.jdbcSpring.dao;

import com.example.jbrainsDataDemo.jdbcSpring.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
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
    private JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public JdbcTemplate getJdbcTemplate() { return jdbcTemplate; }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }

    public DataSource getDataSource() {
        return dataSource;
    }

    @Autowired
    public void setDataSource(DataSource dataSource) { this.jdbcTemplate = new JdbcTemplate(dataSource); }

    public Circle getCircle(int circleId) {
        String sqlGetCircle = "SELECT * FROM circle WHERE id=?";
        return jdbcTemplate.queryForObject(sqlGetCircle,new Object[] {circleId},new CircleMapper());
    }

    public String getCircleName(int circleId) {
        String sqlGetCircleName = "SELECT name FROM circle WHERE id=?";
        return jdbcTemplate.queryForObject(sqlGetCircleName,new Object[] {circleId},String.class);
    }

    public int getCircleCount() {
        String sqlCount = "SELECT COUNT(*) FROM CIRCLE";
        return jdbcTemplate.queryForObject(sqlCount,Integer.class);
    }

    public List<Circle> getAllCircles() {
        String sqlSelectAllCircles = "SELECT * FROM circle";
        return jdbcTemplate.query(sqlSelectAllCircles,new CircleMapper());
    }

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
