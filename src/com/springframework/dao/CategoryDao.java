package com.springframework.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.springframework.mysqltables.Category;

public class CategoryDao {

	public static List<Category> getCategory(NamedParameterJdbcTemplate jdbc) {
		String sql = "SELECT cat_title FROM categories";
		return jdbc.query(sql, new RowMapper<Category>() {

			@Override
			public Category mapRow(ResultSet rs, int row) throws SQLException {

				Category category = new Category(rs.getString("cat_title"));
				return category;
			}

		});
	}

}
