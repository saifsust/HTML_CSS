package com.springframework.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.springframework.mysqltables.Announcement;
import com.springframework.mysqltables.Category;
import com.springframework.mysqltables.HomePost;
import com.springframework.mysqltables.Menu;
import com.springframework.mysqltables.Registration;

@Component("homePostDao")
public class HomePostDao {

	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setJdbc(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}

	public List<HomePost> getHomePosts() {
		String sql = "SELECT post_title,post_author,post_date,post_img,post_content FROM posts";

		return jdbc.query(sql, new RowMapper<HomePost>() {

			@Override
			public HomePost mapRow(ResultSet rs, int row) throws SQLException {

				HomePost homePost = new HomePost(rs.getString("post_title"), rs.getString("post_author"),
						rs.getString("post_date"), rs.getString("post_img"), rs.getString("post_content"));

				return homePost;
			}

		});
	}

	public List<Category> getCategories() {
		return CategoryDao.getCategory(jdbc);
	}

	public List<Announcement> getAnnounce() {
		return AnnouncementDao.getAnnouncement(this.jdbc);
	}

	public List<Menu> getMenuItems() {
		return MenuDao.getMenu(jdbc);
	}

	public int insertRegistrationInfo(Registration reg) {
		return RegistrationDao.insertRegistrationInfo(reg, jdbc);
	}

}
