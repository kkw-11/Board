package com.boardproject.myrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class MyrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyrestApplication.class, args);
	}

}
