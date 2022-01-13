package com.step.employeeManager.menu;
import com.step.employeeManager.MyScanner;


public class MainMenu {
    public static MenuOptions adminMenu(){

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

            case 1 : return MenuOptions.INSERT;
            case 2 : return MenuOptions.SHOW;
            case 4 : EditMenu.editMenu(); break;
            case 3 : SearchMenu.findMenu(); break;
            case 5 : System.exit(0);

            default :
                System.out.println("Choose an option between 1 - 5 ;");
        }
        return MenuOptions.BACK;
    }



//    public static void show(String title, String[] options){
//        // TODO : enum cu optiunile menu-ului;
//    }
}
