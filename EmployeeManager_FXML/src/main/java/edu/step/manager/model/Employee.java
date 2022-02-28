package edu.step.manager.model;

import javafx.beans.property.*;

import java.time.LocalDate;

public class Employee {

    private IntegerProperty id;
    private StringProperty name;
    private StringProperty surname;
    private ObjectProperty<LocalDate> birthdate;

    public Employee(Integer id, String name, LocalDate birthdate) {
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name);
        this.birthdate = new SimpleObjectProperty<LocalDate>(birthdate);
    }

    public Employee(Integer id, String name, String surname) {
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name) ;
        this.surname = new SimpleStringProperty(surname);
    }

    public String getSurname() {
        return surname.get();
    }

    public StringProperty surnameProperty() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname.set(surname);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public LocalDate getBirthdate() {
        return birthdate.get();
    }

    public ObjectProperty<LocalDate> birthdateProperty() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate.set(birthdate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name=" + name +
                ", birthdate=" + birthdate +
                '}';
    }
}
