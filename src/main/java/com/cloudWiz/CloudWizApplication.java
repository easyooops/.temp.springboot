package com.cloudWiz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@Slf4j
@SpringBootApplication
public class CloudWizApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CloudWizApplication.class, args);
	}

	@Override protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CloudWizApplication.class);
	}
}
