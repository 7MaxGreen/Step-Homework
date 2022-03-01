package edu.step.manager.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Department {

    private StringProperty departmentName;

    private IntegerProperty employeeNumbers;

    public Department(String departmentName) {
        this.departmentName = new SimpleStringProperty(departmentName);
    }

    public String getDepartmentName() {
        return departmentName.get();
    }

    public StringProperty departmentNameProperty() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName.set(departmentName);
    }

    public int getEmployeeNumbers() {
        return employeeNumbers.get();
    }

    public IntegerProperty employeeNumbersProperty() {
        return employeeNumbers;
    }

    public void setEmployeeNumbers(int employeeNumbers) {
        this.employeeNumbers.set(employeeNumbers);
    }
}
