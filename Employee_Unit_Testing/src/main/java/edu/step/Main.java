package edu.step;

import edu.step.model.Employee;
import edu.step.model.Gender;
import edu.step.service.EmployeeService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "Joe", LocalDate.of(1961, 5, 17), Gender.MALE, 2300.4343));
        employeeList.add(new Employee(1, "Adam", LocalDate.of(1961, 5, 17), Gender.MALE, 2300.4343));
        employeeList.add(new Employee(2, "Camila", LocalDate.of(1988, 5, 22), Gender.FEMALE, 2189.2));
        employeeList.add(new Employee(3, "Elsa", LocalDate.of(1993, 3, 25), Gender.FEMALE, 1822.31));
        employeeList.add(new Employee(4, "Ben", LocalDate.of(2004, 5, 17), Gender.MALE, 3500.241));
        employeeList.add(new Employee(5, "Alex", LocalDate.of(1978, 1, 7), Gender.MALE, 30000));
        employeeList.add(new Employee(6, "Sandy", LocalDate.of(2000, 5, 27), Gender.FEMALE, 5132.45));
        employeeList.add(new Employee(7, "Zoe", LocalDate.of(2007, 8, 3), Gender.FEMALE, 1200.43));
        employeeList.add(new Employee(8, "Aaron", LocalDate.of(1990, 3, 19), Gender.MALE, 7809.34));

        EmployeeService service = new EmployeeService();

        System.out.println("Average salary: " + service.calculateAverageSalary(employeeList));
        System.out.println("Male: " + service.findMales(employeeList));
        System.out.println("Employee Name: " + service.findNames(employeeList));
        System.out.println("Requested name: " + service.findRequestedName(employeeList, "ZEnda"));
        System.out.println("Unique Birthdate: " + service.findUniqueBirthdate(employeeList));
    }
}
