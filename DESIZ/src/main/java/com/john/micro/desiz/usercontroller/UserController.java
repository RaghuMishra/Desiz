package com.john.micro.desiz.usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.john.micro.desiz.model.User;
import com.john.micro.desiz.repo.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepo;

	@RequestMapping("/home")
	public String home() {
		return "index";
	}

	@RequestMapping("/registration")
	public String registration() {
		return "search";
	}

	@RequestMapping("/save")
	public String saveDetails(@ModelAttribute("user") User user, ModelMap modelMap) {
		User savedUser = userRepo.save(user);
		String msg = "User Created With  ID: " + savedUser.getId();
		modelMap.addAttribute("msg", msg);
		return "search";
	}

}
