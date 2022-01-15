package com.step.employeeManager;
import com.step.data.Employee;
import com.step.employeeManager.menu.MainMenu;

public class EmployeeManager implements Manageable {

    private Employee[] employee = new Employee[100];
    private int counter = 0;
    private String uInput;


    public void add() {
        do {
            employee[counter] = new Employee();

            employee[counter].setFirstName(UserInput.userSetFirstName());
            employee[counter].setLastName(UserInput.userSetLastName());
            employee[counter].setGender(UserInput.userSetGender());
            employee[counter].setIdnp(UserInput.userSetIdnp());
            employee[counter].setPhoneNumber(UserInput.userSetPhoneNumber());
            employee[counter].setEmail(UserInput.userSetEmail());
            employee[counter].setSalary(UserInput.userSetSalary());
            employee[counter].setAddress(UserInput.userSetStreetName(), UserInput.userSetStreetNumber(), UserInput.userSetApartmentNumber(), UserInput.userSetHouseNumber());
            employee[counter].setDepartment(UserInput.userSetDepartment());
            employee[counter].setProfession(UserInput.setProfessionName());
            employee[counter].setHireDate(UserInput.userSetHireDate());
            employee[counter].setDismissDate(UserInput.userSetDismissDate());

            counter++;

            System.out.println("Do you want to add another employee? Press[A] to EXIT or any key to confirm");
        } while (!MyScanner.input.nextLine().equals("A"));

//        MainMenu.adminMenu();
    }

    public void read() {
        System.out.println("c" + counter);
        for (int i = 0; i < counter; i++) {

            System.out.println("Name: " + this.employee[i].getFirstName());
            System.out.println("Surname: " + this.employee[i].getLastName());
            System.out.println("Gender: " + this.employee[i].getGender());
            System.out.println("IDNP: " + this.employee[i].getIdnp());
            System.out.println("Phone number: " + this.employee[i].getPhoneNumber());
            System.out.println("Email: " + this.employee[i].getEmail());
            System.out.println("Wage: " + this.employee[i].getSalary());
            System.out.println("Street: " + this.employee[i].getAddress().getStreetName());
            System.out.println("Number: " + this.employee[i].getAddress().getStreetNumber());
            System.out.println("Apartment: " + this.employee[i].getAddress().getApartmentNumber());
            System.out.println("House: " + this.employee[i].getAddress().getHouseNumber());
            System.out.println("Department: " + this.employee[i].getDepartment().getName());
            System.out.println("Profession: " + this.employee[i].getProfession().getProfessionName());
            System.out.println("Start date: " + this.employee[i].getHireDate());
            System.out.println("Finish date: " + this.employee[i].getDismissDate());
            System.out.println();
        }
//        MainMenu.adminMenu();
    }


    public void editName() {
        System.out.println("Input employee IDNP in order to edit information or press [E] to return to the main MENU");
        uInput = MyScanner.input.nextLine();

        if (uInput.equals("E")) {
            MainMenu.adminMenu();
        } else {
            for (int i = 0; i < counter; i++) {
                if (employee[i].getIdnp().equals(uInput)) {
                    System.out.println("Update name: ");
                    employee[i].setFirstName(MyScanner.input.nextLine());
                } else {
                    System.out.println("Invalid IDNP");
//                    MainMenu.adminMenu();
                }
            }
//            MainMenu.adminMenu();
        }
    }


    public void editSurname() {
        System.out.println("Input employee IDNP in order to edit information or press [E] to return to the main MENU");
        uInput = MyScanner.input.nextLine();
        if (uInput.equals("E")) {
            MainMenu.adminMenu();
        } else {
            for (int i = 0; i < counter; i++) {
                if (employee[i].getIdnp().equals(uInput)) {
                    System.out.println("Update surname: ");
                    employee[i].setLastName(MyScanner.input.nextLine());
                } else {
                    System.out.println("Invalid IDNP");
//                    MainMenu.adminMenu();
                }
            }
//            MainMenu.adminMenu();
        }
    }


