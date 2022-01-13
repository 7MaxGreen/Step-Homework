package com.step.data;

public class Employee {

    private String firstName;
    private String lastName;
    private String idnp;
    private double salary;
    private String phoneNumber;
    private String email;
    private Address address;

    private String hireDate;
    private String dismissDate;

    private Department department;
    private Profession profession;

    public Gender gender;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public void setDismissDate(String dismissDate) {
        this.dismissDate = dismissDate;
    }

    public void setAddress(String userStreetName, String userStreetNumber, String userApartNumber, String userHouseNumber) {
        address = new Address();

        address.setStreetName(userStreetName);
        address.setHouseNumber(userStreetNumber);
        address.setStreetNumber(userHouseNumber);
        address.setApartmentNumber(userApartNumber);
    }

    public void setDepartment(String userDepartment) {
        department = new Department();
        department.setName(userDepartment);
    }

    public void setProfession(String userProfession) {
        profession = new Profession();
        profession.setProfessionName(userProfession);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdnp() {
        return idnp;
    }

    public double getSalary() {
        return salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public Department getDepartment() {
        return department;
    }

    public Profession getProfession() {
        return profession;
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getDismissDate() {
        return dismissDate;
    }
}
