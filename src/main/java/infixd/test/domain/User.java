package infixd.test.domain;


import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class User {

	@GraphId
	private Long NodeId;
	
	private String name;
	private String country;

	public User() {

	}

	
	public Long getNodeId() {
		return NodeId;
	}


	public void setNodeId(Long nodeId) {
		NodeId = nodeId;
	}


	public User(String name, String country) {

		this.name = name;
		this.country=country;

	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	}

