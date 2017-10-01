package com.springframework.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springframework.dao.HomePostDao;
import com.springframework.mysqltables.Menu;

@Service("registrationService")
public class RegistrationService {

	@Autowired
	private HomePostDao homePostDao;

	public RegistrationService() {
		super();
		System.out.println("service");

	}

	

	public List<Menu> getMenuItems() {
		return homePostDao.getMenuItems();
	}

}
