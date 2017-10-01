package com.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springframework.mysqltables.Registration;
import com.springframework.service.HomeService;

@Controller("registrationController")
public class RegistrationController {

	@Autowired
	private HomeService homeService;

	public RegistrationController() {
		super();
		System.out.println("Hello Registration");

	}

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String doGet(Registration registration, Model model) {

		try {

			model.addAttribute("menuItems", homeService.getMenuItems());
			// for (Menu category : registrationService.getMenuItems()) {
			// System.out.println(category);
			// }
		} catch (Exception ex) {

			System.out.println(ex.getCause());
		}

		return "registration";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String doPost(Registration registration) {
		System.out.println(registration);
		return "registration";
	}

}
