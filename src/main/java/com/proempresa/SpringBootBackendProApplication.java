package com.proempresa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.proempresa", "com.proempresa.config"})
public class SpringBootBackendProApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendProApplication.class, args);
	}

}
