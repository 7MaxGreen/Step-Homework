package edu.step.manager.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Profession {
    private StringProperty professionName;
    private StringProperty skillLevel;

    public Profession(String professionName){
        this.professionName = new SimpleStringProperty(professionName);
    }

    public Profession(String professionName, String skillLevel) {
        this.professionName = new SimpleStringProperty(professionName);
        this.skillLevel = new SimpleStringProperty(skillLevel);
    }

    public String getProfessionName() {
        return professionName.get();
    }

    public StringProperty professionNameProperty() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName.set(professionName);
    }

    public String getSkillLevel() {
        return skillLevel.get();
    }

    public StringProperty skillLevelProperty() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel.set(skillLevel);
    }
}
