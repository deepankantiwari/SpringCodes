package com.bridgeit.loginandregistration.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bridgeit.loginandregistration.beans.User;
import com.bridgeit.loginandregistration.dao.UserDao;

@Controller
public class UserController {

	@Autowired
	UserDao userDao;

	@RequestMapping("/Login")
	public String login() {

		return "Login";
	}

	@RequestMapping("/Registration")
	public String registration() {

		return "Registration";
	}

	private Boolean isUserExist(User user) {

		ArrayList<User> userList = (ArrayList<User>) userDao.getUser();

		for (User userTemp : userList) {

			if (userTemp.getEmail().equals(user.getEmail())) {
				return true;
			}

		}
		return false;

	}

	@RequestMapping("/registration")
	private String addUser(@ModelAttribute("user") User user, Model model) {

		if (!isUserExist(user)) {

			userDao.save(user);
			return "redirect:Login.jsp";
		}

		String errMsg = "User already exists";
		model.addAttribute("errMsg", errMsg);
		return "Registration";

	}

	@RequestMapping("/dashboard")
	private String dashBoard(@ModelAttribute("user") User user, Model model) {

		ArrayList<User> userList = (ArrayList<User>) userDao.getUser();

		if (!userList.isEmpty()) {

			for (int i = 0; i < userList.size(); i++) {

				if (userList.get(i).getEmail().equals(user.getEmail())) {
					if (userList.get(i).getPassword().equals(user.getPassword())) {

						return "DashBoard";
					}
				} else {
					String errMsg = "User Not found, Invaild Username or Password";
					model.addAttribute("errMsg", errMsg);

					return "Login";
				}

			}

		}
		String errMsg = "User not registred";
		model.addAttribute("errMsg", errMsg);

		return "Login";
	}

}
