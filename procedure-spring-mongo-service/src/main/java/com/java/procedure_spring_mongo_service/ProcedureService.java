package com.java.procedure_spring_mongo_service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProcedureService {

    private final ProcedureRepository procedureRepository;

    public List<ProcedureInformation> getAllProcedures() {
        return procedureRepository.findAll();
    }
}
