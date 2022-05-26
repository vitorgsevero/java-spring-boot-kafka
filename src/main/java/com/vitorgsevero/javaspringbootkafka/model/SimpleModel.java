package com.vitorgsevero.javaspringbootkafka.model;

public class SimpleModel {

    private String field;
    private String secondField;

    public SimpleModel(){}

    public SimpleModel(String field, String secondField) {
        this.field = field;
        this.secondField = secondField;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getSecondField() {
        return secondField;
    }

    public void setSecondField(String secondField) {
        this.secondField = secondField;
    }
}
