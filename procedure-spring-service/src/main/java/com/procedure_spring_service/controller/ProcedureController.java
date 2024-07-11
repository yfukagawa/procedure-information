package com.procedure_spring_service.controller;

import com.procedure_spring_service.DAO.ProcedureDAO;
import com.procedure_spring_service.Store.Procedures;
import com.procedure_spring_service.model.ProcedureInformation;
import com.procedure_spring_service.repository.ProceduresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/procedures")
public class ProcedureController {

    @Autowired
    private ProcedureDAO procedureDAO;

    @GetMapping(
            path = "/",
            produces = "application/json")
    public Procedures getProcedures() {
        return procedureDAO.getAllProcedures();
    }

    @PostMapping(
            path = "/",
            consumes = "application/json",
            produces = "application/json"
    )
    public ResponseEntity<Object> addProcedure(
            @RequestBody ProcedureInformation procedureInformation
    ) {
        String id = procedureDAO
                .getAllProcedures()
                .getProcedureList()
                .size()
                + String.valueOf((int)((Math.random()+1)*10));

        procedureInformation.setId(id);

        procedureDAO.addProcedure(procedureInformation);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(procedureInformation.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
