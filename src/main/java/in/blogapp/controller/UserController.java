package in.blogapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.blogapp.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private final UserRepository usersRepo ;

	public UserController(UserRepository usersRepo) {
		this.usersRepo = usersRepo;
	}
	
	
}
