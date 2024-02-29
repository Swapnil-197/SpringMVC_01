package com.sbmvc.SpringBoot_MVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sbmvc.SpringBoot_MVC.pojo.User;
import com.sbmvc.SpringBoot_MVC.service.UserService;

@Controller
public class UserController {
	
//	@GetMapping("/welcome")
//	public String getMsg() {
//		return "index";
//	}

	@Autowired 
	UserService userService;
	
	@RequestMapping(path = "login" , method=RequestMethod.POST)
	public ModelAndView validateUser(@ModelAttribute User user) {
		System.out.println("Login Controller has called");
		if(userService.validateUser(user)) {
			System.out.println("User found in database");
			return new ModelAndView("dashboard","Message","Welcome to dashboard login has Success");
		}else {
			System.out.println("User not found in database");
			return new ModelAndView("index","errorMessage","User not found login fail");
		}
		
		
//		System.out.println(user.getEmail());
//		System.out.println(user.getPassword());	
	}

}
