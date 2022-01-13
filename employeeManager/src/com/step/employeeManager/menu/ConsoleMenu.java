package com.step.employeeManager.menu;
import com.step.employeeManager.EmployeeManager;
import com.step.employeeManager.MyScanner;

public class ConsoleMenu {

    private final EmployeeManager em = new EmployeeManager();

    public void mainMenu(){

        System.out.println("  \n\n\t\t ******** ADMIN MENU ********* ");
        System.out.println(" \t\t **                         ** ");
        System.out.println(" \t\t **   1. Insert Employee    ** ");
        System.out.println(" \t\t **   2. Show Employee      ** ");
        System.out.println(" \t\t **   3. Find Employee      ** ");
        System.out.println(" \t\t **   4. Edit Employee      ** ");
        System.out.println(" \t\t **   5. Exit               ** ");
        System.out.println(" \t\t **                         ** ");
        System.out.println(" \t\t *****************************");

        System.out.print("Choose an option: " );

        switch (MyScanner.input.nextByte()){

            case 1 : em.add(); break;
            case 2 : em.read(); break;
            case 4 : editMenu(); break;
            case 3 : searchMenu(); break;
            case 5 : System.exit(0);

            default :
                System.out.println("Choose an option between 1 - 5 ;"); break;
        }
    }


    public void editMenu(){

        System.out.println("  \n\n\t\t ********* EDIT MENU ********** ");
        System.out.println(" \t\t **                          ** ");
        System.out.println(" \t\t **   1. Edit salary         ** ");
        System.out.println(" \t\t **   2. Edit address        ** ");
        System.out.println(" \t\t **   3. Edit department     ** ");
        System.out.println(" \t\t **   4. Edit phone number   ** ");
        System.out.println(" \t\t **   5. Edit email          ** ");
        System.out.println(" \t\t **   6. Edit name           ** ");
        System.out.println(" \t\t **   7. Edit surname        ** ");
        System.out.println(" \t\t **   8. Edit IDNP           ** ");
        System.out.println(" \t\t **   9. Back                ** ");
        System.out.println(" \t\t **                          ** ");
        System.out.println(" \t\t ******************************");

        System.out.print("Choose an option: " );

        switch ( MyScanner.input.nextByte()){
            case 6 : em.editName(); break;
            case 7 : em.editSurname(); break;
            case 8 : em.editIdnp(); break;
            case 4 : em.editPhone(); break;
            case 2 : em.editAddress(); break;
            case 3 : em.editDepartment(); break;
            case 5 : em.editEmail(); break;
            case 1 : em.editSalary(); break;
            case 9 : mainMenu(); break;

            default :
                System.out.println("Choose an option between 1 - 9  ;");
        }

    }

    public void searchMenu(){
        System.out.println("  \n\n\t\t ******* SEARCH MENU ******* ");
        System.out.println(" \t\t **                       ** ");
        System.out.println(" \t\t **   1. By name          ** ");
        System.out.println(" \t\t **   2. By surname       ** ");
        System.out.println(" \t\t **   3. By profession    ** ");
        System.out.println(" \t\t **   4. By department    ** ");
        System.out.println(" \t\t **   5. By IDNP          ** ");
        System.out.println(" \t\t **   6. Back             ** ");
        System.out.println(" \t\t **                       ** ");
        System.out.println(" \t\t ***************************");

        System.out.print("Choose an option: " );

        switch (MyScanner.input.nextByte()){
            case 1 : em.searchName(); break;
            case 2 : em.searchSurname(); break;
            case 3 : em.searchProfession(); break;
            case 4 : em.searchDepartment(); break;
            case 5 : em.searchIDNP(); break;
            case 6 : mainMenu(); break;

            default :
                System.out.println("Choose an option between 1 - 6 ;");
        }
    }

}
