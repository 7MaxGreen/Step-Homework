package edu.step.model;

import java.time.LocalDate;
import java.util.Locale;

public class Employee {
    private Integer id;
    private String name;
    private LocalDate birthdate;
    private Gender gender;
    private double salary;

    public Employee(Integer id, String name, LocalDate birthdate, Gender gender, double salary) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.gender = gender;
        this.salary = salary;
    }

    public Employee() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) throws Exception {
        if(id < 0) {
            throw new Exception("Id must be greater than 0");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String value = Character.toString(name.charAt(0)).toUpperCase() + name.substring(1).toLowerCase();
        this.name = value;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) throws Exception {
        if(gender.equals(Gender.MALE) || gender.equals(Gender.FEMALE) || gender.equals(Gender.NOT_DEFINED)){
            this.gender = gender;
        } else {
            throw new Exception("Gender must be selected from the following : Male, Female, NOT_DEFINED");
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) throws Exception {
        if(salary.toString().contains( "[a-zA-Z]+")){
            throw new Exception("Salary must contain only digits");
        }
         this.salary = salary;
    }

}
