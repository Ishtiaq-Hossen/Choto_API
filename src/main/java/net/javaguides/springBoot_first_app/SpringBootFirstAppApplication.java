package net.javaguides.springBoot_first_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class})
public class SpringBootFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstAppApplication.class, args);
		System.out.println("hello");
	}

}
