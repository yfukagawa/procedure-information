package com.java.procedure_spring_mongo_service;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class ProcedureInformation {
    @Id
    private String id;
    private String procedureId;
    private String name;
    private Categories majorCategory;
    private Categories minorCategory;
    private String annualMax;
    private String deductible;
    private LocalDateTime created;

    public ProcedureInformation(String procedureId,
                                String name,
                                Categories majorCategory,
                                Categories minorCategory,
                                String annualMax,
                                String deductible,
                                LocalDateTime created) {
        this.procedureId = procedureId;
        this.name = name;
        this.majorCategory = majorCategory;
        this.minorCategory = minorCategory;
        this.annualMax = annualMax;
        this.deductible = deductible;
        this.created = created;
    }
}


