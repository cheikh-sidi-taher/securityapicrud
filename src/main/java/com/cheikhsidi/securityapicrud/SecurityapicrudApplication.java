package com.cheikhsidi.securityapicrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cheikhsidi.securityapicrud.repository.RoleRepository;
import com.cheikhsidi.securityapicrud.repository.UserRepository;

@SpringBootApplication
@EntityScan(basePackages = "com.cheikhsidi.securityapicrud.entity")
@ComponentScan(basePackages={"com.controllers","com.services"})
@EnableJpaRepositories(basePackageClasses = {UserRepository.class, RoleRepository.class})

public class SecurityapicrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityapicrudApplication.class, args);
	}

}
