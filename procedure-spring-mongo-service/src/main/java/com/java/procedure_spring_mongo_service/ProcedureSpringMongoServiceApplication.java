package com.java.procedure_spring_mongo_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

import static com.java.procedure_spring_mongo_service.Categories.DIAGNOSTIC_AND_PREVENTIVE;
import static com.java.procedure_spring_mongo_service.Categories.ORAL_EXAMS;

@SpringBootApplication
public class ProcedureSpringMongoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcedureSpringMongoServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ProcedureRepository repository) {
		return args -> {
			ProcedureInformation procedureInformation = new ProcedureInformation(
					"TEST0001",
					"TEST Data",
					DIAGNOSTIC_AND_PREVENTIVE,
					ORAL_EXAMS,
					"10000",
					"yes",
					LocalDateTime.now()
			);

			repository.insert(procedureInformation);
		};
	}

}
