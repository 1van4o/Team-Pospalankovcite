package com.example.demo.dto;

public class ReportDto {
    private String object;
    private String description;

    public ReportDto(String object, String description) {
        this.object = object;
        this.description = description;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
