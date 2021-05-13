package com.sunkenship.zup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.sunkenship.zup.repos")
@SpringBootApplication
public class AppCadastroApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppCadastroApplication.class, args);
	}

}
