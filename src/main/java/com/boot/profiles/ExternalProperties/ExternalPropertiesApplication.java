package com.boot.profiles.ExternalProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExternalPropertiesApplication implements CommandLineRunner {

	@Autowired
	MyBean myBean;
	@Autowired
	private ServerProperties serverProperties;


	@Override
	public void run(String... args) throws Exception {
		System.out.println(serverProperties);
		System.out.println(myBean.getName());
	}
	public static void main(String[] args) {
		SpringApplication.run(ExternalPropertiesApplication.class, args);

	}

}
