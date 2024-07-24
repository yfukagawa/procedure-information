package com.java.procedure_spring_mongo_service;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProcedureRepository
        extends MongoRepository<ProcedureInformation, String> {
    Optional<ProcedureInformation> findProcedureInformationByProcedureId(String procedureId);

}
