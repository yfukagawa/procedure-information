package com.procedure_spring_service.repository;

import com.procedure_spring_service.model.ProcedureInformation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProceduresRepository extends MongoRepository<ProcedureInformation, String> {
    @Query("{procedureName:'?0'}")
    ProcedureInformation findProcedureByName(String procedureName);

    @Query("{procedureId:'?0'}")
    ProcedureInformation findProcedureById(String id);

    @Query(value="{majorCategory:'?0'}", fields="{'id' : 1, 'procedureName' : 1, 'minorCategory' : 1, 'anualMax' : 1, 'deductible' : 1}")
    List<ProcedureInformation> findAllInThisMajorCategory(String majorCategory);

    public long count();
}
