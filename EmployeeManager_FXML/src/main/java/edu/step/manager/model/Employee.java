package edu.step.manager.model;

import javafx.beans.property.*;

import java.time.LocalDate;

public class Employee {

    private IntegerProperty id;
    private StringProperty name;
    private StringProperty surname;
    private ObjectProperty<LocalDate> birthdate;
    private ObjectProperty<Department> departmentObjectProperty;
    private ObjectProperty<Profession> professionObjectProperty;
    private ObjectProperty<Address> addressObjectProperty;
    private ObjectProperty<Gender> gender;
    private StringProperty idnp;


    public Employee(Integer id, String name, String surname, LocalDate birthdate, Department departmentObjectProperty, Profession professionObjectProperty, Address addressObjectProperty, Gender gender, String idnp) {
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name);
        this.surname = new SimpleStringProperty(surname);
        this.birthdate = new SimpleObjectProperty<LocalDate>(birthdate);
        this.departmentObjectProperty = new SimpleObjectProperty<Department>(departmentObjectProperty);
        this.professionObjectProperty = new SimpleObjectProperty<Profession>(professionObjectProperty);
        this.addressObjectProperty = new SimpleObjectProperty<Address>(addressObjectProperty);
        this.gender = new SimpleObjectProperty<Gender>(gender);
        this.idnp = new SimpleStringProperty(idnp);
    }


    public Gender getGender() {
        return gender.get();
    }

    public ObjectProperty<Gender> genderProperty() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender.set(gender);
    }


    public String getIdnp() {
        return idnp.get();
    }

    public StringProperty idnpProperty() {
        return idnp;
    }

    public void setIdnp(String idnp) {
        this.idnp.set(idnp);
    }


    public Department getDepartmentObjectProperty() {
        return departmentObjectProperty.get();
    }

    public ObjectProperty<Department> departmentObjectPropertyProperty() {
        return departmentObjectProperty;
    }

    public void setDepartmentObjectProperty(Department departmentObjectProperty) {
        this.departmentObjectProperty.set(departmentObjectProperty);
    }


    public Profession getProfessionObjectProperty() {
        return professionObjectProperty.get();
    }

    public ObjectProperty<Profession> professionObjectPropertyProperty() {
        return professionObjectProperty;
    }

    public void setProfessionObjectProperty(Profession professionObjectProperty) {
        this.professionObjectProperty.set(professionObjectProperty);
    }


    public Address getAddressObjectProperty() {
        return addressObjectProperty.get();
    }

    public ObjectProperty<Address> addressObjectPropertyProperty() {
        return addressObjectProperty;
    }

    public void setAddressObjectProperty(Address addressObjectProperty) {
        this.addressObjectProperty.set(addressObjectProperty);
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
