package com.factoriaf5.rps.models;

public abstract class Figure {
    private String type;

    public Figure(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
