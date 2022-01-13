package com.step.employeeManager.menu;
import com.step.employeeManager.MyScanner;

public class EditMenu {

    public static MenuOptions editMenu(){

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
            case 6 : return MenuOptions.EDIT_NAME;
            case 7 : return MenuOptions.EDIT_SURNAME;
            case 8 : return MenuOptions.EDIT_IDNP;
            case 4 : return MenuOptions.EDIT_PHONE;
            case 2 : return MenuOptions.EDIT_ADDRESS;
            case 3 : return MenuOptions.EDIT_DEPARTMENT;
            case 5 : return MenuOptions.EDIT_EMAIL;
            case 1 : return MenuOptions.EDIT_SALARY;
            case 9 : MainMenu.adminMenu(); break;

            default :
                System.out.println("Choose an option between 1 - 9  ;");
        }
        return MenuOptions.BACK;
    }
}
