package com.procedures.procedures_mongo_service.repository;

import com.procedures.procedures_mongo_service.model.ProcedureInformation;

public interface CustomProcedureRepository {

    void updateProcedureName(String procedureName, String newProcedureName);
    void updateMajorCategory(String procedureName, String newMajorCategory);
    void updateMinorCategory(String procedureName, String newMinorCategory);
    void updateAnnualMax(String procedureName, int newAnnualMax);
    void updateDeductible(String procedureName, int newDeductible);

    void save(ProcedureInformation procedureInformation);
}
