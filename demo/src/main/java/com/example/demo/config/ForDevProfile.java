package com.example.demo.config;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Profile("dev")
@Configuration
public class ForDevProfile {
	
	
	
	@PostConstruct
	public void test()
	{
		System.out.println("I am using configuration file for dev profile");
	}

}
