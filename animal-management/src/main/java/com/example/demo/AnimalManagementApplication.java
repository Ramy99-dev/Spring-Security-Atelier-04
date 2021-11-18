package com.example.demo;


import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.service.UserService;



@SpringBootApplication
public class AnimalManagementApplication  {
	
	@Autowired
	UserService userService ; 

	public static void main(String[] args) {
		SpringApplication.run(AnimalManagementApplication.class, args);
	}
    
	/*@PostConstruct
	void init_users() {
		
		userService.addRole(new Role(null, "ADMIN"));
		userService.addRole(new Role(null, "USER"));
		
		userService.saveUser(new User(null, "rami", "123", true, null));
		userService.saveUser(new User(null, "ali", "123", true, null));
		userService.saveUser(new User(null, "saleh", "123", true, null));
		userService.saveUser(new User(null, "admin", "123", true, null));

		userService.addRoleToUser("ali", "USER");
		userService.addRoleToUser("rami", "USER");
		userService.addRoleToUser("saleh", "USER");
		userService.addRoleToUser("admin", "ADMIN");
	}*/
	
	
	@Bean
	BCryptPasswordEncoder getBCE() {
	   return new BCryptPasswordEncoder();
	}


}