    public void editPhone() {
        System.out.println("Input employee IDNP in order to edit information or press [E] to return to the main MENU");
        uInput = MyScanner.input.nextLine();

        if (uInput.equals("E")) {
          MainMenu.adminMenu();
        } else {
            for (int i = 0; i < counter; i++) {
                if (employee[i].getIdnp().equals(uInput)) {
                    System.out.println("Update phone number: ");
                    employee[i].setPhoneNumber(MyScanner.input.nextLine());
                } else {
                    System.out.println("Invalid IDNP");
//                     MainMenu.adminMenu();
                }
            }
//             MainMenu.adminMenu();
        }
    }

    public void editEmail() {
        System.out.println("Input employee IDNP in order to edit information or press [E] to return to the main MENU");
        uInput = MyScanner.input.nextLine();

        if (uInput.equals("E")) {
           MainMenu.adminMenu();
        } else {
            for (int i = 0; i < counter; i++) {
                if (employee[i].getIdnp().equals(uInput)) {
                    System.out.println("Update email: ");
                    employee[i].setEmail(MyScanner.input.nextLine());
                } else {
                    System.out.println("Invalid IDNP");
//                     MainMenu.adminMenu();
                }
            }
//             MainMenu.adminMenu();
        }
    }

    public void editAddress() {
        System.out.println("Input employee IDNP in order to edit information or press [E] to return to the main MENU");
        uInput = MyScanner.input.nextLine();

        if (uInput.equals("E")) {
            MainMenu.adminMenu();
        } else {
            for (int i = 0; i < counter; i++) {
                if (employee[i].getIdnp().equals(uInput)) {
                    System.out.println("Update address: ");
                    String userStreetName = UserInput.userSetStreetName();
                    String userStreetNumber = UserInput.userSetStreetNumber();
                    String userApartNumber = UserInput.userSetApartmentNumber();
                    String userHouseNumber = UserInput.userSetHouseNumber();
                    employee[i].setAddress(userStreetName, userStreetNumber, userApartNumber, userHouseNumber);
                } else {
                    System.out.println("Invalid IDNP");
                    //                    MainMenu.adminMenu();
                }
            }
//             MainMenu.adminMenu();
        }
    }

    public void editDepartment() {
        System.out.println("Input employee IDNP in order to edit information or press [E] to return to the main MENU");
        uInput = MyScanner.input.nextLine();

        if (uInput.equals("E")) {
            MainMenu.adminMenu();
        } else {
            for (int i = 0; i < counter; i++) {
                if (employee[i].getIdnp().equals(uInput)) {
                    System.out.println("Update Department: ");
                    employee[i].setDepartment(MyScanner.input.nextLine());
                } else {
                    System.out.println("Invalid IDNP");
                    //                    MainMenu.adminMenu();
                }
            }
            //            MainMenu.adminMenu();
        }
    }

    public void editProfession() {
        System.out.println("Input employee IDNP in order to edit information or press [E] to return to the main MENU");
        uInput = MyScanner.input.nextLine();

        if (uInput.equals("E")) {
            MainMenu.adminMenu();
        } else {
            for (int i = 0; i < counter; i++) {
                if (employee[i].getProfession().getProfessionName().equals(uInput)) {
                    System.out.println("Update Department: ");
                    employee[i].setProfession(MyScanner.input.nextLine());
                } else {
                    System.out.println("Invalid IDNP");
//                     MainMenu.adminMenu();
                }
            }
//             MainMenu.adminMenu();
        }
    }

    public void editIdnp() {
        System.out.println("Input employee IDNP in order to edit information or press [E] to return to the main MENU");
        uInput = MyScanner.input.nextLine();

        if (uInput.equals("E")) {
            MainMenu.adminMenu();
        } else {
            for (int i = 0; i < counter; i++) {
                if (employee[i].getIdnp().equals(uInput)) {
                    System.out.println("Update IDNP: ");
                    employee[i].setIdnp(MyScanner.input.nextLine());
                } else {
                    System.out.println("Invalid IDNP");
                    //                    MainMenu.adminMenu();
                }
            }
//             MainMenu.adminMenu();
        }
    }

