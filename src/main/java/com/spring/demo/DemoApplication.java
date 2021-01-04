package com.spring.demo;

import com.spring.demo.entities.PersonalData;
import com.spring.demo.repositories.PersonalDataRepository;
import com.spring.demo.services.PersonalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private PersonalDataRepository personalDataRepository;

	@Autowired
	private PersonalDataService personalDataService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		PersonalData personalData = new PersonalData(null,"Personal Data Name","Personal Data Email","Personal Data CPF", LocalDate.now());

		personalDataService.create(personalData);
	}
}
