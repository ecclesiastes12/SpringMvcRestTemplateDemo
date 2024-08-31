package com.mycompany;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//this class is a configuration class that create a rest template object  by defining a bean method

@Configuration
public class AppConfig {

	//this bean method is will be used to create a rest template object whenever needed
//	@Bean 
//	public RestTemplate getRestTemplate() {
//		return new RestTemplate();
//	}
	
	
	@Bean 
	public RestTemplate getRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
}