    public void editSalary() {
        System.out.println("Input employee IDNP in order to edit information or press [E] to return to the main MENU");
        uInput = MyScanner.input.nextLine();

        if (uInput.equals("E")) {
            MainMenu.adminMenu();
        } else {
            for (int i = 0; i < counter; i++) {
                if (employee[i].getIdnp().equals(uInput)) {
                    System.out.println("Input updated salary: ");
                    employee[i].setSalary(MyScanner.input.nextDouble());
                } else {
                    System.out.println("Invalid IDNP");
//                     MainMenu.adminMenu();
                }
            }
//             MainMenu.adminMenu();
        }
    }


    public void searchName() {
        System.out.print("Search ");
        String name = MyScanner.input.nextLine();

        for (int i = 0, j = 0; i < counter; i++, j++) {
            if (employee[i].getFirstName().equals(name)) {
                System.out.println("Name: " + employee[i].getFirstName());
                System.out.println("Surname: " + employee[i].getLastName());
                System.out.println("IDNP: " + employee[i].getIdnp());
                System.out.println("Phone number: " + employee[i].getPhoneNumber());
                System.out.println("Email: " + employee[i].getEmail());
                System.out.println("Wage: " + employee[i].getSalary());
                System.out.println("Street: " + employee[i].getAddress().getStreetName());
                System.out.println("Number: " + employee[i].getAddress().getStreetNumber());
                System.out.println("Apartment: " + employee[i].getAddress().getApartmentNumber());
                System.out.println("House: " + employee[i].getAddress().getHouseNumber());
                System.out.println("Department: " + employee[i].getDepartment().getName());
                System.out.println("Profession: " + employee[i].getProfession().getProfessionName());
                System.out.println("Start date: " + employee[i].getHireDate());
                System.out.println("Finish date: " + employee[i].getDismissDate());
            } else {
                System.out.println("Invalid option");
//                 MainMenu.adminMenu();
            }
        }
//         MainMenu.adminMenu();
    }


    public void searchSurname(){
        System.out.print("Search: ");
        String name = MyScanner.input.nextLine();

        for(int i=0; i<counter; i++){
            if(employee[i].getLastName().equals(name)) {

                System.out.println("Name: " + employee[i].getFirstName());
                System.out.println("Surname: " + employee[i].getLastName());
                System.out.println("IDNP: " + employee[i].getIdnp());
                System.out.println("Phone number: " + employee[i].getPhoneNumber());
                System.out.println("Email: " + employee[i].getEmail());
                System.out.println("Wage: " + employee[i].getSalary());
                System.out.println("Street: " + employee[i].getAddress().getStreetName());
                System.out.println("Number: " + employee[i].getAddress().getStreetNumber());
                System.out.println("Apartment: " + employee[i].getAddress().getApartmentNumber());
                System.out.println("House: " + employee[i].getAddress().getHouseNumber());
                System.out.println("Department: " + employee[i].getDepartment().getName());
                System.out.println("Profession: " + employee[i].getProfession().getProfessionName());
                System.out.println("Start date: " + employee[i].getHireDate());
                System.out.println("Finish date: " + employee[i].getDismissDate());
            }
            else {
                System.out.println("Invalid option");
//                 MainMenu.adminMenu();
            }
        }
//         MainMenu.adminMenu();
    }

    public void searchIDNP(){
        System.out.print("Search: ");
        String name = MyScanner.input.nextLine();

        for(int i=0; i<counter; i++){
            if(employee[i].getIdnp().equals(name)) {

                System.out.println("Name: " + employee[i].getFirstName());
                System.out.println("Surname: " + employee[i].getLastName());
                System.out.println("IDNP: " + employee[i].getIdnp());
                System.out.println("Phone number: " + employee[i].getPhoneNumber());
                System.out.println("Email: " + employee[i].getEmail());
                System.out.println("Wage: " + employee[i].getSalary());
                System.out.println("Street: " + employee[i].getAddress().getStreetName());
                System.out.println("Number: " + employee[i].getAddress().getStreetNumber());
                System.out.println("Apartment: " + employee[i].getAddress().getApartmentNumber());
                System.out.println("House: " + employee[i].getAddress().getHouseNumber());
                System.out.println("Department: " + employee[i].getDepartment().getName());
                System.out.println("Profession: " + employee[i].getProfession().getProfessionName());
                System.out.println("Start date: " + employee[i].getHireDate());
                System.out.println("Finish date: " + employee[i].getDismissDate());
            }
            else {
                System.out.println("Invalid option");
//                 MainMenu.adminMenu();
            }
        }
//         MainMenu.adminMenu();
    }

