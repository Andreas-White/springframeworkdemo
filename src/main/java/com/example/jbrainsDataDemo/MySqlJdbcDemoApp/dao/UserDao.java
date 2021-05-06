package com.example.jbrainsDataDemo.MySqlJdbcDemoApp.dao;

import com.example.jbrainsDataDemo.MySqlJdbcDemoApp.model.User;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserDao extends JdbcDaoSupport {

    @Autowired
    public UserDao(DataSource dataSource) { setDataSource(dataSource); }

    // Insert of new User into database
    public void insertUser(User user) {
        String sql = "INSERT INTO users (ID, NAME, PASSWORD) VALUES(?,?,?)";
        assert this.getJdbcTemplate() != null;
        this.getJdbcTemplate().update(sql,user.getId(),user.getName(),user.getPassword());
    }

    public void deleteUser(User user) {
        String sql = "DELETE FROM users WHERE id=?";
        assert this.getJdbcTemplate() != null;
        this.getJdbcTemplate().update(sql,user.getId());
    }

    public void updateUserName(User user, String newName) {
        String sql = "UPDATE users SET name=? WHERE id=?";
        this.getJdbcTemplate().update(sql,newName,user.getId());
    }

    public void updatePassword(User user, String newPassword) {
        String sql = "UPDATE users SET password=? WHERE id=?";
        this.getJdbcTemplate().update(sql,newPassword,user.getId());
    }

    

    private static final class UserMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();
            user.setId(resultSet.getInt("ID"));
            user.setName(resultSet.getString("NAME"));
            user.setPassword(resultSet.getString("PASSWORD"));
            return user;
        }
    }
}
