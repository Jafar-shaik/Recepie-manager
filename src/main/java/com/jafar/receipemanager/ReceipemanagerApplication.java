package com.jafar.receipemanager;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReceipemanagerApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ReceipemanagerApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper().configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
	}
}


