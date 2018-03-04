package org.mysys.web;

import org.hibernate.Hibernate;
import org.mysys.model.User;
import org.mysys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser(String loginid) {
		User user = userService.getUserByLoginid(loginid) ;
		Hibernate.initialize(user);
		
		return user;  
	}  
}
