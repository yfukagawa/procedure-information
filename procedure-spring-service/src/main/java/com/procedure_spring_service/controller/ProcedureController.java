package com.procedure_spring_service.controller;

import com.procedure_spring_service.model.ProcedureInformation;
import com.procedure_spring_service.repository.ProceduresRepository;

import java.util.List;

public class ProcedureController {

    private final ProceduresRepository proceduresRepository;

    ProcedureController(ProceduresRepository proceduresRepository) {
        this.proceduresRepository = proceduresRepository;
    }

    List<ProcedureInformation>
}
