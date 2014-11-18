package payday;

import javax.sql.DataSource;

//import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.SimpleDriverDataSource;
//import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
	
	//@Bean
	//DataSource dataSource() {
	//	return new SimpleDriverDataSource() {
	//		{
	//			setDriverClass(com.mysql.jdbc.Driver.class);
	//			setUsername("toufiq_PDuser");
	//			setUrl("jdbc:mysql://localhost/toufiq_payday");
	//			setPassword("payday4350");
	//		}
	//	};
	//}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
