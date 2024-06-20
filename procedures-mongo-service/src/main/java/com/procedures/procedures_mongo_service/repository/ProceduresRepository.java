package com.procedures.procedures_mongo_service.repository;

import com.procedures.procedures_mongo_service.model.ProcedureInformation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProceduresRepository extends MongoRepository<ProcedureInformation, String> {
    @Query("{procedureName:'?0'}")
    ProcedureInformation findItemByProcedureName(String procedureName);

    @Query(value="{majorCategory:'?0'}", fields="{'procedureName' : 1, 'minorCategory' : 1, 'anualMax' : 1, 'deductible' : 1}")
    List<ProcedureInformation> findAll(String majorCategory);

    public long count();
}
