package com.springex.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springex.form.MyForm;
import com.springex.model.User;

@Controller
public class UserController {

	@RequestMapping(method = RequestMethod.GET,value="/")
	public ModelAndView loadForm() {
		ModelAndView modelAndView = new ModelAndView("landing");
		MyForm myForm = new MyForm();
		myForm.setUsers(populate());
		modelAndView.addObject("myForm", myForm);
		return modelAndView;
	}
	
	
	@RequestMapping(method = RequestMethod.GET,value="/1.0/site")
	public ModelAndView loadForm2() {
		ModelAndView modelAndView = new ModelAndView("landing");
		MyForm myForm = new MyForm();
		myForm.setUsers(populate2());
		modelAndView.addObject("myForm", myForm);
		return modelAndView;
	}

	private List<User> populate() {
		User user1 = new User("Tim",  143400.00);
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
	
	
	private List<User> populate2() {
		User user1 = new User("Jim",  143400.00);
		User user2 = new User("Tim",  50.00);
		User user3 = new User("Lim",  25.00);
		User user4 = new User("Dim",  12.50);
		
		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
		return users;
	}
}