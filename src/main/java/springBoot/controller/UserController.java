package springBoot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springBoot.model.UserModel;
import springBoot.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index() {
		return "Hello World";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "sandeep");
		return "home";
	}
	
	
	@GetMapping("/users")
	public List<UserModel> getUsers() {
		return userService.getUsers();
	}

}
