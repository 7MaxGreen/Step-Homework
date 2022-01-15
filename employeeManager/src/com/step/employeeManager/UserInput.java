package com.step.employeeManager;
import com.step.data.Gender;


public class UserInput {

    public static String userSetFirstName() {
        System.out.print("Input first name: ");
        String userInput = MyScanner.input.nextLine();
        while(userInput.length()<3) {
            System.out.println("Name should consist of minimum 3 characters");
            userInput = MyScanner.input.nextLine();
        }
        return userInput;
    }

    public static String userSetLastName() {
        System.out.print("Input last name: ");
        String userInput = MyScanner.input.nextLine();
        while(userInput.length()<3) {
            System.out.println("Surname should consist of minimum 3 characters");
            userInput = MyScanner.input.nextLine();
        }
        return userInput;
    }

    public static String userSetIdnp() {
        System.out.print("Input IDNP: ");
        String userInput = MyScanner.input.nextLine();
        while(userInput.length()!=13) {
            System.out.println("IDNP should consist of 13 characters");
            userInput = MyScanner.input.nextLine();
        }
        return userInput;
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
        System.out.print("Input email address: ");
        String userInput = MyScanner.input.nextLine();
        while(!userInput.contains("@")) {
            System.out.println("Email address should contain the /@/ symbol");
            userInput = MyScanner.input.nextLine();
        }
        return userInput;
    }

    public static String userSetStreetName() {
        System.out.print("Input street name: ");
        String userInput = MyScanner.input.nextLine();
        while(userInput.length()<3) {
            System.out.println("Input must contain a minimum of 3 characters");
            userInput = MyScanner.input.nextLine();
        }
        return userInput;
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
        String userInput = MyScanner.input.nextLine();
        while(userInput.length()<3) {
            System.out.println("Input must contain a minimum of 3 characters");
            userInput = MyScanner.input.nextLine();
        }
        return userInput;
    }

    public static String setProfessionName() {
        System.out.print("Input function: ");
        String userInput = MyScanner.input.nextLine();
        while(userInput.length()<5) {
            System.out.println("Input must contain a minimum of 5 characters");
            userInput = MyScanner.input.nextLine();
        }
        return userInput;
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
        Gender gender = Gender.NOT_DEFINED;

        System.out.println("Select the gender (input male or female)");
        String userInput = MyScanner.input.nextLine();

        while(!userInput.equals("male") || !userInput.equals("female")){
            if (userInput.equalsIgnoreCase("male")) {
                return gender.MALE;
            } else if(userInput.equalsIgnoreCase("female")){
                return gender.FEMALE;
            } else {
                System.out.println("Please input MALE or FEMALE");
                userInput = MyScanner.input.nextLine();
            }
        };
        return gender;
    }
}
