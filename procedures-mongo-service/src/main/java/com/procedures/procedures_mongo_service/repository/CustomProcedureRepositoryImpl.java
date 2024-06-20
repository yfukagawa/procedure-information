package com.procedures.procedures_mongo_service.repository;

import com.procedures.procedures_mongo_service.model.ProcedureInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class CustomProcedureRepositoryImpl implements CustomProcedureRepository{

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public void updateProcedureName(String procedureName, String newProcedureName) {

    }

    @Override
    public void updateMajorCategory(String procedureName, String newMajorCategory) {

    }

    @Override
    public void updateMinorCategory(String procedureName, String newMinorCategory) {

    }

    @Override
    public void updateAnnualMax(String procedureName, int newAnnualMax) {

    }

    @Override
    public void updateDeductible(String procedureName, int newDeductible) {

    }

    @Override
    public void save(ProcedureInformation procedureInformation) {

    }


}
