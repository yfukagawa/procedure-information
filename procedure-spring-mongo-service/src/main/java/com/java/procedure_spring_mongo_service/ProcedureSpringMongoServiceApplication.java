package com.java.procedure_spring_mongo_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.time.LocalDateTime;
import java.util.List;

import static com.java.procedure_spring_mongo_service.Categories.DIAGNOSTIC_AND_PREVENTIVE;
import static com.java.procedure_spring_mongo_service.Categories.ORAL_EXAMS;

@SpringBootApplication
public class ProcedureSpringMongoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcedureSpringMongoServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(
			ProcedureRepository repository, MongoTemplate mongoTemplate) {
		return args -> {
			String procedureId = "TEST0001";
			String name = "TEST Data";
			ProcedureInformation procedureInformation = new ProcedureInformation(
					procedureId,
					name,
					DIAGNOSTIC_AND_PREVENTIVE,
					ORAL_EXAMS,
					"10000",
					"yes",
					LocalDateTime.now()
			);

//			usingMongoTemplateAndQuery(repository, mongoTemplate, procedureId, name, procedureInformation);

			repository.findProcedureInformationByProcedureId(procedureId)
					.ifPresentOrElse(p -> {
						System.out.println(p + " already exists");
					}, () -> {
						System.out.println("Inserting Procedure " + procedureInformation);
						repository.insert(procedureInformation);
					});
		};
	}

	private static void usingMongoTemplateAndQuery(ProcedureRepository repository, MongoTemplate mongoTemplate, String procedureId, String name, ProcedureInformation procedureInformation) {
		Query query = new Query();
		query.addCriteria(Criteria.where("procedureId").is(procedureId).and("name").is(name));

		List<ProcedureInformation> procedures = mongoTemplate.find(query, ProcedureInformation.class);

		if(procedures.size() > 1) {
			throw new IllegalStateException("Found duplicate procedure with the same procedure id and/or name " + procedureId + " " + name);
		}
		if(procedures.isEmpty()) {
			System.out.println("Inserting Procedure " + procedures);
			repository.insert(procedureInformation);
		} else {
			System.out.println(procedures + " already exists");
		}
	}

}
