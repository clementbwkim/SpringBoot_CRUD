package com.springboot.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing//추가
public class EasyNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyNotesApplication.class, args);
	}

}
