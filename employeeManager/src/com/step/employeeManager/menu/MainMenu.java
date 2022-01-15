package com.step.employeeManager.menu;
import com.step.employeeManager.MyScanner;


public class MainMenu {


    public static MenuOptions adminMenu(){

        System.out.println("  \n\n\t\t ************  MENU  *********** ");
        System.out.println(" \t\t **                           ** ");
        System.out.println(" \t\t **   1.  Insert Employer     ** ");
        System.out.println(" \t\t **   2.  Show Employee       ** ");
        System.out.println(" \t\t **   3.  Delete Employer     ** ");
        System.out.println(" \t\t **                           ** ");
        System.out.println(" \t\t **       EDIT:               ** ");
        System.out.println(" \t\t **   4.       Salary         ** ");
        System.out.println(" \t\t **   5.       Address        ** ");
        System.out.println(" \t\t **   6.       Department     ** ");
        System.out.println(" \t\t **   7.       Phone number   ** ");
        System.out.println(" \t\t **   8.       Email          ** ");
        System.out.println(" \t\t **   9.       Name           ** ");
        System.out.println(" \t\t **   10.      Surname        ** ");
        System.out.println(" \t\t **   11.      IDNP           ** ");
        System.out.println(" \t\t **                           ** ");
        System.out.println(" \t\t **       FIND:               ** ");
        System.out.println(" \t\t **   12.      By name        ** ");
        System.out.println(" \t\t **   13.      By surname     ** ");
        System.out.println(" \t\t **   14.      By profession  ** ");
        System.out.println(" \t\t **   15.      By department  ** ");
        System.out.println(" \t\t **   16.      By IDNP        ** ");
        System.out.println(" \t\t **                           ** ");
        System.out.println(" \t\t **   0.  Exit                ** ");
        System.out.println(" \t\t **                           ** ");
        System.out.println(" \t\t *******************************");

        System.out.print("Choose an option: " );

        switch (MyScanner.input.nextByte()){

            case 1 : return MenuOptions.INSERT;
            case 2 : return MenuOptions.SHOW;
            case 3 : return MenuOptions.DELETE;
            case 0 : return MenuOptions.EXIT;

            case 9 : return MenuOptions.EDIT_NAME;
            case 10 : return MenuOptions.EDIT_SURNAME;
            case 11 : return MenuOptions.EDIT_IDNP;
            case 7 : return MenuOptions.EDIT_PHONE;
            case 5 : return MenuOptions.EDIT_ADDRESS;
            case 6 : return MenuOptions.EDIT_DEPARTMENT;
            case 8 : return MenuOptions.EDIT_EMAIL;
            case 4 : return MenuOptions.EDIT_SALARY;

            case 12 : return MenuOptions.BY_NAME;
            case 13 : return MenuOptions.BY_SURNAME;
            case 14 : return MenuOptions.BY_PROFESSION;
            case 15 : return MenuOptions.BY_DEPARTMENT;
            case 16 : return MenuOptions.BY_IDNP;

            default :
                System.out.println("Choose an option between 0 - 16");
        }
        return MenuOptions.BACK;
    }

}
