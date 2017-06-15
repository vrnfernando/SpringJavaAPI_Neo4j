package infixd.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import infixd.test.repositories.UserRepository;
import infixd.test.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	  	private UserService userService;
	
	
	
	@RequestMapping(value = "/createUser", method = RequestMethod.POST, produces = "application/json")
	public String createUser(@RequestParam String name,@RequestParam String country) {
		  	
		  		return userService.createNode(name, country);
}
	@RequestMapping(value = "/deleteAllUser", method = RequestMethod.POST, produces = "application/json")
	 	public String deleteUser(@RequestParam String name,@RequestParam String country) {
	 		return userService.deleteAllUser(name);
	 	}
	
	@RequestMapping(value = "/updateUser", method = RequestMethod.POST, produces = "application/json")
	 	public String updateUser(@RequestParam String name,@RequestParam String updatename) {
	 		return userService.updateUser(name,updatename);
	
	  	  }
	@RequestMapping(value = "/createRelationship", method = RequestMethod.POST, produces = "application/json")
	public String createRelationship(@RequestParam String name, @RequestParam String country) {
		 		return userService.createRelationship(name, country);
	
}
}
	
	

