package com.task.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class TaskManagementApplication  {
	@Autowired
	 PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(TaskManagementApplication.class, args);

}
}