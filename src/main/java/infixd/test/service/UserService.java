package infixd.test.service;


import org.neo4j.driver.v1.types.Relationship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ch.qos.logback.core.pattern.parser.Node;
import infixd.test.domain.User;
import infixd.test.repositories.UserRepository;
import infixd.test.service.response.UserResponse;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public String createNode(String name,String country) {

		return userRepository.createUser(name,country);
	}
	
	public String deleteAllUser(String name) {

		return userRepository.deleteAllUser(name);
	}
	
	public String updateUser(String name,String updatename) {

		return userRepository.updateUser(name, updatename);
	}
	

	 public String createRelationship(String name,String country) {
	 
	 		return userRepository.createRelationship(name,country);	
	 }
	 
	 
	 
	 @Transactional
	 public UserResponse getUserCountry(String name) {
	 UserResponse response = new UserResponse();
	 User userName = userRepository.getUser(name);
	 response.setName(userName.getName());
	 response.setCountry(userName.getCountry());
	 return response;
	 }
	 
//	 public String getUser(String name,String country){
//		 return userRepository.getUser(name,country);
//	 }
	
	
	
	

	
	
	
	
}