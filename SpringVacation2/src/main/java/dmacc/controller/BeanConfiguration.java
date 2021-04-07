package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.*;
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Vacation vacation() {
		Vacation bean = new Vacation("Spring break");
		//bean.setDesc("Visiting Freinds");
		//bean.setCountry("USA");
		//bean.setCity("LA");
		//bean.setDays(3);
		return bean;
	}

}
