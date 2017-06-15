package infixd.test.repositories;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.neo4j.repository.GraphRepository;

import infixd.test.domain.User;
 		   



public interface UserRepository extends GraphRepository<User>  {
		
	  
	  	@Query("create (u:Node{name:{name},country:{country}})")
	  	public String createUser(@Param("name") String name,@Param("country") String country);
	  	
	  	
	  	@Query("MATCH (n) DETACH DELETE n")
	  	 	public String deleteAllUser(@Param("name") String name);
	  	
	  	@Query("MATCH (u:Node) WHERE u.name= {name} SET u.name={updatename}")
	  	 	 public String updateUser(@Param("name") String name,@Param("updatename") String updatename);

 
	  	@Query("CREATE (u:User {name:{name}}),(db:Person {name:{country}}),(u)-[:CITIZEN]->(db)RETURN u, db")
	  	public String createRelationship(@Param("name")String name,@Param("country") String country);
	  	
	   		  
}
