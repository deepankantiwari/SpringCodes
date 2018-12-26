package com.bridgeit.loginandregistration.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bridgeit.loginandregistration.beans.User;

public class UserDao {

	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int save(User user) {
		String insertQuery = "insert into Users (firstName,lastName,email,password) values('" + user.getFirstName()
				+ "','" + user.getLastName() + "','" + user.getEmail() + "','" + user.getPassword() + "')";
		return jdbcTemplate.update(insertQuery);
	}

	public List<User> getUser() {

		return jdbcTemplate.query("select * from Users", new RowMapper<User>() {

			public User mapRow(ResultSet rs, int row) throws SQLException {

				User user = new User();
				user.setFirstName(rs.getString(2));
				user.setLastName(rs.getString(3));
				user.setEmail(rs.getString(4));
				user.setPassword(rs.getString(5));

				return user;
			}
		});
	}
}
