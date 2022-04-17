package com.example.jspclassdemo.model;

public class Profession {

    private String professionName;

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    public String getProfessionName() {
        return professionName;
    }

    public Profession(String professionName) {
        this.professionName = professionName;
    }
}