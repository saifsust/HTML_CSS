package com.springframework.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springframework.dao.CategoryDao;
import com.springframework.dao.HomePostDao;
import com.springframework.mysqltables.Announcement;
import com.springframework.mysqltables.Category;
import com.springframework.mysqltables.HomePost;
import com.springframework.mysqltables.Menu;
import com.springframework.mysqltables.Registration;

@Service("homeService")
public class HomeService {

	private HomePostDao homePostDao;

	public HomeService() {
		System.out.println("Home Service");
	}

	@Autowired
	public void setHomePostDao(HomePostDao homePostDao) {
		this.homePostDao = homePostDao;
	}

	public List<HomePost> showPost() {
		return homePostDao.getHomePosts();
	}

	public List<Announcement> getAnnounce() {
		return homePostDao.getAnnounce();
	}

	public List<Category> getCategory() {
		return homePostDao.getCategories();

	}

	public List<Menu> getMenuItems() {
		return homePostDao.getMenuItems();
	}

	public void insertRegistration(Registration reg) {
		try {
			homePostDao.insertRegistrationInfo(reg);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
		}
	}

}
