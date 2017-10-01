package com.springframework.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.springframework.mysqltables.Menu;

public class MenuDao {

	public static List<Menu> getMenu(NamedParameterJdbcTemplate jdbc) {

		String sql = "SELECT * FROM menu;";

		return jdbc.query(sql, new RowMapper<Menu>() {

			@Override
			public Menu mapRow(ResultSet rs, int row) throws SQLException {
				return new Menu(rs.getString("menu_item"), rs.getString("page_link"));
			}

		});
	}

}
