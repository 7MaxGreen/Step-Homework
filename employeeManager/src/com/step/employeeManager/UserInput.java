package com.step.employeeManager;
import com.step.data.Gender;
import java.util.Locale;

public class UserInput {

    public static String userSetFirstName() {
        System.out.print("Input first name: ");
        return MyScanner.input.nextLine();
    }

    public static String userSetLastName() {
        System.out.print("Input last name: ");
        return MyScanner.input.nextLine();
    }

    public static String userSetIdnp() {
        System.out.print("Input idnp: ");
        return MyScanner.input.nextLine();
    }

    public static Double userSetSalary() {
        System.out.print("Input salary: ");
        return MyScanner.input.nextDouble();
    }

    public static String userSetPhoneNumber() {
        System.out.print("Input phone number: ");
        return MyScanner.input.nextLine();
    }

    public static String userSetEmail() {
        System.out.print("Input email: ");
        return MyScanner.input.nextLine();
    }

    public static String userSetStreetName() {
        System.out.print("Input street name: ");
        return MyScanner.input.nextLine();
    }

    public static String userSetStreetNumber() {
        System.out.print("Input street number: ");
        return MyScanner.input.nextLine();
    }

    public static String userSetApartmentNumber() {
        System.out.print("Input apartment number: ");
        return MyScanner.input.nextLine();
    }

    public static String userSetHouseNumber() {
        System.out.print("Input house number: ");
        return MyScanner.input.nextLine();
    }

    public static String userSetDepartment(){
        System.out.print("Input department name: ");
        return MyScanner.input.nextLine();
    }

    public static String setProfessionName() {
        System.out.print("Input function: ");
        return MyScanner.input.nextLine();
    }

    public static String userSetHireDate() {
        System.out.print("Input hire date: ");
        return MyScanner.input.nextLine();
    }

    public static String userSetDismissDate() {
        System.out.print("Input dismiss date: ");
        return MyScanner.input.nextLine();
    }

    public static Gender userSetGender(){
        Gender gender = Gender.MALE;

        System.out.println("Select the gender (input male or female)");
        do{
            if (MyScanner.input.nextLine().equalsIgnoreCase("male")) {
                return gender.MALE;
            } else if(MyScanner.input.nextLine().equalsIgnoreCase("female")){
                return gender.FEMALE;
            } else {
                System.out.println("Please input MALE or FEMALE");
            }
        }while(!MyScanner.input.nextLine().equals("male") || !MyScanner.input.nextLine().equals("female"));

        return gender;
    }
}
