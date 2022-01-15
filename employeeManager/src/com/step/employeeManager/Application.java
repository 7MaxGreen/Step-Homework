package com.step.employeeManager;
import com.step.employeeManager.menu.*;


public class Application {

    public static void main(String[] args) {

        EmployeeManager emp = new EmployeeManager();

        while(true) {
            switch (MainMenu.adminMenu()) {
                case INSERT: emp.add(); break;
                case SHOW:   emp.read(); break;
                case DELETE: emp.delete(); break;
                case EXIT : System.exit(0);

                case EDIT_NAME:       emp.editName(); break;
                case EDIT_SURNAME:    emp.editSurname(); break;
                case EDIT_IDNP:       emp.editIdnp(); break;
                case EDIT_PHONE:      emp.editPhone(); break;
                case EDIT_ADDRESS:    emp.editAddress(); break;
                case EDIT_DEPARTMENT: emp.editDepartment(); break;
                case EDIT_PROFESSION: emp.editProfession(); break;
                case EDIT_EMAIL:      emp.editEmail(); break;
                case EDIT_SALARY:     emp.editSalary(); break;

                case BY_NAME:       emp.searchName(); break;
                case BY_SURNAME:    emp.searchSurname(); break;
                case BY_PROFESSION: emp.searchProfession(); break;
                case BY_DEPARTMENT: emp.searchDepartment(); break;
                case BY_IDNP:       emp.searchIDNP(); break;
            }
        }
    }
}

