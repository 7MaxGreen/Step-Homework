package edu.step.manager.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Address {
    private StringProperty streetName;
    private IntegerProperty streetNumber;
    private IntegerProperty houseNumber;
    private IntegerProperty apartmentNumber;

    public Address(String streetName, Integer streetNumber, Integer houseNumber, Integer apartmentNumber) {
        this.streetName = new SimpleStringProperty(streetName);
        this.streetNumber = new SimpleIntegerProperty(streetNumber);
        this.houseNumber = new SimpleIntegerProperty(houseNumber);
        this.apartmentNumber = new SimpleIntegerProperty(apartmentNumber);
    }

    public String getStreetName() {
        return streetName.get();
    }

    public StringProperty streetNameProperty() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName.set(streetName);
    }

    public int getStreetNumber() {
        return streetNumber.get();
    }

    public IntegerProperty streetNumberProperty() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber.set(streetNumber);
    }

    public int getHouseNumber() {
        return houseNumber.get();
    }

    public IntegerProperty houseNumberProperty() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber.set(houseNumber);
    }

    public int getApartmentNumber() {
        return apartmentNumber.get();
    }

    public IntegerProperty apartmentNumberProperty() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber.set(apartmentNumber);
    }
}
