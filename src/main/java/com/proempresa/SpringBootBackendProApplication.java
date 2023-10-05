package com.proempresa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.proempresa", "com.proempresa.config"})
public class SpringBootBackendProApplication {
	
	@RequestMapping("/")
	String home() {
		return "Hola Christian!! desde el SpringBootBackendProApplication "
				+ " como RestController";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendProApplication.class, args);
		
		//System.out.println("Hola este es el cambi de devops!!");
		
		
	}
	
	

}
