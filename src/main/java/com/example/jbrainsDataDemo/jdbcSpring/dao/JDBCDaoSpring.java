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
    public void setDataSource(DataSource dataSource) { this.jdbcTemplate = new JdbcTemplate(dataSource); }

    public String getCircleName(int circleId) {
        String sqlGetCircle = "SELECT name FROM circle WHERE id=?";
        return jdbcTemplate.queryForObject(sqlGetCircle,new Object[] {circleId},String.class);
    }

    public int getCircleCount() {
        String sqlCount = "SELECT COUNT(*) FROM CIRCLE";
        return jdbcTemplate.queryForObject(sqlCount,Integer.class);
    }
}
