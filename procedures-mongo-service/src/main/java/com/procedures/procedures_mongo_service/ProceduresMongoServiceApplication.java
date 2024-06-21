package com.procedures.procedures_mongo_service;

import com.procedures.procedures_mongo_service.model.ProcedureInformation;
import com.procedures.procedures_mongo_service.repository.CustomProcedureRepository;
import com.procedures.procedures_mongo_service.repository.ProceduresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Scanner;

@SpringBootApplication
@EnableMongoRepositories
public class ProceduresMongoServiceApplication implements CommandLineRunner {

	@Autowired
	ProceduresRepository procedureInfoRepo;

	public static void main(String[] args) {

		SpringApplication.run(ProceduresMongoServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

	void addNewProcedureInformation() {
		System.out.println("Enter new procedure information...");


		Scanner scanner = new Scanner(System.in);
		System.out.println("Procedure ID");
		String id = scanner.nextLine();
		System.out.println("Procedure Name");
		String name = scanner.nextLine();
		System.out.println("Major Category");
		String major = scanner.nextLine();
		System.out.println("Minor Category");
		String minor = scanner.nextLine();
		System.out.println("Annual Maximum");
		String max = scanner.nextLine();
		System.out.println("Deductible");
		String deductible = scanner.nextLine();


		procedureInfoRepo.save(new ProcedureInformation(id, name, major, minor, max, deductible));
	}
}
