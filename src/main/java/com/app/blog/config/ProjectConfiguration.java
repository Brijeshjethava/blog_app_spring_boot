package com.app.blog.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {
	
	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
