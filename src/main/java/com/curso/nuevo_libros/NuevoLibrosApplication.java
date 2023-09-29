package com.curso.nuevo_libros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan(basePackages = "com.curso.model")
@EnableJpaRepositories(basePackages = "com.curso.dao")
@SpringBootApplication(scanBasePackages  = {"com.curso.controller"," com.curso.service"})
public class NuevoLibrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(NuevoLibrosApplication.class, args);
	}

}
