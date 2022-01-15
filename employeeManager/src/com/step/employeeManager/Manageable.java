package com.step.employeeManager;

public interface Manageable {

    void add();
    void read();

    void editName();
    void editSurname();
    void editPhone();
    void editEmail();
    void editDepartment();
    void editProfession();
    void editIdnp();
    void editAddress();
    void editSalary();

    void searchName();
    void searchSurname();
    void searchIDNP();
    void searchDepartment();
    void searchProfession();

    void delete();
}
