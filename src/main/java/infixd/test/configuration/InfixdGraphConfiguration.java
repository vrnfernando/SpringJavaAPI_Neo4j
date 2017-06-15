package infixd.test.configuration;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@ComponentScan("infixd.test")
@EnableNeo4jRepositories(basePackages = "infixd.test.repositories")
@EnableTransactionManagement
public class InfixdGraphConfiguration extends Neo4jConfiguration{
	
	@Override
	  	public SessionFactory getSessionFactory() {
	  		return new SessionFactory("infixd.test.domain");
	  	}
	
	
	@Bean
	  	@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
	  	public Session getSession() throws Exception{
	  		return super.getSession();
}
}