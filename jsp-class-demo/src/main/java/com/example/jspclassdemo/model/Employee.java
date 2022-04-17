package com.example.jspclassdemo.model;

import java.time.LocalDate;

public class Employee {

    private Integer id;
    private String firstName;
    private String lastName;
    private String idnp;
    private String phoneNumber;
    private String email;

    private Double salary;

    private LocalDate birthdate;
    private LocalDate hireDate;
    private LocalDate dismissDate;

    private Department department;
    private Address address;
    private Profession profession;
    private Gender gender;


    public Employee(Integer id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public Employee(Integer id, String firstName, String lastName, String idnp, String phoneNumber, String email, Double salary, LocalDate birthdate, LocalDate hireDate, LocalDate dismissDate, Department department, Address address, Profession profession, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idnp = idnp;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
        this.birthdate = birthdate;
        this.hireDate = hireDate;
        this.dismissDate = dismissDate;
        this.department = department;
        this.address = address;
        this.profession = profession;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdnp() {
        return idnp;
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public LocalDate getDismissDate() {
        return dismissDate;
    }

    public void setDismissDate(LocalDate dismissDate) {
        this.dismissDate = dismissDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
