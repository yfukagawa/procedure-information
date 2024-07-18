package com.java.procedure_spring_mongo_service;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/procedures")
@AllArgsConstructor
public class ProcedureController {

    private final ProcedureService procedureService;

    @GetMapping
    public List<ProcedureInformation> fetchAllProcedures() {
        return procedureService.getAllProcedures();
    }
}
