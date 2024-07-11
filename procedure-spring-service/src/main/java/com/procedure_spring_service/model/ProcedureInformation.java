package com.procedure_spring_service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("procedureInformation")
public class ProcedureInformation {
    @Id
    private String id;

    private String procedureName;
    private String majorCategory;
    private String minorCategory;
    private String annualMax;
    private String deductible;

    public ProcedureInformation() {}
    public ProcedureInformation(String id, String procedureName, String majorCategory, String minorCategory, String anualMax, String deductible) {
        this.id = id;
        this.procedureName = procedureName;
        this.majorCategory = majorCategory;
        this.minorCategory = minorCategory;
        this.annualMax = anualMax;
        this.deductible = deductible;
    }

    @Override
    public String toString() {
        return "Procedure [id=" + id +
        ", procedureName=" + procedureName +
        ", majorCategory=" + majorCategory +
        ", minorCategory=" + minorCategory +
        ", annualMax=" + annualMax +
        ", deductible=" + deductible + "]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public String getMajorCategory() {
        return majorCategory;
    }

    public void setMajorCategory(String majorCategory) {
        this.majorCategory = majorCategory;
    }

    public String getMinorCategory() {
        return minorCategory;
    }

    public void setMinorCategory(String minorCategory) {
        this.minorCategory = minorCategory;
    }

    public String getAnnualMax() {
        return annualMax;
    }

    public void setAnnualMax(String anualMax) {
        this.annualMax = anualMax;
    }

    public String getDeductible() {
        return deductible;
    }

    public void setDeductible(String deductible) {
        this.deductible = deductible;
    }
}

