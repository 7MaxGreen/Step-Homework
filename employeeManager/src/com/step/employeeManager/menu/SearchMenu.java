package com.step.employeeManager.menu;
import com.step.employeeManager.MyScanner;

public class SearchMenu {

    public static MenuOptions findMenu(){
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
            case 1 : return MenuOptions.BY_NAME;
            case 2 : return MenuOptions.BY_SURNAME;
            case 3 : return MenuOptions.BY_PROFESSION;
            case 4 : return MenuOptions.BY_DEPARTMENT;
            case 5 : return MenuOptions.BY_IDNP;
            case 6 : MainMenu.adminMenu(); break;

            default :
                System.out.println("Choose an option between 1 - 6 ;");
        }
        return MenuOptions.BACK;
    }
}
