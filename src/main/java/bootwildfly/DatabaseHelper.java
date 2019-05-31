package bootwildfly;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.stereotype.Service;

@Service()
public class DatabaseHelper {
	
	@PostConstruct
	public void init() {
		System.out.println("logging the init method");
		DataSource ds = dataSource();
		if(null!=ds) {
			System.out.println("all is well");
		}
	}

	@Bean
	public DataSource dataSource() 
	{
	  JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
	  DataSource dataSource = dataSourceLookup.getDataSource("java:jboss/datasources/PostgresDS");
	  return dataSource;
	}
	
	
	
}