    public void searchDepartment(){
        System.out.print("Search: ");
        String name = MyScanner.input.nextLine();

        for(int i=0; i<counter; i++){
            if(employee[i].getDepartment().getName().equals(name)) {

                System.out.println("Name: " + employee[i].getFirstName());
                System.out.println("Surname: " + employee[i].getLastName());
                System.out.println("IDNP: " + employee[i].getIdnp());
                System.out.println("Phone number: " + employee[i].getPhoneNumber());
                System.out.println("Email: " + employee[i].getEmail());
                System.out.println("Wage: " + employee[i].getSalary());
                System.out.println("Street: " + employee[i].getAddress().getStreetName());
                System.out.println("Number: " + employee[i].getAddress().getStreetNumber());
                System.out.println("Apartment: " + employee[i].getAddress().getApartmentNumber());
                System.out.println("House: " + employee[i].getAddress().getHouseNumber());
                System.out.println("Department: " + employee[i].getDepartment().getName());
                System.out.println("Profession: " + employee[i].getProfession().getProfessionName());
                System.out.println("Start date: " + employee[i].getHireDate());
                System.out.println("Finish date: " + employee[i].getDismissDate());
            }
            else {
                System.out.println("Invalid option");
//                 MainMenu.adminMenu();
            }
        }
//         MainMenu.adminMenu();
    }

    public void searchProfession(){
        System.out.print("Search: ");
        String name = MyScanner.input.nextLine();

        for(int i=0; i<counter; i++){
            if(employee[i].getProfession().getProfessionName().equals(name)) {

                System.out.println("Name: " + employee[i].getFirstName());
                System.out.println("Surname: " + employee[i].getLastName());
                System.out.println("IDNP: " + employee[i].getIdnp());
                System.out.println("Phone number: " + employee[i].getPhoneNumber());
                System.out.println("Email: " + employee[i].getEmail());
                System.out.println("Wage: " + employee[i].getSalary());
                System.out.println("Street: " + employee[i].getAddress().getStreetName());
                System.out.println("Number: " + employee[i].getAddress().getStreetNumber());
                System.out.println("Apartment: " + employee[i].getAddress().getApartmentNumber());
                System.out.println("House: " + employee[i].getAddress().getHouseNumber());
                System.out.println("Department: " + employee[i].getDepartment().getName());
                System.out.println("Profession: " + employee[i].getProfession().getProfessionName());
                System.out.println("Start date: " + employee[i].getHireDate());
                System.out.println("Finish date: " + employee[i].getDismissDate());
            }
            else {
                System.out.println("Invalid option");
//                 MainMenu.adminMenu();
            }
        }
//         MainMenu.adminMenu();
    }


    //An array won't properly delete its object, instead using the index it can replace its value with a null value.
    public void delete() {
        System.out.println("Input employee IDNP in order to delete him from database");
        String userInput = MyScanner.input.nextLine();

        for(int i=0; i<counter; i++){
            if(employee[i].getIdnp().equals(userInput)){
                System.out.println("Are you sure you want to delete the employee" + userInput + "? Press [Y] to confirm or any key to cancel" );
                System.out.println("Name" + employee[i].getFirstName());
                System.out.println("Surname" + employee[i].getLastName());
                System.out.println("IDNP" + employee[i].getIdnp());
                userInput = MyScanner.input.nextLine();
                if(userInput.equalsIgnoreCase("Y")){
                    employee[i] = null;
                } else{
                    MainMenu.adminMenu();
                }
            } else
            {
                System.out.println("The requested IDNP is not registered in the database. Please, check it again!");
//                 MainMenu.adminMenu();
            }
        }
    }
}




