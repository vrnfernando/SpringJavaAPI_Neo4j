package infixd.test.service;


import org.neo4j.driver.v1.types.Relationship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.pattern.parser.Node;
import infixd.test.repositories.UserRepository;

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
	
	
	
	
//	public String Relationship(String Node1,String Node2,String relationship )
//	{
////	    Relationship relationship = x.createRelationshipTo( y, RelationshipTypes.HAS_SEEN );
////	    relationship.setProperty( "stars", stars );
////	    return relationship;
//	}
	
	
	
	
}