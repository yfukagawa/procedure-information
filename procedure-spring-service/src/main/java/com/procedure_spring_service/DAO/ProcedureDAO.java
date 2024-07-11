package com.procedure_spring_service.DAO;

import com.procedure_spring_service.Store.Procedures;
import com.procedure_spring_service.model.ProcedureInformation;
import org.springframework.stereotype.Repository;

@Repository
public class ProcedureDAO {

    private static Procedures list = new Procedures();

//    temp data
    static {
        list.getProcedureList().add(
                new ProcedureInformation(
                        "1",
                        "Mock Pro1",
                        "Major",
                        "Minor",
                        "$1000",
                        "50")
        );
        list.getProcedureList().add(
                new ProcedureInformation(
                        "2",
                        "Mock Pro2",
                        "Major",
                        "Minor",
                        "$2000",
                        "80")
        );
    }

    public Procedures getAllProcedures() {
        return list;
    }

    public void addProcedure(ProcedureInformation procedureInformation) {
        list.getProcedureList().add(procedureInformation);
    }
}
