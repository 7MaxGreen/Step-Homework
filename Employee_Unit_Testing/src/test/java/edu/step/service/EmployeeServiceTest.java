package edu.step.service;
import edu.step.model.Employee;
import edu.step.model.Gender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeServiceTest {

    EmployeeService service = new EmployeeService();
    List<Employee> employee = new ArrayList<>();

    @BeforeAll
    public void ListInit(){
        employee.add(new Employee(1, "Joe", LocalDate.of(1961, 5, 17), Gender.MALE, 2300.4343));
        employee.add(new Employee(1, "Adam", LocalDate.of(1961, 5, 17), Gender.MALE, 2300.4343));
        employee.add(new Employee(2, "Camila", LocalDate.of(1988, 5, 22), Gender.FEMALE, 2189.2));
        employee.add(new Employee(3, "Elsa", LocalDate.of(1993, 3, 25), Gender.FEMALE, 1822.31));
    }

    @Test
    public void findMales_regularMales(){
        List<String> newList = service.findMales(employee);
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Joe");
        expectedList.add("Adam");

        Assertions.assertLinesMatch(expectedList, newList );
    }

}
