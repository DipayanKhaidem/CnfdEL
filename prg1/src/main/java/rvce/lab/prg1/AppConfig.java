package rvce.lab.prg1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	@Bean
	@Scope("prototype")
	Customer getCustumer() {
		Customer c =new Customer();
		c.setTicks(getTicketA());
		return c;
	}
	
	@Bean
	@Scope("singleton")
	Ticket getTicketA() {
		return new Ticket();
	}
	
}



