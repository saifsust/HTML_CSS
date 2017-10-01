package com.springframework.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.springframework.mysqltables.Announcement;

public class AnnouncementDao {

	public static  List<Announcement> getAnnouncement(NamedParameterJdbcTemplate jdbc) {

		String sql = "SELECT * FROM myblog.announcement where ann_date= (SELECT MAX(ann_date) FROM myblog.announcement);";

		return jdbc.query(sql, new RowMapper<Announcement>() {

			@Override
			public Announcement mapRow(ResultSet rs, int row) throws SQLException {
				return new Announcement(rs.getString("ann_title"), rs.getString("ann_content"),
						rs.getString("ann_date"));
			}

		});
	}

}
