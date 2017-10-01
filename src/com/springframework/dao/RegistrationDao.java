package com.springframework.dao;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.springframework.mysqltables.Registration;

public class RegistrationDao {

	public static int insertRegistrationInfo(Registration reg, NamedParameterJdbcTemplate jdbc) {
		String sql = "INSERT INTO users_reg(firstName,lastName,userName,email,password) values(:firstName, :lastName, :userName, :email, :password)";
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("firstName", reg.getFirstName());
		paramMap.put("lastName", reg.getLastName());
		paramMap.put("userName", reg.getUserName());
		paramMap.put("email", reg.getEmail());
		paramMap.put("password", reg.getPassword());
		return jdbc.update(sql, paramMap);

	}

}
