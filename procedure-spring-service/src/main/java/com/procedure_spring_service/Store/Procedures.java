package com.procedure_spring_service.Store;

import com.procedure_spring_service.model.ProcedureInformation;

import java.util.ArrayList;
import java.util.List;

public class Procedures {

    private List<ProcedureInformation> procedureList;

    public List<ProcedureInformation> getProcedureList() {
        if (procedureList == null) {
            procedureList = new ArrayList<>();
        }
        return procedureList;
    }

    public void setProcedureList(List<ProcedureInformation> procedureList) {
        this.procedureList = procedureList;
    }
}
