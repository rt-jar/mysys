package org.mysys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	@GetMapping("/admin/addRole")
    public String renderAddRole() {
        return "/admin/addRole";
    }
	
	@GetMapping("/admin/addUser")
    public String renderAddUser() {
        return "/admin/addUser";
    }
}
