package com.java.procedure_spring_mongo_service;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProcedureRepository extends MongoRepository<ProcedureInformation, String> {

}
