package com.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springframework.mysqltables.Menu;
import com.springframework.service.HomeService;

@Controller("homeController")
@RequestMapping("/")
public class HomeController {

	@Autowired
	private HomeService homeService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePost(Model model) {
		try {
			model.addAttribute("postView", homeService.showPost());
			model.addAttribute("category", homeService.getCategory());
			model.addAttribute("announce", homeService.getAnnounce());
			model.addAttribute("menuItems", homeService.getMenuItems());

			// for (Menu menu : homeService.getMenuItems()) {
			// System.out.println(menu);
			// }

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
		}
		return "index";
	}

}
