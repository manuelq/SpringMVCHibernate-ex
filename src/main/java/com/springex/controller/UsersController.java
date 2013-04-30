package com.springex.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springex.model.User;


@Controller
public class UsersController {

	@RequestMapping("listusers")
	public @ResponseBody Object getAll() {
		return populate();
		
	}

	private List<User> populate() {
		User user1 = new User("Timmy",  143400.00);
		User user2 = new User("Kim",  50.00);
		User user3 = new User("Sim",  25.00);
		User user4 = new User("Dim",  12.50);
		
		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
		return users;
	}
}